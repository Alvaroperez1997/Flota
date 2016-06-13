
/**
 * Write a description of class Vehiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Vehiculo
{
    // instance variables - replace the example below with your own
    private Marca marca;
    private int antiguedad;
    private int kilometraje;
    private static int ID = -1;

    /**
     * Constructor for objects of class Vehiculo
     */
    public Vehiculo(Marca marca, int antiguedad, int kilometraje)
    {
        this.marca = marca;
        this.antiguedad = antiguedad;
        this.kilometraje = kilometraje;
        ID++;
    }
    
    public String getMarca(){
        return marca.name();
    }
    
    public int getAntiguedad(){
        return antiguedad;
    }
    
    public int getKilometraje(){
        return kilometraje;
    }
    
    public int getID(){
        return ID;
    }
    
    public abstract boolean cumplenMedidas();
    
    public abstract int[] getDatosVehiculo();
}
