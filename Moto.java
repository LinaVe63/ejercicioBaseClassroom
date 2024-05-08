
public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    // No es necesario invocar el metodo cuando se sobreescribe @Override
    // Constructor 
    public Moto(String placa, String marca, double precio, int cilindraje, boolean tieneSidecar) {
         super(placa, marca, precio, cilindraje); // Llama al constructor de la clase base Vehiculo
         this.tieneSidecar = tieneSidecar;
}

    // Sobrescribe el método calcularImpuestoCirculacion de la clase Vehiculo
    @Override
    public void calcularImpuestoCirculacion() {
         double impuestoBase = getPrecio() * 0.02; // Cálculo del 2% del precio de la moto
         
         if (tieneSidecar) {
             double impuestoSidecar = getPrecio() * 0.1; // Cálculo del 10% si la moto tiene Sidecar 
             setImpuestoCirculacion(impuestoBase + impuestoSidecar); //Total impuesto circulacion - CON Sidecar
         } else {
             setImpuestoCirculacion(impuestoBase); // Total impuesto circulacion - SIN Sidecar
         }    
}

    // Método para ajustar la cuota mensual de garaje según si la moto tiene sidecar
    public void cuotaMesGaraje() {
         double cuotaBase = getcuotaMesGaraje(); // Obtiene la cuota actual
         
         if (tieneSidecar) {
             double cuotaTieneSidecar = cuotaBase * 0.5; // Cálculo del 50% de la cuota base
             setcuotaMesGaraje(cuotaBase + cuotaTieneSidecar); // Total coutaMesGaraje -CON sidecar
         } else {
             setcuotaMesGaraje(cuotaBase); // Total coutaMesGaraje -SIN sidecar
         }
     }
}