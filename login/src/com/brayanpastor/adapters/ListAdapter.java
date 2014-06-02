package com.brayanpastor.adapters;

import java.util.ArrayList;

import com.brayanpastor.login.*;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.brayanpastor.login.model.Item;
public class ListAdapter extends BaseAdapter {

		private Context actividad;
		private ArrayList<Item> arrayitems;

		public ListAdapter(Context activity, ArrayList<Item> items) {
			this.actividad = activity;
			this.arrayitems = items;
		}
		
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return arrayitems.size();
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		//creamos una clase viewholder para imagen
		static class ViewHolder
		{
			ImageView imagen;
			TextView titulo;
			TextView subtitulo;
			
			
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ViewHolder viewholder;
			View v = convertView;
			viewholder = new ViewHolder();
			//inflamos el layout
			//
			if (convertView == null) {
				LayoutInflater inf = (LayoutInflater) actividad
						.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				v = inf.inflate(R.layout.noticia, null);
				viewholder.imagen = (ImageView) v.findViewById(R.id.img_noti);
				viewholder.titulo = (TextView) v.findViewById(R.id.txt_noti1);
				viewholder.subtitulo = (TextView) v.findViewById(R.id.txt_noti2);
				
				
				
				v.setTag(viewholder);
			}

			 Item dir = arrayitems.get(position);

			//Rellenamos la información utilizando el ViewHolder
		        viewholder = (ViewHolder) v.getTag();
		        viewholder.imagen.setImageResource(dir.getImagen());
		        viewholder.titulo.setText(dir.getTitulo());
		        viewholder.subtitulo.setText(dir.getSubtitulo());
		        
		        

		        // Retornamos la vista
		        return v;
		}
}
