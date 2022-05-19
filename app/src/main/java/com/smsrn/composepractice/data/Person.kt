package com.smsrn.composepractice.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Sibtain Raza
 * sibtain.raza@10pearls.com
 */

@Entity(tableName = "person")
data class Person(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int,
)