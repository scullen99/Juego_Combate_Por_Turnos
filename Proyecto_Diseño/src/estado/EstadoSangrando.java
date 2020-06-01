package estado;

import personajes.Personaje;

public class EstadoSangrando extends EstadoCombate
{

	public EstadoSangrando(Personaje componente)
	{
		super(componente, 3);
	}

	
	public void ejecutarEstado()
	{
		System.out.println("\n" + this.componente.getNombre() + " est� sangrando! Pierde 4 hp");
		System.out.println(this.turnosRestantes + " turnos restantes sangrando" + "\n");
		this.componente.da�ar(4);

	}

}
