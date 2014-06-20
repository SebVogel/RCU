package com.vantagevtrcu;


import com.vantagevtrcu.R;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class settingsActivity extends Activity {

	

	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);
		TextView port = (TextView)findViewById(R.id.txtf_port);
		EditText ip = (EditText) findViewById(R.id.txtf_ip_adresse);
		port.setText("33180");
		SharedPreferences ip_2 = getSharedPreferences("prefs", MODE_PRIVATE);
		String ausgabe = ip_2.getString("ip", "0.0.0.0");
		ip.setText(ausgabe);
		
		
		
		
	}

	final int port = 33180;
	 
	 public void txtfClick(View v){
	EditText ip = (EditText) findViewById(R.id.txtf_ip_adresse);
	String eingabe = ip.getText().toString();
	SharedPreferences ip_1 = getSharedPreferences("prefs", MODE_PRIVATE);
	SharedPreferences.Editor editor = ip_1.edit();
	editor.putString("ip", eingabe);
	editor.putInt("port", port);
	editor.commit();
			}
		
	 
	 

	 
	public void backClick(View v){
	 // Button b = (Button)findViewById(R.id.btn_back);
	startActivity(new Intent(this, MainActivity.class));
	finish();
	}
	

	
}
	
	
	
	
	
	
	 
	 

	
