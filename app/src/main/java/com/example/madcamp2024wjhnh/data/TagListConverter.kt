package com.example.madcamp2024wjhnh.data

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TagListConverter {
    @TypeConverter
    fun fromTagList(tags: List<String>): String {
        return Gson().toJson(tags)
    }

    @TypeConverter
    fun toTagList(tagsJson: String): List<String> {
        val type = object : TypeToken<List<String>>() {}.type
        return Gson().fromJson(tagsJson, type)
    }
}