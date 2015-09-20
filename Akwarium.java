import greenfoot.*;

public class Akwarium extends World
{
    public Akwarium()
    {    
        super(800, 600, 1);
        
    }
    
    public void act()
    {
        dodajRybe();
        //dodajSiatke();
    }
   /*  public void dodajSiatke()
    {
        if(Greenfoot.mousePressed(this))
        {
            Siatka siatka = new Siatka();
            int x = Greenfoot.getMouseInfo().getX();
            int y = Greenfoot.getMouseInfo().getY();
            addObject(siatka, x, y);
        }
    }
    */
    public void dodajRybe()
    {
        if(Greenfoot.mousePressed(this))
        {
            int wynikLosowania = Greenfoot.getRandomNumber(3);
            FabrykaRybek nowaRyba = new FabrykaRybek();
            Ryba rybka = nowaRyba.stworzRybe(wynikLosowania);
            int x = Greenfoot.getRandomNumber(800);
            int y = Greenfoot.getRandomNumber(500)+100;
            addObject(rybka, x, y);
        }
    }
}
