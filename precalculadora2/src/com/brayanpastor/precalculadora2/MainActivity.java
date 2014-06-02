package com.brayanpastor.precalculadora2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public  class MainActivity extends Activity implements OnClickListener {
	private EditText num1,num2;
	private TextView resultado;
	private String numero1, numero2;
	private Button boton_s,boton_r,boton_m,boton_d;
	private double res;
	

	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		num1=(EditText) findViewById(R.id.edt_txt1);
		num2=(EditText) findViewById(R.id.edt_txt2);
		resultado=(TextView) findViewById(R.id.resultado);
		boton_s = (Button)findViewById(R.id.btn_suma);
		boton_s.setOnClickListener(this);
		boton_r = (Button)findViewById(R.id.btn_resta);
		boton_r.setOnClickListener(this);
		boton_m = (Button)findViewById(R.id.btn_multi);
		boton_m.setOnClickListener(this);
		boton_d = (Button)findViewById(R.id.btn_divi);
		boton_d.setOnClickListener(this);
		
		
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
	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		numero1 = num1.getText().toString().trim();		
		numero2 = num2.getText().toString().trim();
		if (numero1.equals("") || numero2.equals("")) {
			Toast.makeText(getApplicationContext(), "INGRESAR VALOR",
					Toast.LENGTH_SHORT).show();

		}else{
		switch(view.getId()){
        case R.id.btn_suma:
        	
        	res = Double.parseDouble(numero1) + Double.parseDouble(numero2);
			String resultados = "la suma de " + numero1 + " y " + numero2
					+ " es =\n" + res;
			resultado.setText(resultados);
			num1.setText("");
			num2.setText("");
			num1.requestFocus();
        break;
        
        case R.id.btn_resta:
        	res = Double.parseDouble(numero1) - Double.parseDouble(numero2);
			String resta_res = "la resta de " + numero1 + " y " + numero2
					+ " es =\n" + res;
			resultado.setText(resta_res);
			num1.setText("");
			num2.setText("");
			num1.requestFocus();
        break;
        
        case R.id.btn_multi:
        	res = Double.parseDouble(numero1) * Double.parseDouble(numero2);
			String multiplicacion_res = "la * de " + numero1 + " y " + numero2
					+ " es =\n" + res;
			resultado.setText(multiplicacion_res);
			num1.setText("");
			num2.setText("");
			num1.requestFocus();
        break;
        
        case R.id.btn_divi:
        	if (Integer.parseInt(numero2) == 0) {
				Toast.makeText(getApplicationContext(),
						"NO EXISTE LA DIVISION ENTRE 0", Toast.LENGTH_SHORT)
						.show();

			}else{
        	res = Double.parseDouble(numero1) / Double.parseDouble(numero2);
			String division_res = "la / de " + numero1 + " y " + numero2
					+ " es =\n" + res;
			resultado.setText(division_res);
			num1.setText("");
			num2.setText("");
			num1.requestFocus();
			}
        break;
		}
    } 
	}
	
	




}
