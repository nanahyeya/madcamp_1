package com.example.madcamp2024wjhnh.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Travel::class], version = 1, exportSchema = false)
@TypeConverters(TagListConverter::class) // List<String> 변환기
abstract class TravelDatabase : RoomDatabase() {
    abstract fun travelDao(): TravelDao
}

@Database(entities = [Travel::class], version = 1, exportSchema = false)
@TypeConverters(TagListConverter::class, DayInfoListConverter::class)
abstract class TravelDatabase : RoomDatabase() {
    abstract fun travelDao(): TravelDao
}
