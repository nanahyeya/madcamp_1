package com.example.madcamp2024wjhnh.data

//class TravelRepository(private val travelDao: TravelDao) {
//    suspend fun insertTravel(travel: Travel) = travelDao.insertTravel(travel)
//    suspend fun getAllTravels() = travelDao.getAllTravels()
//}

class TravelRepository(private val travelDao: TravelDao) {

    fun getAllTravels(): Flow<List<Travel>> {
        return travelDao.getAllTravels()
    }

    suspend fun insertTravel(travel: Travel) {
        travelDao.insertTravel(travel)
    }
}