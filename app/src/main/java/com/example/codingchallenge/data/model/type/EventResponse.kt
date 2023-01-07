package com.example.codingchallenge.data.model.type

import com.google.gson.annotations.SerializedName

data class EventResponse(
    @SerializedName("childId")
    val childId: String,
    @SerializedName("childName")
    val childName: String,
    @SerializedName("eventDate")
    val eventDate: String,
    @SerializedName("eventTitle")
    val eventTitle: String
) : BaseType()
