package com.example.codingchallenge.data.model.type

import com.google.gson.annotations.SerializedName

data class StoryPublishedResponse(
    @SerializedName("publisher_id")
    val publisher_id: String,
    @SerializedName("publisher_name")
    val publisher_name: String,
    @SerializedName("school_id")
    val school_id: String,
    @SerializedName("story_id")
    val story_id: String,
    @SerializedName("story_image")
    val story_image: String,
    @SerializedName("story_name")
    val story_name: String
) : BaseType()
