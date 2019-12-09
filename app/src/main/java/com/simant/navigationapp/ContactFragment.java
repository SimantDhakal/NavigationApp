package com.simant.navigationapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.simant.navigationapp.Modal.Contacts;
import com.simant.navigationapp.adapter.ContactsAdapter;
import java.util.ArrayList;
import java.util.List;

public class ContactFragment extends Fragment {

    View view;
    RecyclerView recyclerView;

    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);

        /* have to create a interface to fetch data from Database */

        // Data listing through Arraylist
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Tom Cruise", "9861169270", R.drawable.tom));
        contactsList.add(new Contacts("Hritik Roshan", "9845216619", R.drawable.hritik));
        contactsList.add(new Contacts("John Snow", "9845427361", R.drawable.john));
        contactsList.add(new Contacts("Tom Cruise", "9861169270", R.drawable.tom));
        contactsList.add(new Contacts("Hritik Roshan", "9845216619", R.drawable.hritik));
        contactsList.add(new Contacts("John Snow", "9845427361", R.drawable.john));
        contactsList.add(new Contacts("Tom Cruise", "9861169270", R.drawable.tom));
        contactsList.add(new Contacts("Hritik Roshan", "9845216619", R.drawable.hritik));
        contactsList.add(new Contacts("John Snow", "9845427361", R.drawable.john));
        contactsList.add(new Contacts("Tom Cruise", "9861169270", R.drawable.tom));
        contactsList.add(new Contacts("Hritik Roshan", "9845216619", R.drawable.hritik));
        contactsList.add(new Contacts("John Snow", "9845427361", R.drawable.john));
        contactsList.add(new Contacts("Tom Cruise", "9861169270", R.drawable.tom));
        contactsList.add(new Contacts("Hritik Roshan", "9845216619", R.drawable.hritik));
        contactsList.add(new Contacts("John Snow", "9845427361", R.drawable.john));
        contactsList.add(new Contacts("Tom Cruise", "9861169270", R.drawable.tom));
        contactsList.add(new Contacts("Hritik Roshan", "9845216619", R.drawable.hritik));
        contactsList.add(new Contacts("John Snow", "9845427361", R.drawable.john));

        ContactsAdapter contactsAdapter = new ContactsAdapter(getActivity(), contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

}
