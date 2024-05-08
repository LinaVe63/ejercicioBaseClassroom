
public class Garaje implements iGarage {

    static final int NUMERO_ESPACIOS = 12; // Número de espacios constante de la clase Garaje
    Vehiculo[] espacios; // Arreglo de espacios vehículos en el garaje
    int contadorAutos;
    int contadorMotos;


    // Constructor
    public Garaje() {
        this.espacios = new Vehiculo[NUMERO_ESPACIOS];
        this.contadorAutos = 0;
        this.contadorMotos = 0;
    }
    
    //Buscar dentro del array si hay espacio libre y cuál
    public void agregarVehiculo(Vehiculo vehiculo) {
        for (int i = 0; i < espacios.length; i++) {
            if (espacios[i] == null) {
                espacios[i] = vehiculo;
                
                //Actualziar contador de Auto y Moto 
                if (vehiculo instanceof Auto) {
                    contadorAutos++;
                }else if (vehiculo instanceof Moto) {
                    contadorMotos++;
                }
                break;
            }
        }
    }

    @Override
    public double calcularIngresos() {
        double ingresosTotales = 0.0;

        for (Vehiculo espacio : espacios) {
            if (espacio != null) {
                ingresosTotales += espacio.getcuotaMesGaraje();
            }
        }
        return ingresosTotales;
    }

    @Override
    public int calcularOcupacionPorTipoVehiculo(Vehiculo v) {
        int contador = 0;

        for (Vehiculo espacio : espacios) {
            if (espacio != null) {
                if (v instanceof Auto && espacio instanceof Auto){
                contador++;    
                }else if (v instanceof Moto && espacio instanceof Moto)
                contador++;
            }
        }
        return contador;
    }
}

