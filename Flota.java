import java.util.ArrayList;
/**
 * Write a description of class Flota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flota
{
    private ArrayList<Vehiculo> vehiculos;

    /**
     * Constructor for objects of class Flota
     */
    public Flota()
    {
        vehiculos = new ArrayList<>();
    }

    /**
     * Añade un vehiculo a la flota
     */
    public void addVehiculo(Vehiculo vehiculo)
    {
        vehiculos.add(vehiculo);
    }

    /**
     * Elimina un vehiculo de la flota
     */
    public void removeVehiculo(int id){
        boolean vehiculoEliminado = false;
        for(int i = 0; i < vehiculos.size() || !vehiculoEliminado; i++){
            if(vehiculos.get(i).getID() == id){
                vehiculos.remove(i);
                vehiculoEliminado = true;
            }
        }
    }

    /**
     * Devuelve la marca con mayor numero de vehiculos
     */
    public Enum marcaMayoritaria(){
        int nFord = 0;
        int nOpel = 0;
        int nCitroen = 0;
        int nFiat = 0;
        Enum marcaMayoritaria = null;
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo.getMarca().equals("FORD")){
                nFord++;
            }
            else if(vehiculo.getMarca().equals("OPEL")){
                nOpel++;
            }
            else if(vehiculo.getMarca().equals("CITROEN")){
                nCitroen++;
            }
            else if(vehiculo.getMarca().equals("FIAT")){
                nFiat++;
            }
        }

        if (nFord > nOpel && nFord > nCitroen && nFord > nFiat){
            marcaMayoritaria = Marca.FORD;
        }
        if(nOpel > nFord && nOpel > nCitroen && nOpel > nFiat){
            marcaMayoritaria = Marca.OPEL;
        }
        if(nCitroen > nFord && nCitroen > nOpel && nCitroen > nFiat){
            marcaMayoritaria = Marca.CITROEN;
        }
        if(nFiat > nFord && nFiat > nCitroen && nFiat > nOpel){
            marcaMayoritaria = Marca.FIAT;
        }
        return marcaMayoritaria;
    }

    /**
     * Si devuelve true todos cumplen las medidas
     */
    public boolean cumplenMedidas(){
        boolean cumplen = true;
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo.getClass().getName() != "FurgonetaGrande"){
                if(!vehiculo.cumplenMedidas()){
                    cumplen = false;
                }
            }
        }
        return cumplen;
    }
    
    public int[] getDatosVehiculo(int id){
        boolean vehiculoEncontrado = false;
        int[] datos = new int[5];
        for(int i = 0; i < vehiculos.size() && !vehiculoEncontrado; i++){
            if(vehiculos.get(i).getID() == id){
                datos = vehiculos.get(i).getDatosVehiculo();
                vehiculoEncontrado = true;
            }
        }
        return datos;
    }
}
