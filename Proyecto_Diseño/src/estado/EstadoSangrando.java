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
		System.out.println(this.componente.getNombre() + " está sangrando! Pierde 4 hp");
		System.out.println(this.turnosRestantes + " turnos restantes");
		this.componente.dañar(4);

	}

}
