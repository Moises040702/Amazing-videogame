public class Personaje {
    private String nombre;
    private int fuerza;
    private Escenario localizacion;
    public Personaje(String nombreDePersonaje, int fuerzaDePersonaje, Escenario localizacionDePersonaje){ 
        nombre = nombreDePersonaje;
        fuerza = fuerzaDePersonaje;
        localizacion = localizacionDePersonaje;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public void setFuerza(int otraFuerza){
        fuerza = otraFuerza;
    }

    public void setLocalizacion(Escenario nuevaLocalizacion){
        localizacion = nuevaLocalizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public Escenario getLocalizacion() {
        return localizacion;
    }
    public void imprimirDetalles(){
        System.out.println("Nombre: " + nombre  + " Fuerza: " + fuerza + " Llueve: " + localizacion.getLlueve() + 
                            " Tamanio del escenario: " + localizacion.getTamanio()); 
    }
}
