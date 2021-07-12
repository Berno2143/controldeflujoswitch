package controldeflujoswitch;

public class flujoseitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * switch
		 * switch(condicion)  { 
		 * case valor:
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * 		break;
		 * case calor2:
		 * 		codigo
		 *      codigo
		 *      codigo
		 *      break;
		 * default:
		 * 		codigo por defecto
		 * }
	     */ 
		
		int dia = 7;
		String mensaje = "";
		
		switch (dia) {
			case 1:
				mensaje = "Lunes";
			case 2:
				mensaje = "Martes";
			case 3:
				mensaje = "Miercoles";
			case 4:
				mensaje = "Jueves";
			case 5:
				mensaje = "Viernes";
			case 6:
				mensaje = "Sabado";
			case 7:
				mensaje = "Domingo";	
		}
		
		System.out.println(mensaje);
		}

}
