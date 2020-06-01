package combate;

import personajes.Personaje;

public class DecoradorAtaque extends DecoradorCombate
{

	public DecoradorAtaque(InterfazCombate componente)
	{
		super(componente);
	}
	
	public void combate(Personaje atacante, Personaje defensor)
	{
		if(atacante.getAtaque() >= 15)
		{ 
			/* PLACEHOLDER */
			System.out.println(atacante.getNombre() + " realiza un ataque poderoso!");
			
		}	
		
		this.componente.combate(atacante, defensor);
	}
	
}
