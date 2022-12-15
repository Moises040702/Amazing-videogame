public class Personaje {
    private String nombre;
    private int fuerza;
    private Escenario localizacion;
    public Personaje(String nombreDePersonaje, int fuerzaDePersonaje, Escenario localizacionDePersonaje){ 
        nombre = nombreDePersonaje;
        fuerza = fuerzaDePersonaje;
        localizacion = localizacionDePersonaje;
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
}
