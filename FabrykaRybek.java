import greenfoot.*;


public class FabrykaRybek extends Actor
{
    public Ryba stworzRybe(int gatunek)
    {
       switch(gatunek)
       {
           case 0 : return new Zlota(); 
           case 1 : return new Zielona();
           case 2 : return new Skalar();
           default: return new Skalar();
       }
      
           
    }    
}
