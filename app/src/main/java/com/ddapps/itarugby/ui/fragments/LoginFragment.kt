package com.ddapps.itarugby.ui.fragments


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.ddapps.itarugby.R
import com.ddapps.itarugby.databinding.FragmentLoginBinding
import com.facebook.AccessToken
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginResult
import com.facebook.login.widget.LoginButton
import com.google.firebase.auth.FacebookAuthProvider
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import timber.log.Timber


/**
 *  Fragmento de Login
 *
 *
 */
class LoginFragment : Fragment() {

    private lateinit var callbackManager: CallbackManager
    private lateinit var auth: FirebaseAuth
    private lateinit var facebookLoginButton: LoginButton
    lateinit var dataBase: FirebaseDatabase

    override fun onResume() {
        (activity as AppCompatActivity).supportActionBar?.title = "Login"
        super.onResume()
    }

    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
        auth = FirebaseAuth.getInstance()
    }

    private fun handleFacebookAccessToken(token: AccessToken){
        val credential = FacebookAuthProvider.getCredential(token.token)
        auth.signInWithCredential(credential).addOnCompleteListener { task->
            if (task.isSuccessful) {
                // Sign in com sucesso, mudar para tela home
                view!!.findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
            } else {
                Timber.e( "signInWithCredential:failure ${task.exception}")
                Toast.makeText(context, "Autenticação falhou.", Toast.LENGTH_LONG).show()
                Toast.makeText(context!!, "Erro: ${task.exception}",    Toast.LENGTH_SHORT).show()

            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater,
            R.layout.fragment_login, container, false)
        setHasOptionsMenu(true)
        callbackManager = CallbackManager.Factory.create()
        facebookLoginButton = binding.facebookLoginButton
        facebookLoginButton.fragment = this
        facebookLoginButton.setReadPermissions("email", "public_profile")



        facebookLoginButton.registerCallback(callbackManager, object : FacebookCallback<LoginResult>{

            override fun onSuccess(result: LoginResult?) {
                handleFacebookAccessToken(result!!.accessToken)
            }

            override fun onCancel() {
                Timber.e("facebook: onCancel")
            }

            override fun onError(error: FacebookException?) {
                Toast.makeText(context, "LoginFragment facebook onError : $error", Toast.LENGTH_LONG).show()
            }
        })
        return binding.root
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // passa o activity result de volta ao Facebook SDK
        callbackManager.onActivityResult(requestCode, resultCode, data)
    }


}
