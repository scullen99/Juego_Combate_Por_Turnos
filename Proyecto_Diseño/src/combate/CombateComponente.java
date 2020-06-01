package combate;

import personajes.Personaje;

public class CombateComponente implements InterfazCombate
{

	public void combate(Personaje atacante, Personaje defensor)
	{
		// Este metodo implementa el combate entre los 2 personajes
		int daño = Personaje.calc.calcularDaño(atacante, defensor);
		
		System.out.println(atacante.getNombre() + " hace " + String.valueOf(daño) + " daño a " + defensor.getNombre() + "\n");
		defensor.dañar(daño);
		System.out.println(defensor.getNombre() + " le queda " + defensor.getVida() + "/" + defensor.getVidaMaxima() + " hp" + "\n");
	}

}
