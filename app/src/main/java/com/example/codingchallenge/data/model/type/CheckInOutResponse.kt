package com.example.codingchallenge.data.model.type

import com.google.gson.annotations.SerializedName

data class CheckInOutResponse(
    @SerializedName("checkinThumb")
    val checkinThumb: String,
    @SerializedName("checkinUrl")
    val checkinUrl: String,
    @SerializedName("msgParams")
    val msgParams: MsgParams,
    @SerializedName("referenceObj")
    val referenceObj: String,
    @SerializedName("schoolId")
    val schoolId: String
) : BaseType()

data class MsgParams(
    @SerializedName("attendanceRecordId")
    val attendanceRecordId: String,
    @SerializedName("checkInDate")
    val checkInDate: String,
    @SerializedName("childName")
    val childName: String,
    @SerializedName("rawCheckInDate")
    val rawCheckInDate: String,
    @SerializedName("schoolName")
    val schoolName: String,
)

