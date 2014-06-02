package com.brayanpastor.login;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.brayanpastor.adapters.ListAdapter;
import com.brayanpastor.login.model.Item;

public class NoticiaActivity extends Activity{
	
	private ListView list;
	private ArrayList<Item> items;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_noticia);
		
		list = (ListView) findViewById(R.id.list_noticia);
		items = new ArrayList<Item>();
		items.add(new Item(R.drawable.skype, "Skype","sabe"));
		items.add(new Item(R.drawable.login, "skype","login de prueba, clases de android sabe !!!!!!"));
		items.add(new Item(R.drawable.facebook, "facebook","facebook de prueba, clases de android con sonico999 !!!!!!"));
		ListAdapter adapter = new ListAdapter(this, items);
		list.setAdapter(adapter);
		
		
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
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
