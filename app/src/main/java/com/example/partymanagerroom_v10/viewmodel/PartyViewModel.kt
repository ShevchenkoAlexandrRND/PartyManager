package com.example.partymanagerroom_v10.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.partymanagerroom_v10.base.PartyDataBase
import com.example.partymanagerroom_v10.base.entity.Party
import com.example.partymanagerroom_v10.base.entity.Person
import com.example.partymanagerroom_v10.repository.PartyRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PartyViewModel(application: Application):AndroidViewModel (application){

    private val readAllParty: LiveData<List<Party>>
    private val readAllPerson: LiveData<List<Person>>
    private val repository: PartyRepository

    init{
        val partyDao = PartyDataBase.getDatabase(application).partyDao()
        val personDao = PartyDataBase.getDatabase(application).personDao()
        repository = PartyRepository(partyDao,personDao)
        readAllParty = repository.readAllParty
        readAllPerson = repository.readAllPerson

    }

    fun addPerson(person: Person){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addPerson(person)
        }
    }

    fun addParty(party: Party){
        viewModelScope.launch(Dispatchers.IO) {
           repository.addParty(party)

        }
    }
}