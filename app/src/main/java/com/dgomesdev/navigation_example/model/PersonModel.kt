package com.dgomesdev.navigation_example.model

import android.os.Parcelable
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize

@Parcelize
data class PersonModel(
    val name: String = "",
    val age: Int = 0,
    val street: String = "",
    val number: Int = 0
) : Parcelable {
    @IgnoredOnParcel
    val person = "Name: $name, Age: $age"
    @IgnoredOnParcel
    val address = "Street: $street, Number: $number"
}
