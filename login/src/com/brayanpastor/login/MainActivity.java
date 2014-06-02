package com.brayanpastor.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private static final String usuario="a";
	private static final String clave="a";
	private EditText  user;
	private EditText pass;
	private Button miboton;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//RECUPERAR LOS ID DE LOS EDITEXT 
		user=(EditText) findViewById(R.id.txt_usuario);
		pass=(EditText) findViewById(R.id.txt_clave);
		miboton=(Button) findViewById(R.id.button1);
		
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
		super.onPause();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		
		user.setText("");
		pass.setText("");
		user.requestFocus();
		Toast.makeText(getApplicationContext(), "onRestart", Toast.LENGTH_SHORT).show();
		super.onRestart();
		
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub+
		Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
		super.onResume();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void validar_acceso(View view)
	{
		
		String usuario = user.getText().toString().trim();
		String clave = pass.getText().toString().trim(); 
		miboton.setTextColor(getResources().getColor(R.color.Rojo));
		if(usuario.equals("") || clave.equals(""))
		{
			Toast.makeText(getApplicationContext(), "Ingrese valores", Toast.LENGTH_SHORT).show();
			
		}
		else 
		{
			if(usuario.equals(MainActivity.usuario) && clave.equals(MainActivity.clave))
					{
				
				//codigo para mandar a otra activity
				Intent intent =new Intent(MainActivity.this, PrincipalActivity.class);
				intent.putExtra("usuario", MainActivity.usuario);
				startActivity(intent);
				
				
				
					}
			
		}
		
	}

	

}
