package com.example.madcamp2024wjhnh.data

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class DayInfoListConverter {
    @TypeConverter
    fun fromDayInfoList(dayInfos: List<DayInfo>): String {
        return Gson().toJson(dayInfos)
    }

    @TypeConverter
    fun toDayInfoList(dayInfosJson: String): List<DayInfo> {
        val type = object : TypeToken<List<DayInfo>>() {}.type
        return Gson().fromJson(dayInfosJson, type)
    }
}