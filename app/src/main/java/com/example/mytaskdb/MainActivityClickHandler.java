package com.example.mytaskdb;

import android.content.Context;
import android.content.Intent;
import android.view.View;

 class MainactivityCilckHandler {
    Context context;

    public MainactivityCilckHandler(Context context) {
        this.context = context;
    }
    public void fabclicked(View view){
        Intent intent=new Intent(view.getContext(), MainActivity2.class);
        context.startActivity(intent);
    }
}
