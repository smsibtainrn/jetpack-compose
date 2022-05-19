package com.smsrn.composepractice.data

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by Sibtain Raza on 5/18/2022.
 * sibtain.raza@10pearls.com
 */

@Database(entities = [Person::class], version = 1, exportSchema = true)
abstract class PersonDatabase : RoomDatabase() {
    abstract fun personDao(): PersonDao
}