package com.example.codingchallenge.data.model.type

import com.google.gson.annotations.SerializedName

data class StoryExportResponse(
    @SerializedName("exp")
    val exp: String,
    @SerializedName("school_id")
    val school_id: String,
    @SerializedName("url")
    val url: String,
) : BaseType()