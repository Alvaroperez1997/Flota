
/**
 * Write a description of class FurgonetaPequeña here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaPequena extends VehiculoMenor
{

    /**
     * Constructor for objects of class Coche
     */
    public FurgonetaPequena(Marca marca, int antiguedad, int kilometraje, int plazas)
    {
        super(marca, antiguedad, kilometraje, plazas);
    }
    
    /**
     * Analiza si el vehiculo cumple las medidas
     */
    @Override
    public boolean cumplenMedidas(){
        boolean cumplen = false;
        if(getPlazas() <= 7){
            cumplen = true;
        }
        return cumplen;
    }
    
    public int[] getDatosVehiculo(){
        int datos[] = {getID(), getAntiguedad(), getKilometraje(), 
                        getPlazas()};
        return datos;
    }
}
