package zooAnimales;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class Anfibio extends Animal {
    private static List<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    
    public Anfibio() {
        listado.add(this);

    }
    
    public Anfibio(String nombre, int edad,String habitat, String genero, String colorPiel, boolean venenoso){
        this();
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.setColorPiel(colorPiel);
        this.setVenenoso(venenoso);
    }

    public static List<Anfibio> getListado() {
        return listado;
    }

    public static void setListado(List<Anfibio> listado) {
        Anfibio.listado = listado;
    }

    public static int getRanas() {
        return ranas;
    }

    public static void setRanas(int ranas) {
        Anfibio.ranas = ranas;
    }

    public static int getSalamandras() {
        return salamandras;
    }

    public static void setSalamandras(int salamandras) {
        Anfibio.salamandras = salamandras;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
    
    
    public int cantidadAnfibios() {
        return Anfibio.listado.size();
    }
    
    public String movimiento() {
        return "saltar";
    }
    
    public static Anfibio crearRana(String nombre, int edad, String genero){
        Anfibio.ranas += 1;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }
    
    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        Anfibio.salamandras += 1;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }
}
