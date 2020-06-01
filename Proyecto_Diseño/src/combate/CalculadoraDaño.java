package combate;

import personajes.Personaje;
import java.util.concurrent.ThreadLocalRandom; // libreria generar numeros aleatorios

public class CalculadoraDaño
{

	// daño = (dañoAtacante - defensaDefesor)
	// Patron Singleton
	public int calcularDaño(Personaje atacante, Personaje defensor)
	{
		int daño = atacante.getAtaque() - defensor.getDefensa();
		
		if(daño < 0)
		{
			daño = 0;
		}
				
		return daño;
		
	}
	
	public boolean ardiendo()
	{

		int randomNum = ThreadLocalRandom.current().nextInt(0, 100);
		
		if(randomNum >= 10)
		{
			return true;
		}
		
		return false;
	}
	
	public boolean congelado()
	{

		int randomNum = ThreadLocalRandom.current().nextInt(0, 100);
		
		if(randomNum >= 15)
		{
			return true;
		} 
		
		return false;
	}
	
	public boolean desorientado()
	{

		int randomNum = ThreadLocalRandom.current().nextInt(0, 100);
		
		if(randomNum >= 25)
		{
			return true;
		} 
		
		return false;
	}
	
	public boolean sangrado()
	{

		int randomNum = ThreadLocalRandom.current().nextInt(0, 100);
		
		if(randomNum >= 20)
		{
			return true;
		}
		
		return false;
	}
	
	public boolean envenenado()
	{

		int randomNum = ThreadLocalRandom.current().nextInt(0, 100);
		
		if(randomNum >= 15)
		{
			return true;
		}
		
		return false;
	}
	
}
