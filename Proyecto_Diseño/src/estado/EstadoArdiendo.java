package estado;

import personajes.Personaje;

public class EstadoArdiendo extends EstadoCombate
{

	public EstadoArdiendo(Personaje componente)
	{
		
		
		super(componente, 3);
		
	}


	public void ejecutarEstado()
	{
		
		System.out.println("\n" + this.componente.getNombre() + " est� ardiendo! Pierde 10 hp");
		System.out.println(this.turnosRestantes + " turnos restantes ardiendo" + "\n");
		this.componente.da�ar(10);
		

	}

}
