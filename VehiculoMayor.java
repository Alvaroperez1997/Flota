
/**
 * Write a description of class VehiculoMayor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculoMayor extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int pesoMedio;

    /**
     * Constructor for objects of class FurgonetaGrande
     */
    public VehiculoMayor(Marca marca, int antiguedad, int kilometraje, int pesoMedio)
    {
        super(marca, antiguedad, kilometraje);
        this.pesoMedio = pesoMedio;
    }
    
    public int getPesoMedio(){
        return pesoMedio;
    }
    
    public abstract boolean cumplenMedidas();
}
