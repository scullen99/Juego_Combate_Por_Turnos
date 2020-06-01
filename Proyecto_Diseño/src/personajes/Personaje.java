package personajes;

import combate.CalculadoraDaño;
import estado.*;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Personaje
{

	protected String nombre = "SinNombre";
	
	protected int ataque = 0;
	protected int defensa = 0;
	
	protected int vida_maxima = 0;
	protected int vida = 0;
	
	public static CalculadoraDaño calc = new CalculadoraDaño();
	
	protected ArrayList<EstadoCombate> estados = new ArrayList<EstadoCombate> ();
	
	public Personaje(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public Personaje(String nombre, int ataque, int defensa)
	{
		this(nombre);
		this.ataque = ataque;
		this.defensa = defensa;
	}
	
	public Personaje(String nombre, int ataque, int defensa, int vida_maxima)
	{
		this(nombre, ataque, defensa);
		this.vida = vida_maxima;
		this.vida_maxima = vida_maxima;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public int getAtaque() 
	{
		return this.ataque;
	}
	
	public int getDefensa() 
	{
		return this.defensa;
	}
	
	public void setAtaque(int ataque)
{
		this.ataque = ataque;
	}
	
	public void setDefensa(int defensa)
	{
		this.defensa = defensa;
	}
	
	public int getVida() 
	{
		return this.vida;
	}
	
	public int getVidaMaxima() 
	{
		return this.vida_maxima;
	}

	public void añadirEstado(EstadoCombate estado)
	{
		boolean flagEstadoEncontrado = false;
		for(EstadoCombate item : this.getEstados()) 
		{
			if(item.getClass() == estado.getClass()) 
			{
				item.reiniciarEstado();
				flagEstadoEncontrado = true;
				break;
			}
		}
		if(!flagEstadoEncontrado)
		{
			this.getEstados().add(estado);
		}	
	}
	
	public void ejecutarEstados() 
	{
		Iterator<EstadoCombate> itr = this.getEstados().iterator();
		while(itr.hasNext())
		{
			EstadoCombate estado = itr.next();
			if(estado.getEstado()) {
				estado.pasarTurno();
			}
			else {
				itr.remove();
			}
		}
	}
	
	public ArrayList<EstadoCombate> getEstados() 
	{	
		return this.estados;
	}
	
	public void dañar(int daño) 
	{
		this.vida = this.vida - daño;
		if(this.vida < 0) 
		{
			this.vida = 0;
		}
	}
	
	public void curar(int cura)
	{
		this.vida = this.vida + cura;
		if(this.vida > this.vida_maxima)
		{
			this.vida = this.vida_maxima;
		}
	}
	
	public boolean getArdiendo() {
		for(EstadoCombate estado : this.getEstados()) {
			if(estado.getClass() == EstadoArdiendo.class) {
				return true;
			}
		} return false;
	}
	
	public boolean getCongelado() {
		for(EstadoCombate estado : this.getEstados()) {
			if(estado.getClass() == EstadoCongelado.class) {
				return true;
			}
		} return false;
	}
	
	public boolean getDesorientado() {
		for(EstadoCombate estado : this.getEstados()) {
			if(estado.getClass() == EstadoDesorientado.class) {
				return true;
			}
		} return false;
	}
	
	public boolean getSangrando() {
		for(EstadoCombate estado : this.getEstados()) {
			if(estado.getClass() == EstadoSangrando.class) {
				return true;
			}
		} return false;
	}
	
	public boolean estaVivo() 
	{
		if(this.getVida() > 0) 
		{
			return true;
		} 
		
		return false;
		
	}
	
}
