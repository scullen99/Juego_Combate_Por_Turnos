package estado;

import personajes.Personaje;

public class EstadoCongelado extends EstadoCombate
{

	public EstadoCongelado(Personaje componente)
	{
		super(componente, 2);
		
	}

	public void ejecutarEstado()
	{
		System.out.println(this.componente.getNombre() + " está congelado! está frío");
		System.out.println(this.turnosRestantes + " turnos restantes");
		
		// pierde turno
		
		

	}

}
