package com.example.listaaja;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddItemActivity extends AppCompatActivity {

    private EditText txtItemmName;

    private String nimi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        txtItemmName = findViewById(R.id.txtItemmName);

    }
    public void addItem(View view) {
        nimi = String.valueOf((txtItemmName.getText()));
        Storage.getInstance().addItem(new Item(nimi));
    }

    //public void listStudent(View view) {
        //nimi = String.valueOf((txtStdName.getText()));
        //Storage.getInstance().addStudent(new Item(nimi));
    //}
}