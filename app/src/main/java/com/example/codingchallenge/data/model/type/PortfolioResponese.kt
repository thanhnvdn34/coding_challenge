package com.example.codingchallenge.data.model.type

import com.example.codingchallenge.data.model.ReferenceObjResponese
import com.google.gson.annotations.SerializedName

data class PortfolioResponese(
    @SerializedName("albumId")
    val albumId: String,
    @SerializedName("albumName")
    val albumName: String,
    @SerializedName("caption")
    val caption: String,
    @SerializedName("childId")
    val childId: String,
    @SerializedName("childName")
    val childName: String,
    @SerializedName("fileId")
    val fileId: String,
    @SerializedName("imageUrl")
    val imageUrl: String,
    @SerializedName("referenceObj")
    val referenceObj: ReferenceObjResponese,
    @SerializedName("schoolId")
    val schoolId: String,
    @SerializedName("schoolName")
    val schoolName: String,
    @SerializedName("teacherName")
    val teacherName: String
) : BaseType()