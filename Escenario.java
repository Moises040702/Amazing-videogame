public class Escenario
{
    private float tamanio;
    private boolean llueve;
    /**
     * Constructor for objects of class Escenario
     */
    public Escenario(float tamanioDelPersonaje)
    {
        tamanio = tamanioDelPersonaje;
        llueve = true;
    }

    public float getTamanio() {
        return tamanio;
    }

    public boolean getLlueve() {
        return llueve;
    }

    public void setTamanio(float otroTamanio) {
        tamanio = otroTamanio;
    }

    public void setLlueve(boolean otroLlueve) {
        llueve = otroLlueve;
    }

    public void imprimirDetalles(){
        System.out.println("Tamaño: " + tamanio  + " ¿Llueve?: " + llueve); 
    }
}

