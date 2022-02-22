public class Enemigo extends Personaje {
    //              ^ (Enemigo hereda de Personaje)
    //Inserte acá los atributos
 
    private int evolucionesAplicadas;
    private int resistencia;
   
    //Inserte acá el método constructor

    public Enemigo(String nombre, char sexo, double posicionX, double posicionY,double damage)
    {
        super(nombre, sexo, posicionX, posicionY, damage);
        this.evolucionesAplicadas = 0;
        this.resistencia = 1;
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)

     public void evolucionar()
    {
      switch(evolucionesAplicadas)
        {
            case 0:
              if(this.getVida()<=30)
                {
                  this.setDamage(this.getDamage()+20);
                  evolucionesAplicadas++;
                  
                }
            case 1:
                if(this.getVida()<=10)
                {
                  this.setResistencia(this.getResistencia()+1);
                  evolucionesAplicadas++;
                  
                }
        }
    }
    @Override
    public void recibirImpacto(double d)
    {
        double impacto = d/this.getResistencia();
        if(impacto <= this.getVida())
        {
            this.setVida(this.getVida()-impacto);
        }
        else
        {
            this.setVida(0);
        }
    }

    //Inserte acá los SETTERS Y GETTERS

    public int getEvolucionesAplicadas() {
        return evolucionesAplicadas;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }  
}
    
  