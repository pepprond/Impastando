package com.android.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import androidx.navigation.fragment.findNavController
import com.android.example.myapplication.databinding.ImpastoPizzaBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.Snackbar.SnackbarLayout
import com.google.android.material.snackbar.SnackbarContentLayout



class ImpastoPizza : Fragment() {

    private var _binding: ImpastoPizzaBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = ImpastoPizzaBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonInput.setOnClickListener{
            view ->

            Snackbar.make(binding.buttonInput,"coming soon",Snackbar.LENGTH_LONG).show()
           
        }
        binding.editTextNumberDecimal.doOnTextChanged{text, start, before, count ->
            Log.v("ImpastoPizza","edit text values: text=$text, start=$start, before=$before, count=$count")
        }

    }





    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
