package basedatos;

public class config {

	
	protected static final String ID_INGREDIENTES = "_id";
	protected static final String I_DESCRIPCION = "descripcion";
	protected static final String TABLA_INGREDIENTE = "ingredientes";
	
	
	protected static final String ID_RECETAS = "_id";
	protected static final String R_DESCRIPCION = "descripcion";
	protected static final String R_DURACION = "duracion";
	protected static final String TABLA_RECETA = "ingredientes";
		

	protected static final String ID_UNIDADMEDIDA = "_id";
	protected static final String U_DESCRIPCION = "descripcion";
	protected static final String TABLA_UNIDADMEDIDA = "unidadmedida";
	
	
	protected static final String ID_DETALLE = "_id";
	protected static final String D_UNIDADMEDIDA = "idunidadmedida";
	protected static final String D_RECETAS = "idreceta";
	protected static final String D_INGREDIENTES = "idingredientes";
	protected static final String D_PRECIO = "precio";
	protected static final String D_CANTIDAD = "cantidad";
	protected static final String TABLA_DETALLE = "detalle";
	
	
	
	
}
