package com.example.mytaskdb.model;

import androidx.databinding.Bindable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "contact_table")
public class Contacts {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "login_id")
    private int id;


    @ColumnInfo(name = "login_name")
    private String name;

    @ColumnInfo(name = "login_email")
    private String email;

    public Contacts(String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Contacts() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

