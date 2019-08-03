package com.ddapps.itarugby.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil

import com.ddapps.itarugby.R
import com.ddapps.itarugby.databinding.FragmentTrophyRegisterBinding
import com.ddapps.itarugby.models.Trophy
import com.google.firebase.firestore.FirebaseFirestore
import timber.log.Timber
import java.util.HashMap

/**
 * Fragmento para registrar troféus no banco de dados.
 *
 */

class TrophyRegisterFragment : Fragment() {
    private var dataBase: FirebaseFirestore? = FirebaseFirestore.getInstance()

    private lateinit var trophyNameEditText: EditText
    private lateinit var trophyDateEditText: EditText
    private lateinit var trophyDescriptionEditText: EditText
    private lateinit var trophyPositionEditText: EditText
    private lateinit var trophyImage1EditText: EditText
    private lateinit var trophyImage2EditText: EditText
    private lateinit var trophyImage3EditText: EditText
    private lateinit var trophyImage4EditText: EditText
    private lateinit var trophyImage5EditText: EditText
    private lateinit var fileName: EditText

    private lateinit var binding: FragmentTrophyRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_trophy_register, container, false)

        trophyNameEditText = binding.trophyNameRegister
        trophyDateEditText = binding.trophyDateRegister
        trophyDescriptionEditText = binding.trophyDescriptionRegister
        trophyPositionEditText = binding.trophyPositionRegister
        trophyImage1EditText = binding.trophyImage1
        trophyImage2EditText = binding.trophyImage2
        trophyImage3EditText = binding.trophyImage3
        trophyImage4EditText = binding.trophyImage4
        trophyImage5EditText = binding.trophyImage5
        fileName = binding.fileName

        binding.trophyRegister.setOnClickListener {

            val newTrophy = Trophy()
            val imageMap = HashMap<String, String>()
            newTrophy.trophyName = trophyNameEditText.text.toString()
            newTrophy.trophyDate = trophyDateEditText.text.toString()
            newTrophy.trophyDescription = trophyDescriptionEditText.text.toString()
            newTrophy.trophyPosition = trophyPositionEditText.text.toString().toInt()

            imageMap["0"] = trophyImage1EditText.text.toString()
            imageMap["1"] = trophyImage2EditText.text.toString()
            imageMap["2"] = trophyImage3EditText.text.toString()
            imageMap["3"] = trophyImage4EditText.text.toString()
            imageMap["4"] = trophyImage5EditText.text.toString()


            newTrophy.trophyImage = imageMap

            newTrophy.fileName = fileName.text.toString()
            setData(newTrophy)
        }


        return binding.root
    }

    private fun setData(newTrophy: Trophy) {

        try {
            dataBase?.collection("trophys")?.document(fileName.text.toString())?.set(newTrophy)?.addOnCompleteListener {
                if (it.isSuccessful){
                    Toast.makeText(context!!, "Troféu Cadastrado!.", Toast.LENGTH_LONG).show()
                    clearFields()
                    Timber.e("deu certo")
                } else {
                    Toast.makeText(context!!, "Cadastro não efetuado, verificar conexão", Toast.LENGTH_LONG).show()
                }
            }
        } catch (e: Exception){
//            Toast.makeText(context!!, "Favor inserir o nome do jogador para cadastro.", Toast.LENGTH_LONG).show()
            Timber.e("O erro é:$e")
        }    }

    private fun clearFields(){
        trophyNameEditText.setText("")
        trophyDateEditText.setText("")
        trophyDescriptionEditText.setText("")
        trophyPositionEditText.setText("")
        trophyImage1EditText.setText("")
        trophyImage2EditText.setText("")
        trophyImage3EditText.setText("")
        trophyImage4EditText.setText("")
        trophyImage5EditText.setText("")
        fileName.setText("")
    }

    override fun onResume() {
        (activity as AppCompatActivity).supportActionBar?.title = "Cadastro de Troféu"
        super.onResume()
    }


}
