package com.example.partymanagerroom_v10.base.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "party_info")
data class Party (
    @PrimaryKey(autoGenerate = true)
    val idParty:Int,
    val Name:String,
    val discription:String,
    val guests:Int,
    val place:String,
    val data:String
)
