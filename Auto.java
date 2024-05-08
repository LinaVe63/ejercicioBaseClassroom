
public class Auto extends Vehiculo {
    private boolean tieneRadio;
    private boolean tieneNavegador;
    
    // Constructor 
    public Auto(String placa, String marca, double precio, int cilindraje, boolean tieneRadio, boolean tieneNavegador) {
        super(placa, marca, precio, cilindraje); // Llama al constructor de la clase base Vehiculo
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
    }

    // Sobrescribe el método calcularImpuestoCirculacion de la clase Vehiculo
    @Override
    public void calcularImpuestoCirculacion() {
        double impuestoBase = getPrecio() * 0.02; // Cálculo del 2% del precio del auto
        
        if (tieneRadio) {
            double impuestoTieneRadio = getPrecio() * 0.01; // Cálculo del 1% si tiene radio
            setImpuestoCirculacion(impuestoBase + impuestoTieneRadio); // Total impuesto circulacion con radio
        } else if (tieneNavegador) {
            double impuestoTieneNavegador = getPrecio() * 0.02; // Cálculo del 2% si tiene Navegador
            setImpuestoCirculacion(impuestoBase + impuestoTieneNavegador); // Total impuesto circulacion con navegador
        } else {
            setImpuestoCirculacion(impuestoBase); // Total impuesto circulacion sin radio ni navegador
        }
    }

    // Método para ajustar la cuota mes garaje para cilindraje > 2499
    public void cuotaMesGaraje() {
        double cuotaBase = getcuotaMesGaraje(); // Obtiene la cuota actual
        
        // Si el cilindraje es mayor de 2499, aumenta la cuota en un 20%
        if (getCilindraje() > 2499) {
            double aumentoCuota = cuotaBase * 0.2; // Cálculo del 20% sobre el valor actual de la cuota
            setcuotaMesGaraje(cuotaBase + aumentoCuota); // Nueva cuota mensual de garaje
        } else {
            setcuotaMesGaraje(cuotaBase); // Total cuota si no cumple la condición
        }
    }
}
