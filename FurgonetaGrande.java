
/**
 * Write a description of class FurgonetaGrande here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaGrande extends VehiculoMayor
{
    // instance variables - replace the example below with your own
    private int pesoMedio;

    /**
     * Constructor for objects of class FurgonetaGrande
     */
    public FurgonetaGrande(Marca marca, int antiguedad, int kilometraje, int pesoMedio)
    {
        super(marca, antiguedad, kilometraje, pesoMedio);
    }
    
    /**
     * Analiza si el vehiculo cumple las medidas
     */
    @Override
    public boolean cumplenMedidas(){
        boolean cumplen = false;
        if(getPesoMedio() < 3000){
            cumplen = true;
        }
        else if(getPesoMedio() < 2000){
            cumplen = true;
        }
        return cumplen;
    }
    
    public int[] getDatosVehiculo(){
        int datos[] = {getID(), getAntiguedad(), getKilometraje(), 
                        getPesoMedio()};
        return datos;
    }
}
