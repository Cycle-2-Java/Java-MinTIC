public class Personaje {
    //Inserte acá los atributos

    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double damage;
    private double vida;
    
    //Inserte acá el método constructor

    public Personaje(String nombre, char sexo, double posicionX, double posicionY,double damage)
    {
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.damage = damage;
        this.vida = 100;
    }

    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)

    public void golpear(Personaje p)
    {
       double datoReal = this.damage/calcularDistanciaRespectoPersonaje(p);
       if(datoReal <= p.getVida())
       {
            p.setVida(p.getVida()-datoReal);
       }
       else
       {
           p.setVida(0);
       }
    }
    
    public void recibirImpacto(double d)
    {
        if(d <= this.vida)
        {
            this.vida -= d;
        }
        else
        {
            this.vida = 0;
        }
    }
    
    public double calcularDistanciaRespectoPersonaje(Personaje p)
    {
        double x1 = this.posicionX;
        double x2 = p.getPosicionX();
        double y1 = this.posicionY;
        double y2 = p.getPosicionY();
        return Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1), 2)));
    }    

    //Inserte acá los SETTERS Y GETTERS
    
    public String getNombre() 
    {
        return nombre;
    }

    public char getSexo() 
    {
        return sexo;
    }

    public double getPosicionX() 
    {
        return posicionX;
    }

    public double getPosicionY() 
    {
        return posicionY;
    }

    public double getDamage() 
    {
        return damage;
    }

    public double getVida() 
    {
        return vida;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) 
    {
        this.sexo = sexo;
    }

    public void setPosicionX(double posicionX) 
    {
        this.posicionX = posicionX;
    }

    public void setPosicionY(double posicionY) 
    {
        this.posicionY = posicionY;
    }

    public void setDamage(double damage) 
    {
        this.damage = damage;
    }

    public void setVida(double vida) 
    {
        this.vida = vida;
    }   
}


