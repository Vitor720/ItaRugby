package com.ddapps.itarugby

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.ddapps.itarugby.databinding.ActivityMainBinding
import com.facebook.AccessToken
import com.google.firebase.auth.FirebaseAuth
import timber.log.Timber


/** @author: Vitor Vieira
 * @version: 1.6.1
 *
 *Aplicativo para gerenciamento de equipes de esporte
 *Navegação do aplicativo segue os padrões do Android JetPack, apenas uma activity.
 */

class MainActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private var accessToken: AccessToken? = null
    private lateinit var auth: FirebaseAuth


    override fun onStart() {
        super.onStart()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val navController = this.findNavController(R.id.myNavHostFragment)
        secureLogin()

        drawerLayout = binding.drawerLayout
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
        NavigationUI.setupWithNavController(binding.navView, navController)

        // Lamdba para que o navDrawer só apareça no home
        navController.addOnNavigatedListener { nc: NavController, nd: NavDestination ->
            if (nd.id == nc.graph.startDestination) {
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
            } else {
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
            }
        }

        // Lambda para retirar actionbar do fragmento de login
        // (low) ta bem estranho, trocar no futuro
        navController.addOnNavigatedListener { _, destination ->
            if (destination.id == R.id.loginFragment){
                val actionBar = supportActionBar
                        actionBar?.hide()
            } else {
                val actionBar = supportActionBar
                actionBar?.show()
            }
        }

    }

    fun setActionBarTitle(title: String) {
        supportActionBar!!.title = title
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)
        return NavigationUI.navigateUp(drawerLayout, navController)
    }

    private fun secureLogin(){
        Timber.i("Chegou no secure login")
        Timber.e("Acess está ${AccessToken.getCurrentAccessToken()}")
        if (!AccessToken.isCurrentAccessTokenActive()){


            findNavController(R.id.myNavHostFragment).navigate(R.id.action_homeFragment_to_loginFragment)

        } else {
            Timber.e("P")
        }


    }


}




