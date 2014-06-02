package com.llpastorll.constructores;

import android.content.Context;
import android.widget.Toast;

public class Android2 {
	//primer paso que no se pueda instanciar
	private static Android2 inst=null;
	private static Context contexto;
	private Android2()
	{
			
	}
	
	public static Android2 getinst(Context contexto)
	{
		if(inst==null){
			inst=new Android2();
			
		}
		//inicializamos las variables
		Android2.contexto=contexto;
			return inst;	
	}
	
/*	public void setmens(String mensaje)
	{
		Toast.makeText(contexto,, duration)
				
	}
	*/
	
}
