package clase;

import java.awt.Point;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista l = new Lista();
	
		l.agregarAtras(4);
		l.agregarAtras(1);
		l.agregarAtras(6);
		l.agregarAtras(3);
		l.agregarAtras(8);
		l.agregarAtras(10);
	
		
		l.mostrar();
		l.enviarAlfondo(2);
		
		l.mostrar();
		
		
		/*
		
		l.extraePares();
		
		
		l.mostrar();
		
		l.extraePares().mostrar();;
		*/
		
		//l.mandarAdelanteCada(3);


		/*
		l.quitar(6);
		l.mostrar();
	*/
	
	}

}
