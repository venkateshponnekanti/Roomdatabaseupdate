package com.example.mytaskdb;

import android.content.Context;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mytaskdb.ViewModel.ContactViewModel;
import com.example.mytaskdb.databinding.FragmentUpdateBinding;
import com.example.mytaskdb.model.Contacts;

public class UpdateFragment extends DialogFragment {
    private Contacts login;
    private Context context;

    private ContactViewModel myViewModel;
    private MyClickHandler3 handler;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentUpdateBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_update, container, false);
        myViewModel = new ViewModelProvider(this).get(ContactViewModel.class);
        login = new Contacts();
        handler=new MyClickHandler3(getContext(),login,myViewModel);
        if (getArguments() != null) {
            String a1 = getArguments().getString("name");
            String a2 = getArguments().getString("email");
            String a3 = String.valueOf(getArguments().getInt("id", -6));
            login.setName(a1);
            login.setEmail(a2);
            login.setId(Integer.parseInt(a3));
            binding.setContact(login);
            binding.setClick(handler);

        }

        return binding.getRoot();
    }


}