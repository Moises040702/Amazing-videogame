public class Escenario
{
    private float tamaño;
    private boolean llueve;
    /**
     * Constructor for objects of class Escenario
     */
    public Escenario(float tamañoDelPersonaje)
    {
        tamaño = tamañoDelPersonaje;
        llueve = true;
    }

    public float getTamaño() {
        return tamaño;
    }

    public boolean getLlueve() {
        return llueve;
    }

    public void setTamaño(float otroTamaño) {
        tamaño = otroTamaño;
    }

    public void setLlueve(boolean otroLlueve) {
        llueve = otroLlueve;
    }

    public void imprimirDetalles(){
        System.out.println("Tamaño: " + tamaño  + " ¿Llueve?:" + llueve); 
    }
}

