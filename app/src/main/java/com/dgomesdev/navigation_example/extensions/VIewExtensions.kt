package com.dgomesdev.navigation_example.extensions

import com.google.android.material.textfield.TextInputLayout

var TextInputLayout.text: String
    get() = editText?.text?.toString() ?: ""
    set(value) {
        editText?.setText(value)
    }

//binding.nameInput.editText?.text.toString()
//name = binding.nameInput.text
