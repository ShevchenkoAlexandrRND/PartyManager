package com.example.partymanagerroom_v10.base.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.partymanagerroom_v10.base.entity.PersonInParty

@Dao
interface PersonInPartyDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addguests(personInParty: PersonInParty)

   @Query("SELECT party_person.firstName, party_person.secondName FROM party_person,party_guests,party_info WHERE person_id = id AND idParty = (:uid) ORDER BY secondName ASC")
   fun AllGuests(uid:String): LiveData<List<PersonInParty>>

}