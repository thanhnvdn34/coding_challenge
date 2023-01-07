package com.example.codingchallenge.data.util

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Locale
import java.util.Date

enum class DateFormat(private val format: String) {

    DATE_CALENDAR("d"),
    DAYOFWEEK("E 曜日"),
    MD_DAYOFWEEK_JP("M月d日（E)"),
    YYYYMD_JP("yyyy年M月d日"),
    YYYYMMDD("yyyy/MM/dd"),
    YYYYMMDD_DOT("yyyy.MM.dd"),
    MMDD_DOT("MM.dd"),
    YYYYMM("yyyy/MM"),
    YYYY("yyyy"),
    MMDD("MM/dd"),
    MMDDHHMM("MM/dd HH:mm"),
    MMDD_HYPHEN("MM-dd"),
    YYYYMMDD_HYPHEN("yyyy-MM-dd"),
    PROFILE_DATE_FORMAT("yyyy-MM-dd_HH"),
    HH_MM("HH:mm"),
    DAYOFWEEK_JP("E"),
    YYYYMMDD_HHMMSS("yyyy/MM/dd HH:mm:ss");

    @JvmOverloads
    fun format(date: Date, locale: Locale = Locale("vi" ,"VN")): String {
        return SimpleDateFormat(format, locale).format(date)
    }

    @JvmOverloads
    fun format(millis: Long, locale: Locale = Locale("vi" ,"VN")): String {
        return SimpleDateFormat(format, locale).format(millis)
    }

    @JvmOverloads
    fun parse(date: String, locale: Locale = Locale("vi" ,"VN")): Date? {
        return try {
            SimpleDateFormat(format, locale).parse(date)
        } catch (e: ParseException) {
            null
        }
    }

    @JvmOverloads
    fun parseNotEmpty(date: String, locale: Locale = Locale.JAPAN): Date {
        return parse(date, locale) ?: Date()
    }
}
