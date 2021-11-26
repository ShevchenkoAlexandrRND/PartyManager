package com.example.partymanagerroom_v10.base.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.partymanagerroom_v10.base.entity.Party

@Dao
interface PartyDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addParty(party: Party)

    @Query("SELECT * FROM party_info ORDER BY idParty ASC")
    fun readAllParty():LiveData<List<Party>>
}