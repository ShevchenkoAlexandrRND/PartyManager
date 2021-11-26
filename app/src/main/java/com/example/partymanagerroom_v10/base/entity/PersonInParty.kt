package com.example.partymanagerroom_v10.base.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "party_guests")
class PersonInParty(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    @ColumnInfo(name = "party_id")
    val idParty:Int,
    @ColumnInfo(name = "person_id")
    val idPerson:Int
)