package com.example.madcamp2024wjhnh.data
//import android.net.Uri
//import android.os.Parcelable
//import kotlinx.parcelize.Parcelize
//
//@Parcelize
//data class Travel(
//    val title: String,
//    val place: String,
//    val date: String,
//    val tags: List<String>,
//    val memo: String,
//    val thumbnail: Uri,
//    val Dayinfos: List<DayInfo>
//) : Parcelable

//import androidx.room.Entity
//import androidx.room.PrimaryKey
//import android.net.Uri
//
//@Entity(tableName = "travel_table")
//data class TravelEntity(
//    @PrimaryKey(autoGenerate = true)
//    val id: Int = 0,
//    val title: String,
//    val place: String,
//    val date: String,
//    val tags: List<String>,
//    val memo: String,
//    val thumbnail: Uri
//    val Dayinfos: List<DayInfo>

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Travel(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val place: String,
    val date: String,
    val tags: List<String>,
    val memo: String,
    val thumbnail: String,
    val Dayinfos: List<DayInfo> // List 타입 변환기는 이미 적용된 상태
)