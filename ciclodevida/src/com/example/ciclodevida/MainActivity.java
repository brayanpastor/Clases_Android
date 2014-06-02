package com.example.ciclodevida;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private final static String TAG="Debug";
	private TextView txt_msg; 
	private String mensaje;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txt_msg= (TextView) findViewById(R.id.txt_msg);
		mensaje="Estado: onCreate";
		txt_msg.setText(mensaje);
		Log.e(TAG, mensaje);
		
		Button btn_open=(Button) findViewById(R.id.btn_open);
		Button btn_cerrar=(Button) findViewById(R.id.btn_close);
		btn_open.setOnClickListener(new OpenButtonOnclickListener());
		btn_cerrar.setOnClickListener(new CloseButtonOnclickListener());
		
	}
	
	

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		
		mensaje="Estado: onDestroy";
		txt_msg.setText(mensaje);
		Log.e(TAG, mensaje);
	}



	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		mensaje="Estado: onPause";
		txt_msg.setText(mensaje);
		Log.e(TAG, mensaje);
	}



	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		
		mensaje="Estado: onRestart";
		txt_msg.setText(mensaje);
		Log.e(TAG, mensaje);
	}





	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		mensaje="Estado: onStart";
		txt_msg.setText(mensaje);
		Log.e(TAG, mensaje);
		
	}



	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		mensaje="Estado: onStop";
		txt_msg.setText(mensaje);
		Log.e(TAG, mensaje);
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	class CloseButtonOnclickListener implements OnClickListener
	{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			finish();
		}
		
	}

	class OpenButtonOnclickListener implements OnClickListener
	{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i =new Intent(getApplicationContext(), SecondActivity.class);
			startActivity(i);
			
		}
		
	}

}
