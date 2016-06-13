
/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche extends VehiculoMenor 
{

    /**
     * Constructor for objects of class Coche
     */
    public Coche(Marca marca, int antiguedad, int kilometraje, int plazas)
    {
        super(marca, antiguedad, kilometraje, plazas);
    }

    /**
     * Devuelve cada cuantos años tiene que pasar la revision
     */
    public int revision(){
        int revision = 1;
        if(getMarca().equals("FORD")){
            revision = 2;
        }
        return revision;
    }

    /**
     * Analiza si el vehiculo cumple las medidas
     */
    @Override
    public boolean cumplenMedidas(){
        boolean cumplen = false;
        if(getPlazas() <= 5){
            cumplen = true;
        }
        return cumplen;
    }

    public int[] getDatosVehiculo(){
        int datos[] = {getID(), getAntiguedad(), getKilometraje(), 
                        getPlazas(), revision()};
        return datos;
    }
}
