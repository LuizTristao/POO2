
/**
 * Escreva uma descrição da classe Personagem01 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import Correr.*;
import Pular.*;
import Atacar.*;
public class Personagem01 extends Personagem
{
    public Personagem01()
    {
        setPulo(new Medio());
        setCorre(new Media());
        setAtaque(new Forte());
    }

}
