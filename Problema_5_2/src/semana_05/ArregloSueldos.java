package semana_05;

public class ArregloSueldos {
	//Atributos
	private double [] sueldo =  {2400.5, 800.4, 1500.2, 1000.3, 4700.1, 600.0, 3300.8, 2600.6, 5100.9, 2000.7};

	public ArregloSueldos() {	
	}
	//Metodos
	public int tamaño() {
		return sueldo.length;
	}
	public double obtener(int i) {
		return  sueldo [i];
	}
	//
	public double sueldoPromedio() {
		double suma = 0;
		for(int i = 0; i<tamaño(); i++) {
			suma += sueldo[i];	
	}
	return suma/tamaño();
}

	public double sueldoMayor() {
		double suma = 0;
		for(int i = 0; i )
	}
	
	
	}

