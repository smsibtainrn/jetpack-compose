package com.smsrn.composepractice.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

/**
 * Created by Sibtain Raza on 5/18/2022.
 * sibtain.raza@10pearls.com
 */

@Dao
interface PersonDao {

    @Query("SELECT * FROM person")
    fun readAll(): Flow<List<Person>>
}