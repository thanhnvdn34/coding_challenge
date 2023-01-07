package com.example.codingchallenge.data.model.type

import com.example.codingchallenge.data.model.ReferenceObjResponese
import com.google.gson.annotations.SerializedName

data class EverydayHealthResponse(
    @SerializedName("activityClass")
    val activityClass: String,
    @SerializedName("activityId")
    val activityId: String,
    @SerializedName("activitySubType")
    val activitySubType: String,
    @SerializedName("activityType")
    val activityType: String,
    @SerializedName("childName")
    val childName: String,
    @SerializedName("endTime")
    val endTime: String,
    @SerializedName("referenceObject")
    val referenceObject: ReferenceObjResponese,
    @SerializedName("remarks")
    val remarks: String,
    @SerializedName("schoolId")
    val schoolId: String,
    @SerializedName("startTime")
    val startTime: String,
) : BaseType()
