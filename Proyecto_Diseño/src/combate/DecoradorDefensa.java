package combate;

import personajes.Personaje;

public class DecoradorDefensa extends DecoradorCombate
{
	
	public DecoradorDefensa(InterfazCombate componente)
	{
		super(componente);
	}
	
	public void combate(Personaje atacante, Personaje defensor)
	{
		if(defensor.getDefensa() >= 5)
		{
			System.out.println(atacante.getNombre() + " realiza una defensa poderosa!");
		}	
		
		this.componente.combate(atacante, defensor);
	}
}
