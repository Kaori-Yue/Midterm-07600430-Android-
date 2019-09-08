package com.example.midterm07600430;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile);

		Intent intent = getIntent();
		String nameValue = intent.getStringExtra("name");
		String goesValue = intent.getStringExtra("goes");
		String livesValue = intent.getStringExtra("lives");
		String fromValue = intent.getStringExtra("from");

		String welcomeText = getString(R.string.loginSuccessFragment) + " " + nameValue;
		Toast.makeText(this, welcomeText, Toast.LENGTH_SHORT).show();

		// set content
		TextView name = findViewById(R.id.name);
		name.setText(nameValue);

		TextView goes = findViewById(R.id.goesText);
		goes.setText(goesValue);

		TextView lives = findViewById(R.id.livesText);
		lives.setText(livesValue);

		TextView from = findViewById(R.id.fromText);
		from.setText(fromValue);
	}
}
