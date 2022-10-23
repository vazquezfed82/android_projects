package com.example.testingnavigation.Entities

import android.os.Parcel
import android.os.Parcelable

class Dato(param1 : String) : Parcelable {

    var nombre: String

    init{
        this.nombre = param1
    }

    constructor(parcel: Parcel) : this(parcel.readString().toString())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Dato> {
        override fun createFromParcel(parcel: Parcel): Dato {
            return Dato(parcel)
        }

        override fun newArray(size: Int): Array<Dato?> {
            return arrayOfNulls(size)
        }
    }


}