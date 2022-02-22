//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO
import java.util.ArrayList;
public class Condominio {

    //Inserte acá los atributos
    
    private ArrayList<Inmueble> inmuebles = new ArrayList<>();    

    //Inserte acá el método constructor

    public Condominio() {
        this.inmuebles = new ArrayList();
    }

    //Inserte acá los SETTERS Y GETTERS
    
    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }

    
    
    public void agregarInmueble(Inmueble t){
    inmuebles.add(t);
    }
    

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void eliminarInmueble(String ID){ 
        
        for(int i=0;i<inmuebles.size();i++){
        
            if (inmuebles.get(i).getnCasa().equals(ID)){
           inmuebles.remove(i); 
            }
        }    
    }
    
    public double calcularArriendoMensualCondominio(){
        double costototal = 0;
    
        for(int i=0;i<inmuebles.size();i++){
              costototal += inmuebles.get(i).getCostoMensual();        
        }
    
        return costototal;
    }


    public double promedioCostoInmueble(){

        double acumcostoinmueble = 0;    
        for(int i=0;i<inmuebles.size();i++){
              acumcostoinmueble += inmuebles.get(i).getCostoMensual();        
        }
    
        return acumcostoinmueble/inmuebles.size();
    }

    public double desviacionEstandarCostoInmueble(){
    
        double desviacion;
        double datoacum = 0;    
        for(int i=0;i<inmuebles.size();i++){
              datoacum += Math.pow(inmuebles.get(i).getCostoMensual() - promedioCostoInmueble(),2);  
        }
        desviacion = Math.sqrt((1/(inmuebles.size()*1.0)) * datoacum);
    
        return desviacion;    
        } 
}
