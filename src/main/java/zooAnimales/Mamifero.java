package zooAnimales;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class Mamifero extends Animal {
    
    private static List<Mamifero> listado = new ArrayList<>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero() {
        listado.add(this);
    }

    public Mamifero(String nombre, int edad, String genero) {
        this();
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setGenero(genero);
    }
    
    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        this(nombre, edad, genero);
        this.setPelaje(pelaje);
        this.setPatas(patas);
        this.setHabitat(habitat);
    }
    
    public static List<Mamifero> getListado() {
        return listado;
    }

    public static void setListado(List<Mamifero> listado) {
        Mamifero.listado = listado;
    }

    public static int getCaballos() {
        return caballos;
    }

    public static void setCaballos(int caballos) {
        Mamifero.caballos = caballos;
    }

    public static int getLeones() {
        return leones;
    }

    public static void setLeones(int leones) {
        Mamifero.leones = leones;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    public int cantidadMamiferos() {
        return Mamifero.listado.size();
    }
    
    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        Mamifero.caballos += 1;
        return new Mamifero(nombre,edad,genero,"pradera",true,4);
    }
    
    public static Mamifero crearLeon(String nombre, int edad, String genero){
        Mamifero.leones += 1;
        return new Mamifero(nombre,edad,genero,"selva",true,4);
    }
}
