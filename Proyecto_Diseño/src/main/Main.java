package main;

import java.util.ArrayList;
import java.util.Scanner;

import enemigos.Enemigo;
import escenarios.FactoryDesierto;
import escenarios.FactoryLuna;
import escenarios.FactoryMercadona;
import estrategia.*;
import personajes.Jugador;


public class Main {
	
	public static void main(String []args) {
		
		ArrayList<Enemigo> enemigos = new ArrayList<Enemigo>();	
		
		Scanner inputTeclado = new Scanner(System.in);
		
		// Nos creamos a nuestro personaje que va a luchar contra los enemigos
		// 1 vs 1 por turnos
		int ataquePJ = 60;	
		int defensaPJ = 25;
		int vidaPJ = 200;
		
		//Crear 3 personajes
		//for(int i = 0; i < 3; i++) {
			
		System.out.println("Escribe el nombre del jugador");
			
		Jugador jugador = new Jugador(inputTeclado.next(), ataquePJ, defensaPJ, vidaPJ);
		
		inputTeclado.close();
			
		System.out.println("Stats del personaje: ");
		System.out.println("Nombre: " + jugador.getNombre());
		System.out.println("Ataque: " + ataquePJ);
		System.out.println("Defensa: " + defensaPJ);
		System.out.println("Vida: " + vidaPJ);
			
		//ataque += 5;
		//defensa += 5;
			
		//}
		
		// inputTeclado.close();
		
		// Implementamos las fábricas
		FactoryDesierto fabricaDesierto = new FactoryDesierto();
		FactoryLuna fabricaLuna = new FactoryLuna();
		FactoryMercadona fabricaMercadona = new FactoryMercadona();
		
		// Primer Escenario Desierto
		enemigos.add(fabricaDesierto.getOso());
		enemigos.add(fabricaDesierto.getTerraplanista());
		enemigos.add(fabricaDesierto.getTwittero());
		//enemigos.add(fabricaDesierto.getHomeopata());
		//enemigos.add(fabricaDesierto.getVikingo());
		
		
		// Primer combate desierto
		while((!enemigos.isEmpty()) && (jugador.estaVivo())) {
			
			System.out.println("Turno de " + jugador.getNombre() + " vs " + enemigos.get(0).getNombre());
			if(jugador.getCongelado()) {
				System.out.println(jugador.getNombre() + " esta congelado! Pierde su turno");
			} else {
				System.out.println("Que quieres hacer?");
				System.out.println("1. Atacar");
				System.out.println("2. Curarse");
				System.out.println("3. No hacer nada");
				// System.out.println("4. Retirarse");
				
				switch(inputTeclado.nextInt()) {
				
				case 1:
					System.out.println(jugador.getNombre() + " se dispone a atacar a " + enemigos.get(0).getNombre());
					jugador.atacar(enemigos.get(0));
					
					break;
					
				case 2:
					System.out.println(jugador.getNombre() + " se cura 20 hp");
					jugador.curar(20);
					break;
					
				case 3:
					System.out.println(jugador.getNombre() + " se queda mirando");
					break;
					
				/*case 4:
					break;*/
					
				default:
					System.out.println("Opcion introducida erronea. Se salta turno");
				}
				
				// Se ejecutan los estados del personaje
				jugador.ejecutarEstados();
			}		
			// Jugador ha matado al enemigo
			if(!enemigos.get(0).estaVivo()) {
				System.out.println(jugador.getNombre() + " ha matado a " + enemigos.get(0).getNombre());
				enemigos.remove(0);
			} else {
				// Turno del enemigo
				if(!enemigos.isEmpty()) {
					EstrategiaCombate estrategia = null;
					if(enemigos.get(0).getVida() < enemigos.get(0).getVidaMaxima() / 2) {
						estrategia = new EstrategiaDefensiva(enemigos.get(0));
					} else {
						estrategia = new EstrategiaOfensiva(enemigos.get(0));
					}
					
					enemigos.get(0).ejecutarStrategy(estrategia, jugador);
					
				}
			}
			
		}
		
		// El jugador ha perdido el primer combate
		if(!jugador.estaVivo()) {
			
			System.out.println("Se terminó el juego. :(");
			
		}
		
		// El jugador ha sobrevivido la primera fase
		else {
		
			System.out.println("La siguiente fase es en la luna, Adelante!");
			
			// Segundo Escenario Luna
			enemigos.add(fabricaLuna.getOso());
			enemigos.add(fabricaLuna.getTerraplanista());
			enemigos.add(fabricaLuna.getTwittero());
			enemigos.add(fabricaLuna.getVikingo());
			//enemigos.add(fabricaLuna.getHomeopata());
			
			while((!enemigos.isEmpty()) && (jugador.estaVivo())) {
				
				System.out.println("Turno de " + jugador.getNombre() + " vs " + enemigos.get(0).getNombre());
				if(jugador.getCongelado()) {
					System.out.println(jugador.getNombre() + " esta congelado! Pierde su turno");
				} else {
					System.out.println("Que quieres hacer?");
					System.out.println("1. Atacar");
					System.out.println("2. Curarse");
					System.out.println("3. No hacer nada");
					// System.out.println("4. Retirarse");
					
					switch(inputTeclado.nextInt()) {
					
					case 1:
						System.out.println(jugador.getNombre() + " se dispone a atacar a " + enemigos.get(0).getNombre());
						jugador.atacar(enemigos.get(0));
						
						break;
						
					case 2:
						System.out.println(jugador.getNombre() + " se cura 20 hp");
						jugador.curar(20);
						break;
						
					case 3:
						System.out.println(jugador.getNombre() + " se queda mirando");
						break;
						
					/*case 4:
						break;*/
						
					default:
						System.out.println("Opcion introducida erronea. Se salta turno");
					}
					
					// Se ejecutan los estados del personaje
					jugador.ejecutarEstados();
				}		
				// Jugador ha matado al enemigo
				if(!enemigos.get(0).estaVivo()) {
					System.out.println(jugador.getNombre() + " ha matado a " + enemigos.get(0).getNombre());
					enemigos.remove(0);
				} else {
					// Turno del enemigo
					if(!enemigos.isEmpty()) {
						EstrategiaCombate estrategia = null;
						if(enemigos.get(0).getVida() < enemigos.get(0).getVidaMaxima() / 2) {
							estrategia = new EstrategiaDefensiva(enemigos.get(0));
						} else {
							estrategia = new EstrategiaOfensiva(enemigos.get(0));
						}
						
						enemigos.get(0).ejecutarStrategy(estrategia, jugador);
						
					}
				}
				
			}
			
			if(jugador.estaVivo() != true) {
				
				System.out.println("Se terminó el juego.");
				
			}
			
			else {
			
				System.out.println("La siguiente fase es en Mercadona porque te falta el papel higienico, Adelante!");
				
				// Tercer Escenario Mercadona
				enemigos.add(fabricaMercadona.getOso());
				enemigos.add(fabricaMercadona.getTerraplanista());
				enemigos.add(fabricaMercadona.getTwittero());
				enemigos.add(fabricaMercadona.getHomeopata());
				enemigos.add(fabricaMercadona.getVikingo());
				
				while((!enemigos.isEmpty()) && (jugador.estaVivo())) {
					
					System.out.println("Turno de " + jugador.getNombre() + " vs " + enemigos.get(0).getNombre());
					if(jugador.getCongelado()) {
						System.out.println(jugador.getNombre() + " esta congelado! Pierde su turno");
					} else {
						System.out.println("Que quieres hacer?");
						System.out.println("1. Atacar");
						System.out.println("2. Curarse");
						System.out.println("3. No hacer nada");
						// System.out.println("4. Retirarse");
						
						switch(inputTeclado.nextInt()) {
						
						case 1:
							System.out.println(jugador.getNombre() + " se dispone a atacar a " + enemigos.get(0).getNombre());
							jugador.atacar(enemigos.get(0));
							
							break;
							
						case 2:
							System.out.println(jugador.getNombre() + " se cura 20 hp");
							jugador.curar(20);
							break;
							
						case 3:
							System.out.println(jugador.getNombre() + " se queda mirando");
							break;
							
						/*case 4:
							break;*/
							
						default:
							System.out.println("Opcion introducida erronea. Se salta turno");
						}
						
						// Se ejecutan los estados del personaje
						jugador.ejecutarEstados();
					}		
					// Jugador ha matado al enemigo
					if(!enemigos.get(0).estaVivo()) {
						System.out.println(jugador.getNombre() + " ha matado a " + enemigos.get(0).getNombre());
						enemigos.remove(0);
					} else {
						// Turno del enemigo
						if(!enemigos.isEmpty()) {
							EstrategiaCombate estrategia = null;
							if(enemigos.get(0).getVida() < enemigos.get(0).getVidaMaxima() / 2) {
								estrategia = new EstrategiaDefensiva(enemigos.get(0));
							} else {
								estrategia = new EstrategiaOfensiva(enemigos.get(0));
							}
							
							enemigos.get(0).ejecutarStrategy(estrategia, jugador);
							
						}
					}
					
				}
				
				if(jugador.estaVivo() != true) {
					
					System.out.println("Se terminó el juego :(");
					
				}
				
				else {
					
					System.out.println("GANASTE EL JUEGO ERES UNA BESTIA!!!!!");
					System.out.println("");
					System.out.println("Trabajo realizado por: ");
					System.out.println("Sergio Esteban Tarrero y Ernesto Cubo Pozo");
					
				}
		
			}
		
		}
		
	}
	
}
