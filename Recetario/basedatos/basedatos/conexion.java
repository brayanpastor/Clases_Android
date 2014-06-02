package basedatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class conexion extends config {
	
	
	private static final String N_BD = "recetario";
	private static final int VERSION_BD = 1;
	private BDHelper nHelper;
	public final Context nContexto;
	private SQLiteDatabase nBD;
	
	
	
	private static class BDHelper extends SQLiteOpenHelper {
		public BDHelper(Context context) {
			super(context, N_BD, null, VERSION_BD);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// se crea una sola vez para crear la base datos.. si esta creado ya no lo vuelve a crear
			
			//TABLA INGREDIENTES
			db.execSQL("CREATE TABLE " + TABLA_INGREDIENTE + "(" + 
					ID_INGREDIENTES + " INTEGER PRIMARY KEY, " + 
					I_DESCRIPCION + " TEXT);");
						
			db.execSQL("CREATE TABLE " + TABLA_RECETA + "(" + 
					ID_RECETAS + " INTEGER PRIMARY KEY, " + 
					R_DURACION + " NUMERIC," + 
					R_DESCRIPCION + " TEXT);");
			
			db.execSQL("CREATE TABLE " + TABLA_UNIDADMEDIDA + "(" + 
					ID_UNIDADMEDIDA + " INTEGER PRIMARY KEY, " + 
					U_DESCRIPCION + " TEXT);");
			
			db.execSQL("CREATE TABLE " + TABLA_DETALLE + "(" + 
					ID_DETALLE + " INTEGER PRIMARY KEY, " + 
					D_INGREDIENTES + " INTEGER, " + 
					D_PRECIO + " NUMERIC, " + 
					D_RECETAS + " INTEGER, " + 
					D_UNIDADMEDIDA + " INTEGER, " + 
					D_CANTIDAD + " NUMERIC);");
			


		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
			db.execSQL("DROP TABLE IF EXISTS " + TABLA_INGREDIENTE);
			db.execSQL("DROP TABLE IF EXISTS " + TABLA_RECETA);
			db.execSQL("DROP TABLE IF EXISTS " + TABLA_UNIDADMEDIDA);
			db.execSQL("DROP TABLE IF EXISTS " + TABLA_DETALLE);
			onCreate(db);
			
		}
	}
	
	public conexion(Context c) {
		nContexto = c;
	}

	// metodo para abrir nuestra base de datos
	public conexion abrir() throws Exception {
		nHelper = new BDHelper(nContexto);
		nBD = nHelper.getReadableDatabase();
		return this;
	}

	public void cerrar() {
		nHelper.close();
	}
}

