package com.example.pbuskell.personalizedgreeter;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class BeGreeted extends AppCompatActivity {

    String strUsersName = "";
    String strMiddleName = "";
    String strLastName = "";

    Button btnGreetMe;
    EditText edtxtNameField;
    EditText edtxtMidNameField;
    EditText edtxtLastNameField;
    TextView txtvwGreetingSpace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_greeted);

        btnGreetMe = (Button) findViewById(R.id.btnGreetMe);
        edtxtNameField = (EditText) findViewById(R.id.edtxtNameField);
        edtxtMidNameField = (EditText) findViewById(R.id.edtxtMidNameField);
        edtxtLastNameField = (EditText) findViewById(R.id.edtxtLastNameFIeld);
        txtvwGreetingSpace = (TextView) findViewById(R.id.txtvwGreetingSpace);
    }

    public void greetTheUser(View vw)
    {
        Resources res = getResources();

        strUsersName = edtxtNameField.getText().toString();
        strMiddleName = edtxtMidNameField.getText().toString();
        strLastName = edtxtLastNameField.getText().toString();

        txtvwGreetingSpace.setText(String.format(res.getString(R.string.strGreeting), strUsersName, strMiddleName, strLastName));
    }
}
