public class Jugador extends Personaje {
    //              ^ (Jugador hereda de Personaje)
    //Inserte acá los atributos

    private int numeroBotiquines;  
 
    //Inserte acá el método constructor

    public Jugador(String nombre, char sexo, double posicionX, double posicionY,double damage)
    {
        super(nombre, sexo, posicionX, posicionY, damage);
        this.numeroBotiquines = 0;
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)

   public void usarBotiquin()
    {
        if(this.numeroBotiquines>0)
        {
            if(this.getVida()<=100 && this.getVida()>=1)
            {
                this.numeroBotiquines --;
                if(this.getVida()>95 && this.getVida()<=100)
                {
                    this.setVida(100);
                }
                else
                {
                    this.setVida(this.getVida()+5);
                }
            }    
            
        }
    }

    public void recogerBotiquin()
    {
        this.numeroBotiquines++;
    }
    
    public void moverDerecha(double d)
    {
        this.setPosicionX(this.getPosicionX()+d);
    }
    
    public void moverIzquierda(double d)
    {
        this.setPosicionX(this.getPosicionX()-d);
    }
    
    public void moverArriba(double d)
    {
        this.setPosicionY(this.getPosicionY()+d);
    }
    
    public void moverAbajo(double d)
    {
        this.setPosicionY(this.getPosicionY()-d);
    }
    
    public void golpear(Enemigo p)
    {
        super.golpear(p);
        p.evolucionar();        
    }
    

    //Inserte acá los SETTERS Y GETTERS
    
        public int getNumeroBotiquines() 
    {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) 
    {
        this.numeroBotiquines = numeroBotiquines;
    }
}

