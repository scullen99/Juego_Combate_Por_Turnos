package estrategia;

import enemigos.Enemigo;
import personajes.Personaje;

public abstract class EstrategiaCombate
{
	
	protected Enemigo componente;
	
	public EstrategiaCombate(Enemigo componente)
	{
		this.componente = componente;
	}
	
	// Función que ejecuta la accion de la ia en su turno
	public abstract void ejecutar(Personaje personajesJugador);

}
