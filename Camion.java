
/**
 * Write a description of class Camion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camion extends VehiculoMayor
{
    // instance variables - replace the example below with your own
    private int pesoMedio;

    /**
     * Constructor for objects of class FurgonetaGrande
     */
    public Camion(Marca marca, int antiguedad, int kilometraje, int pesoMedio)
    {
        super(marca, antiguedad, kilometraje, pesoMedio);
    }
    
    /**
     * Devuelve
     * Si es true el camion es articulado
     * Sino el camion no es articulado
     */
    public boolean articulado(){
        boolean articulado = false;
        if(getMarca().equals("FORD") || getMarca().equals("FIAT")){
            articulado = true;
        }
        return articulado;
    }
    
    /**
     * Analiza si el vehiculo cumple las medidas
     */
    @Override
    public boolean cumplenMedidas(){
        boolean cumplen = false;
        if(getPesoMedio() < 3000 && articulado()){
            cumplen = true;
        }
        else if(getPesoMedio() < 2000 && !articulado()){
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
