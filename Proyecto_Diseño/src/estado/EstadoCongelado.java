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
		System.out.println("\n" + this.componente.getNombre() + " est� congelado! est� fr�o");
		System.out.println(this.turnosRestantes + " turnos restantes congelado" + "\n");
		
		// pierde turno
		
		

	}

}
