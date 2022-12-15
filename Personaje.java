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
}
