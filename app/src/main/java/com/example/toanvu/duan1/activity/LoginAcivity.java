package com.example.toanvu.duan1.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.toanvu.duan1.R;

public class LoginAcivity extends AppCompatActivity {
    EditText editUser,editPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_acivity);
        editUser = findViewById(R.id.editUsername);
        editPass = findViewById(R.id.editPassword);
    }

    public void Login(View view) {
//        String user = editUser.getText().toString();
//        String pass = editPass.getText().toString();

//        if (user.equals("admin") && pass.equals("admin")){
//            Toast.makeText(this, "Thành công", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginAcivity.this,MainActivity.class);
            startActivity(intent);

//        }else{
//            Toast.makeText(this, "Login thất bại", Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(LoginAcivity.this,MainActivity.class);
//            startActivity(intent);
//        }

    }

    public void DangKy(View view) {
    }
}
