package combate;

import personajes.Personaje;

public class CombateComponente implements InterfazCombate
{

	public void combate(Personaje atacante, Personaje defensor)
	{
		// Este metodo implementa el combate entre los 2 personajes
		int da�o = Personaje.calc.calcularDa�o(atacante, defensor);
		
		System.out.println(atacante.getNombre() + " hace " + String.valueOf(da�o) + " da�o a " + defensor.getNombre() + "\n");
		defensor.da�ar(da�o);
		System.out.println(defensor.getNombre() + " le queda " + defensor.getVida() + "/" + defensor.getVidaMaxima() + " hp" + "\n");
	}

}
