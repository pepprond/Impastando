package com.android.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.android.example.myapplication.databinding.MenuImpastiBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class MenuImpasti : Fragment() {

    private var _binding: MenuImpastiBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = MenuImpastiBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageButtonFrolla.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_impastoFrolla)
        }

        binding.imageButtonpizza.setOnClickListener {
            findNavController().navigate(R.id.action_MenuImpasti_to_ImpastoPizza)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}