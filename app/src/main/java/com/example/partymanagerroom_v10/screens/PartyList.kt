package com.example.partymanagerroom_v10.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.partymanagerroom_v10.R


class PartyList : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_party_list, container, false)

        val fab:View = view.findViewById(R.id.fab)
        fab.setOnClickListener {
            findNavController().navigate(R.id.action_partyList_to_addParty2)
        }


        return view
    }


}
