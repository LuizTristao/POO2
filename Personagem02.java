
/**
 * Escreva uma descrição da classe Personagem02 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import Correr.*;
import Pular.*;
import Atacar.*;
public class Personagem02 extends Personagem
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public Personagem02()
    {
        setPulo(new Alto());
        setCorre(new Rapido());
        setAtaque(new Normal());
    }

}   
