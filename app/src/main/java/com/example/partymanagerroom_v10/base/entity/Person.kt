package com.example.partymanagerroom_v10.base.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "party_person")
class Person (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val firstName:String,
    val secondName:String,
    val phoneNumber:String,
    val emaiLAdr:String
)