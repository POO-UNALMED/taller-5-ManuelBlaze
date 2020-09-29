package zooAnimales;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class Pez extends Animal {
    
    private static List<Pez> listado = new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez() {
        listado.add(this);
    }
    
    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
        this();
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.setColorEscamas(colorEscamas);
        this.setCantidadAletas(cantidadAletas);
    }
    
    public static List<Pez> getListado() {
        return listado;
    }

    public static void setListado(List<Pez> listado) {
        Pez.listado = listado;
    }

    public static int getSalmones() {
        return salmones;
    }

    public static void setSalmones(int salmones) {
        Pez.salmones = salmones;
    }

    public static int getBacalaos() {
        return bacalaos;
    }

    public static void setBacalaos(int bacalaos) {
        Pez.bacalaos = bacalaos;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
    
    public int cantidadPeces() {
        return Pez.listado.size();
    }
    
    public String movimiento() {
        return "nadar";
    }
    
    public static Pez crearSalmon(String nombre, int edad, String genero){
        Pez.salmones += 1;
        return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
    }
    
    public static Pez crearBacalao(String nombre, int edad, String genero){
        Pez.bacalaos += 1;
        return new Pez(nombre, edad, "oceano", genero, "gris", 6);
    }
}
