package com.example.codingchallenge.data.model.type

enum class Types(val typeName: String) {

    EVENT("event"),
    EVERY_DAY_HEALTH("everydayHealth"),
    CHECK_OUT("checkOut"),
    CHECK_IN("checkIn"),
    PORTFOLIO("portfolio"),
    STORY_EXPORTED("story_exported"),
    STORY_PUBLISHED("story_published");
    companion object {

        fun fromType(type: String) = values()
            .find { it.typeName == type } ?: EVENT

        val tabs = listOf(
            EVENT,
            EVERY_DAY_HEALTH,
            CHECK_OUT,
            CHECK_IN,
            PORTFOLIO,
            STORY_EXPORTED,
            STORY_PUBLISHED
        )
    }
}