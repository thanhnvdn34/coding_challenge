package com.example.codingchallenge.data.model

import com.example.codingchallenge.data.model.type.*
import com.example.codingchallenge.data.util.DateFormat
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import java.util.*


data class UserTimelineResponse(
    @SerializedName("__typename")
    val typename: String,

    @SerializedName("eventDate")
    val eventDateResponse: String,
    var eventDate: Date,

    @SerializedName("eventDescription")
    val eventDescription: String,

    @SerializedName("eventSnapshot")
    val eventSnapshotResponse: String,
    var eventSnapshot: BaseType,

    @SerializedName("eventType")
    val eventTypeResponse: String,
    var eventType: Types,

    @SerializedName("insertedAt")
    val insertedAtResponse: String,
    var insertedAt: Date,
) {
    init {
        eventType = Types.fromType(eventTypeResponse)
        val gson = Gson()
        eventSnapshot = when (eventType) {
            Types.EVERY_DAY_HEALTH -> {
                gson.fromJson(eventSnapshotResponse, EverydayHealthResponse::class.java)
            }
            Types.PORTFOLIO -> {
                gson.fromJson(eventSnapshotResponse, PortfolioResponese::class.java)
            }
            Types.STORY_EXPORTED -> {
                gson.fromJson(eventSnapshotResponse, StoryExportResponse::class.java)
            }
            Types.STORY_PUBLISHED -> {
                gson.fromJson(eventSnapshotResponse, StoryPublishedResponse::class.java)
            }
            Types.EVENT -> {
                gson.fromJson(eventSnapshotResponse, EventResponse::class.java)
            }
            else -> {
                gson.fromJson(eventSnapshotResponse, CheckInOutResponse::class.java)
            }
        }

        eventDate = DateFormat.YYYYMMDD_HYPHEN.parseNotEmpty(eventDateResponse)
        insertedAt = DateFormat.YYYYMMDD_HYPHEN.parseNotEmpty(insertedAtResponse)

    }
}
