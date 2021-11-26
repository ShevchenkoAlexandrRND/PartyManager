package com.example.partymanagerroom_v10.base

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.partymanagerroom_v10.base.dao.PartyDao
import com.example.partymanagerroom_v10.base.dao.PersonDao
import com.example.partymanagerroom_v10.base.entity.Party
import com.example.partymanagerroom_v10.base.entity.Person

@Database(entities = [Party::class, Person::class],version = 1, exportSchema = false)
abstract class PartyDataBase: RoomDatabase() {

    abstract fun partyDao(): PartyDao
    abstract fun personDao(): PersonDao
    companion object{
        @Volatile
        private var INSTANCE: PartyDataBase? = null

        fun getDatabase(context: Context):PartyDataBase{

            val tempInstance = INSTANCE
            if (tempInstance!= null){
                return  tempInstance
            }
            synchronized(this){
             val instance = Room.databaseBuilder(
                 context.applicationContext,
                 PartyDataBase::class.java,
                 "party_manager_database"
             ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}