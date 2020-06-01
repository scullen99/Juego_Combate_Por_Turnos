package estado;

import personajes.Personaje;

public class EstadoDesorientado extends EstadoCombate
{

	public EstadoDesorientado(Personaje componente)
	{
		super(componente, 3);
	}


	public void ejecutarEstado()
	{
		System.out.println(this.componente.getNombre() + " está desorientado! no puede usar habilidades");
		System.out.println(this.turnosRestantes + " turnos restantes");

		// no poder usar habilidades

	}

}
