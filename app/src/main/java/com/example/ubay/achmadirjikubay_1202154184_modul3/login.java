package com.example.ubay.achmadirjikubay_1202154184_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private EditText User, Password;
    private Button Button;

    //String yang berisikan username dan password
    private String username = "EAD";
    private String password = "MOBILE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        User = (EditText) findViewById(R.id.username);
        Password = (EditText) findViewById(R.id.password);
        Button = (Button) findViewById(R.id.btnlogin);



    }

    public void login(View view) {
        if (loginn()) {
            Intent newAct = new Intent(this, mainmenu.class);
            startActivity(newAct);
        } else {
            Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show();
        }


    }
    public boolean loginn(){
        boolean login;
        if (User.getText().toString().equals(username)&&Password.getText().toString().equals(password)){
            login=true;
        }else{
            login=false;
        }
        return login;
    }
}
