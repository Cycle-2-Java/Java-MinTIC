public abstract class Boton {

    //Inserte acá los atributos

    private double ancho;
    private double alto;
    private String colorFondo;
    private String colorTexto;
    private String texto;

    //Inserte acá el método constructor

    public Boton(double ancho, 
            double alto, String colorFondo, 
            String colorTexto, String texto) {
        this.ancho = ancho;
        this.alto = alto;
        this.colorFondo = colorFondo;
        this.colorTexto = colorTexto;
        this.texto = texto;
    }


    //Inserte acá los SETTERS Y GETTERS
    
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public String getColorTexto() {
        return colorTexto;
    }

    public void setColorTexto(String colorTexto) {
        this.colorTexto = colorTexto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public abstract void hacerClick();

}