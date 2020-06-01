package estado;

import personajes.Personaje;

public abstract class EstadoCombate
{

	protected int duracion = -1;
	protected int turnosRestantes = -1;
	protected Personaje componente = null;
	
	public EstadoCombate(Personaje componente, int duracion)
	{
		this.componente = componente;
		this.duracion = duracion;
		this.turnosRestantes = this.duracion;
	}
	
	public void pasarTurno()
	{
		this.ejecutarEstado();
		this.turnosRestantes -= 1;
	}
	
	public boolean getEstado()
	{
		if(this.turnosRestantes > 0)
		{
			return true;
		} 
		return false;
	}
	
	public void reiniciarEstado()
	{
		this.turnosRestantes = this.duracion;
	}
	
	public int getTurnosRestantes() 
	{
		return this.turnosRestantes;
	}
	
	public abstract void ejecutarEstado();

}
