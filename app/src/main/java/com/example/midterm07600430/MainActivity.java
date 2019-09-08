package com.example.midterm07600430;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onClickLogin(View v) {
		String username = ((EditText)findViewById(R.id.usernameTextbox)).getText().toString();
		String password = ((EditText)findViewById(R.id.passwordTextbox)).getText().toString();

		Intent intent = new Intent(this, ProfileActivity.class);
		if (username.equalsIgnoreCase("aaa") && password.equals("111")) {
			//student
			intent.putExtra("name", "Kittin Changtong");
			intent.putExtra("goes", "SU");
			intent.putExtra("lives", "Nakhonpathom");
			intent.putExtra("from", "Rayong");
			startActivity(intent);
			finish();
		} else if (username.equalsIgnoreCase("bbb") && password.equals("222")) {
			// teacher
			intent.putExtra("name", "Promlert Lovichit");
			intent.putExtra("goes", "สวนกุหลาบวิทยาลัย");
			intent.putExtra("lives", "กรุงเทพมหานคร");
			intent.putExtra("from", "กรุงเทพมหานคร");
			startActivity(intent);
			finish();
		} else {
			Toast.makeText(this, R.string.loginFail, Toast.LENGTH_SHORT).show();
		}
	}
}
