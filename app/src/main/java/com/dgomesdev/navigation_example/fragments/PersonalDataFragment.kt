package com.dgomesdev.navigation_example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dgomesdev.navigation_example.databinding.FragmentPersonalDataBinding
import com.dgomesdev.navigation_example.extensions.text
import com.dgomesdev.navigation_example.model.PersonModel

class PersonalDataFragment : Fragment() {

    private var _binding: FragmentPersonalDataBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPersonalDataBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextButton.setOnClickListener {
            val model = PersonModel(
                name = binding.nameInput.text,
                age = binding.ageInput.text.toInt()
            )
            val directions = PersonalDataFragmentDirections.goToAddressFragment(model)
            findNavController().navigate(directions)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}