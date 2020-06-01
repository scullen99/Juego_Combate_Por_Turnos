package combate;

import personajes.Personaje;

public abstract class DecoradorCombate implements InterfazCombate
{

	protected InterfazCombate componente;
	
	public DecoradorCombate(InterfazCombate componente)
	{
		this.componente = componente;
	}
	
	public void combate(Personaje atacante, Personaje defensor)
	{
		this.componente.combate(atacante, defensor);
	}
	
}
