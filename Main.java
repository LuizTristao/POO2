import Correr.*;
import Pular.*;
import Atacar.*;

public class Main
{
  public static void main (String [] args){
    System.out.printf("Programação Orientada à Objetos 2 - Atividade 01 (Padrão Strategy)\n\n");

		System.out.printf("Atividade 01\n\n");
		
		Personagem personagem01 = new Personagem01();
		Personagem personagem02 = new Personagem02();
		Personagem personagem03 = new Personagem03();

		System.out.print("PERSONAGEM 01\n\n");
		System.out.print(personagem01);
		personagem01.setAtaque(new Normal());
		personagem01.atacar();
		personagem01.correr();
		personagem01.pular();

		System.out.printf("\n\n");

		System.out.printf("PERSONAGEM 02\n\n");
		System.out.print(personagem02);
		personagem02.atacar();
		personagem02.correr();
		personagem02.pular();
		
		System.out.printf("\n\n");
		
		System.out.printf("PERSONAGEM 03\n\n");
		System.out.print(personagem03);
		personagem03.atacar();
		personagem03.correr();
		personagem03.pular();
    } 
}
