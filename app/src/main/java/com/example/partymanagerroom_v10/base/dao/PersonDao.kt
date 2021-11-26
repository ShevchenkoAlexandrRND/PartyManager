package com.example.partymanagerroom_v10.base.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.partymanagerroom_v10.base.entity.Person


@Dao
interface PersonDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addPerson(person: Person)

    @Query("SELECT * FROM party_person ORDER BY secondName ASC")
    fun reaAllPerson():LiveData<List<Person>>
}