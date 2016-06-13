
/**
 * Write a description of class CochePlazas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculoMenor extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int plazas;

    /**
     * Constructor for objects of class Coche
     */
    public VehiculoMenor(Marca marca, int antiguedad, int kilometraje, int plazas)
    {
        super(marca, antiguedad, kilometraje);
        this.plazas = plazas;
    }
    
    public int getPlazas(){
        return plazas;
    }
    
    public abstract boolean cumplenMedidas();
}
