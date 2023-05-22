package com.grozziie.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class TestingTestActivity extends AppCompatActivity   implements AdapterView.OnItemSelectedListener {
Spinner targetios,getmainresulttarget;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing_test);
        targetios=findViewById(R.id.targetios);
        targetios.setOnItemSelectedListener(this);

        String[] textSizes = getResources().getStringArray(R.array.demo1);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, textSizes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        targetios.setAdapter(adapter);
        //getTarget amd it showing result

        getmainresulttarget=findViewById(R.id.getmainresulttarget);
        getmainresulttarget.setOnItemSelectedListener(TestingTestActivity.this);
        String[] maintext = getResources().getStringArray(R.array.demo1);
        ArrayAdapter  mainadapter =  new ArrayAdapter(TestingTestActivity.this,android.R.layout.simple_list_item_1,maintext);
        mainadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        getmainresulttarget.setAdapter(mainadapter);


    }
    String getParent;

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
if (parent.getId() == R.id.targetios) {
    getParent = parent.getItemAtPosition(position).toString();
    Toast.makeText(this, ""+getParent, Toast.LENGTH_SHORT).show();
}
    else    if (parent.getId() == R.id.getmainresulttarget) {
            getParent = parent.getItemAtPosition(position).toString();
            Toast.makeText(this, ""+getParent, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}