
/**
 * Escreva uma descrição da classe Personagem aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import Correr.*;
import Pular.*;
import Atacar.*;
public class Personagem
{
    private Corre x;
    private Pulo y;
    private Ataque z;
    
    public void setCorre(Corre x)
    {
         this.x = x;
    }
    
    public void setPulo(Pulo y)
    {
         this.y = y;
    }
    
    public void setAtaque(Ataque z)
    {
         this.z = z;
    }
    
    public void correr() 
    {
        x.correr();
    }
    
    public void pular() 
    {
        y.pular();
    }
    
    public void atacar() 
    {
        z.atacar();
    }
}
