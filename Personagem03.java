
/**
 * Escreva uma descrição da classe Personagem03 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import Correr.*;
import Pular.*;
import Atacar.*;
public class Personagem03 extends Personagem
{

    public Personagem03()
    {
        setPulo(new Baixo());
        setCorre(new Rapido());
        setAtaque(new Forte());
    }

}
