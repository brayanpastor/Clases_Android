package com.brayanpastor.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PrincipalActivity extends Activity {
private String usuario;	

private ListView lista;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
		
		lista=(ListView) findViewById(R.id.listaprincipal);
		
		//enviar lista
		String[] item =new String[]{"menu", "Noticia","compartir","salir","correo","login","ubicacion","registrate","enviar","opciones","opiniones"};
		ArrayAdapter<String> adapter=new ArrayAdapter<String>
		(this,android.R.layout.simple_list_item_activated_1,item);
		lista.setAdapter(adapter);
		lista.setOnItemClickListener(new OnItemClickListener() {

		
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), arg2+"" ,Toast.LENGTH_SHORT ).show();
				Intent intent=null;
				switch(arg2){
				
		        case 0:
		        	intent =new Intent(PrincipalActivity.this, MenuActivity.class);

				break;
		        case 1:
		        	
		        	intent =new Intent(PrincipalActivity.this, NoticiaActivity.class);
				break;
				
		        default:
		        	
		        break;
		       
				}
				  startActivity(intent);
			}
		});
		
		Bundle bundle=getIntent().getExtras();//envio del extra
		usuario= bundle.getString("usuario");
		
		
		
		getActionBar().setTitle("Bienvenido "+ usuario );//cambiar el titulo 
		getActionBar().setSubtitle("usuario activo");//cambiar subtitulo
		Toast.makeText(getApplicationContext(), "Bienvenido "+ usuario, Toast.LENGTH_SHORT).show();
	}


	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.principal, menu);
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



}
