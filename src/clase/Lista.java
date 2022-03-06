package clase;

public class Lista {
	Nodo primero;

	public Lista() {
		this.primero = null;
	}
	
	void mostrar(){
		Nodo actual = this.primero;
		System.out.print("[");
		while(actual!=null) {
			System.out.print(actual.elemento+" ");
			actual = actual.siguiente;
		}
		System.out.println("]");
	}
	
	void agregarAtras(int n){
		Nodo nuevo = new Nodo(n);
		if(this.primero==null) {			
			this.primero=nuevo;
		}
		else {
			Nodo actual = this.primero;
			while(actual.siguiente!=null) {
				actual = actual.siguiente;
			}
			//actual esta apuntando al ultimo nodo de la lista
			actual.siguiente= nuevo;
		}
	}
	
	
	void agregarAdelante(int n) {
		//Nodo nuevo = new Nodo(n);
		Nodo nuevo = new Nodo(n);
		if(this.primero==null) {//lista vacia
			this.primero=nuevo;
		}
		else { // lista no vacia
			nuevo.siguiente = this.primero;
			this.primero = nuevo;
		}
	}
	
	int largo(){
		Nodo actual = this.primero;
		int cant = 0;
		while(actual!=null) {
			cant++;
			actual = actual.siguiente;
		}
		return cant;
	}

	
	void quitar(int n) {
		if(this.primero!=null && this.primero.elemento==n) {
			this.primero= this.primero.siguiente;
		}
		else {//el primero no es el que tengo que eliminar
			Nodo actual = this.primero;
			while(actual!=null && actual.siguiente!=null) {
				if(actual.siguiente.elemento==n){
					actual.siguiente=actual.siguiente.siguiente;
					return;
				}
				actual = actual.siguiente;
			}
		}
		
	}
	
	void recortarDesde(int k) {
	
	 int indice=0;
	 Nodo n = this.primero;// sirve para recorrer lista
	 
	 
		 
		while(n!=null && indice < k) {
			
			n = n.siguiente;
	
			indice++;
		}
	 
	 if (k==indice && n != null)
		 n.siguiente=null;
	 
	}
	
	
	 void recortarHasta(int k) {

		 int indice=0;
		 Nodo n = this.primero;// sirve para recorrer lista
		 
		 
			 
			while(n!=null && indice <= k) {
				
				n = n.siguiente;
		
				indice++;
			}
			if (indice > k)
				this.primero=n;
	 }
	
	/*Se pide para esta clase escribir el metodo de instancia void mandarAdelanteCada(int k) que modique
la lista eliminando los elementos en todas las posiciones divisibles por k y colocandolos al principio de
la lista. Por ejemplo:
Si la lista es [5,0,8,3,7,9] y k=2 la lista podra quedar como [7,8,5,0,3,9].
Si la lista es [1,4,7,6,1,5] y k=3 la lista podra quedar como [6,1,4,7,1,5].
Si la lista es [9,8,7,6,5,4,3,2,1] y k=4 la lista podra quedar como [1,5,9,8,7,6,4,3,2].
Si la lista es [] y k=3 la lista debe quedar como [].*/
	
	
	
	 void mandarAdelanteCada(int k){
		 int pos=0;
		 
		 Nodo actual=this.primero;
		 
		 while(actual!=null && actual.siguiente!=null){
		
			if ((pos+1)%k==0){
				
					Nodo n= new Nodo (actual.siguiente.elemento);
					
					  n.siguiente = this.primero;
			          this.primero=n;
			          actual.siguiente=actual.siguiente.siguiente;
			          //actual=actual.siguiente.siguiente;
			      	
				 }
		 else{
			 
		 actual=actual.siguiente;
		
		 }
		 pos++;
		 
		 }
		 
	 }
	
	
	 Lista extraePares(){
		 
		 Nodo actual=this.primero;
		 
		 Lista listaPares= new Lista();

		 while(actual!=null)
			 
		 if (actual.elemento%2== 0){
				 
			 Nodo nodoPares=new Nodo(actual.elemento);
			 
			 //listaPares.primero=nodoPares;
			 listaPares.agregarAdelante(nodoPares.elemento);
			 
			//this.primero=actual.siguiente;
			 
			 actual=actual.siguiente;
		 
		 }
		 else{//element del nodo es impar
			 
		 actual=actual.siguiente;

		 }
		 return listaPares;
		 }

	void eliminarMaximo() {

		int maximo=this.primero.elemento;
		Nodo actual=this.primero;
		
		while (actual!=null){
			  if(actual.elemento>maximo){
			     maximo=actual.elemento;
			   }else {
			 actual=actual.siguiente;
			   }
			}
		
		actual=this.primero;
		
		while(this.primero!=null && this.primero.elemento==maximo) {
			this.primero= this.primero.siguiente;
		}
		
		while(actual!=null && actual.siguiente!=null) {
				if(actual.siguiente.elemento==maximo){
					actual.siguiente=actual.siguiente.siguiente;
					return;
				}
				actual = actual.siguiente;
			}
		}
	
	
	 void enviarAlfondo(int k){
		 
			int contElementos=1;
			Nodo actual=this.primero;
			
			while (actual!=null && contElementos<=k){
				
				if (actual.siguiente==null){// el ultimo de la lista tiene que ser null
				
					actual.siguiente=this.primero;//lo agrego al fondo de la lista
								
					this.primero=this.primero.siguiente; // mi primero es el 2do nodo de la lista
					
					actual.siguiente.siguiente=null;
					
					actual=this.primero; // vuelvo a instanciar el nodo actual para volver a recorrer la lista
					
					contElementos++;
					
					
				}
				else{
					actual=actual.siguiente;
				}
			}
			
		 }
				
	
	
}
