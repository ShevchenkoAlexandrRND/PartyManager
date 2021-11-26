package com.example.partymanagerroom_v10.repository

import androidx.lifecycle.LiveData
import com.example.partymanagerroom_v10.base.entity.Party
import com.example.partymanagerroom_v10.base.dao.PartyDao
import com.example.partymanagerroom_v10.base.entity.Person
import com.example.partymanagerroom_v10.base.dao.PersonDao

class PartyRepository(private val partyDao: PartyDao, private val personDao: PersonDao) {
    val readAllPerson : LiveData<List<Person>> = personDao.reaAllPerson()
    val readAllParty : LiveData<List<Party>> = partyDao.readAllParty()

    suspend fun addPerson(person: Person){
        personDao.addPerson(person)
    }

    suspend fun addParty(party: Party){
        partyDao.addParty(party)
    }
}