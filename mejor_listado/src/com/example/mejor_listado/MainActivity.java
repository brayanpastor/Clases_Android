package com.example.mejor_listado;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends FragmentActivity {
	private static final ArrayList<String> names=new ArrayList<String>();

	public static final String NAME_TAG="name";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText input_name=(EditText) findViewById(R.id.edit_name);
		Button btn_sumit =(Button) findViewById(R.id.btn_submit);
		ListView list=(ListView) findViewById(R.id.list_of_names);
		
		final ArrayAdapter<String> adapter= new ArrayAdapter<String>
		(getApplicationContext(), android.R.layout.simple_list_item_1,names);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				String name =adapter.getItem(arg2);
				if(getResources().getConfiguration().orientation==Configuration.ORIENTATION_PORTRAIT)
				{
				
				
				Intent action=new Intent(getApplicationContext(),NameDetailActivity.class);
				action.putExtra(NAME_TAG, name);
				startActivity(action);
				}else 
				{
					NameDetailFragment frag= (NameDetailFragment)
							getFragmentManager().findFragmentById(R.id.detail_fragment);
					frag.setName(name);
					
				}
			}
		});
		btn_sumit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String name =input_name.getText().toString();
				//Log.e("TAG", name);
				if(!names.contains(names))
				{
					//Log.e("TAG", "nombre agregado");
					names.add(name);
					adapter.notifyDataSetChanged();
					
					
				}
				
			}
		});
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



}
