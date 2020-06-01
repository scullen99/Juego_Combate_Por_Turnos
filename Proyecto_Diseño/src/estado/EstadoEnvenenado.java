package estado;

import personajes.Personaje;

public class EstadoEnvenenado extends EstadoCombate {

	public EstadoEnvenenado(Personaje componente) 
	{
		super(componente, 3);
	}

	public void ejecutarEstado() 
	{
		System.out.println(this.componente.getNombre() + " est� envenenado! Pierde 4 hp");
		System.out.println(this.turnosRestantes + " turnos restantes");
		this.componente.da�ar(4);

	}

}
