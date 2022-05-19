package com.smsrn.composepractice.di

import android.content.Context
import androidx.room.Room
import com.smsrn.composepractice.data.PersonDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Sibtain Raza on 5/18/2022.
 * sibtain.raza@10pearls.com
 */

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(context, PersonDatabase::class.java, "my_database")
        .createFromAsset("database/person.db").build()

    @Singleton
    @Provides
    fun provideDao(database: PersonDatabase) = database.personDao()
}