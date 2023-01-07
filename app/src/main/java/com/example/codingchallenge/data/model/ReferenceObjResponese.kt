package com.example.codingchallenge.data.model

import com.google.gson.annotations.SerializedName

data class ReferenceObjResponese(
    @SerializedName("type")
    val type: String,
    @SerializedName("value")
    val value: String
)
