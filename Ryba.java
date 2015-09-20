import greenfoot.*;

public class Ryba extends Actor
{
    public int czyKoniecEkranu() 
    {
        if(getX() < 10) 
            return 1;
        if(getX() > getWorld().getWidth() - 10) 
            return 0;
        else
            return 2;
        
    }
   
    public void ruchLewoPrawo()
    {
        if (czyKoniecEkranu() == 0)
        {
            setRotation(180);
            getImage().mirrorVertically();
        }
        else if (czyKoniecEkranu() == 1)
        {
            turnTowards(getWorld().getWidth(), getY());
            getImage().mirrorVertically();
        }
    }
    
    
}
