
public class Deposito {

private	Productos listaProductos [] ; 
private int cantidadProductosIngresados ; 	
	public Deposito(int productosDeposito) {      //pasamos cuantos productos va a tener deposito   
		
		listaProductos= new Productos[productosDeposito] ; //inicializo el array con la cantidad de productos 
        cantidadProductosIngresados= 0 ; 	
	}
		
	public void agregarProducto (Productos producto) {
		for(int i=0; i<listaProductos.length; i++) {
		 if(listaProductos[i]== null) {
			 listaProductos[i]= producto;
		     cantidadProductosIngresados++ ; 
			 
			 break;
	 }	 
		 
	}	
   }	
		
    public void verListaProductos () {
    	for(int i=0; i<listaProductos.length; i ++) {
    		System.out.println(listaProductos[i]);
    	}
    }
	
	public boolean buscarProducto (String codigo) 
    {
		for(int i=0; i<cantidadProductosIngresados; i++) {
			if(codigo.equalsIgnoreCase(listaProductos[i].getCodigo())) //ignora si la palabra esta en mayuscula o minuscula 
			{
				System.out.println("El producto " + listaProductos[i].getCodigo() + " se encuentra en la posicion " + i );
				return true;
		}
			
		}	
	              return false;
	}
		
    public void ordenarPorPrecio()
    {
    	for(int i=0 ; i<cantidadProductosIngresados; i++) 
    	{
    		for(int j=0; j<cantidadProductosIngresados-1; j++)
    		{
    		  if(listaProductos[j].getPrecio()> listaProductos[j+1].getPrecio())
    		  { 
    			Productos temporal;
    			temporal= listaProductos[j];
    			listaProductos[j]= listaProductos[j+1];
    			listaProductos[j+1]= temporal ; 
    			
    		}
    	}	
    }	
    		
}
    public void ordenarPorCantidad()
    {
    	for(int i=0 ; i<cantidadProductosIngresados; i++) 
    	{
    		for(int j=0; j<cantidadProductosIngresados-1; j++)
    		{
    		  if(listaProductos[j].getCantidadProductos()> listaProductos[j+1].getCantidadProductos())
    		  { 
    			Productos temporal;
    			temporal= listaProductos[j];
    			listaProductos[j]= listaProductos[j+1];
    			listaProductos[j+1]= temporal ; 
    			
    		}
    	}	
    }	
    		
}
    
    
    
    
    
     
    
    
    
		
		
	 		
		
	}
	
	
	
	
	
	
	
	
	
	

