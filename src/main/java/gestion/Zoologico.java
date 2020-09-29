package gestion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class Zoologico {
    
    private String nombre;
    private String ubicacion;
    private static List<Zona> zona = new ArrayList<>();

    public Zoologico() {
    } 

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public static List<Zona> getZona() {
        return zona;
    }

    public static void setZona(List<Zona> zona) {
        Zoologico.zona = zona;
    } 
    
    public void agregarZonas(Zona zona) {
        Zoologico.zona.add(zona);
    }
    
    public int cantidadTotalAnimales() {
        int aux = zona.get(0).getAnimales().size();
        return aux + zona.get(1).getAnimales().size();
    }
}
