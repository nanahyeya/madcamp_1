package com.example.madcamp2024wjhnh.data

//import androidx.room.Dao
//import androidx.room.Insert
//import androidx.room.Query
//
//@Dao
//interface TravelDao {
//    @Insert
//    suspend fun insertTravel(travel: Travel)
//
//    @Query("SELECT * FROM travel_table")
//    suspend fun getAllTravels(): List<Travel>
//}

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface TravelDao {

    @Query("SELECT * FROM Travel")
    fun getAllTravels(): Flow<List<Travel>>

    @Insert
    suspend fun insertTravel(travel: Travel) // Travel은 @Entity로 선언된 클래스여야 함
}