
public class Vehiculo {
    String placa;
    String marca;
    double precio;
    int cilindraje;
    double impuestoCirculacion;
    double cuotaMesGaraje;
    
    // Constante para la cuota mensual por defecto
    private static final double CONSTANTE_CUOTA_MES_GARAJE = 100.0;
    
    // Constructor  
    public Vehiculo(String placa, String marca, double precio, int cilindraje) {
        this.placa = placa;
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.cuotaMesGaraje = CONSTANTE_CUOTA_MES_GARAJE; // Cuota mensual por defecto
    }
    
    // Constructor sin placa (iniciada en null)
    public Vehiculo(String marca, double precio, int cilindraje) {
        this(null, marca, precio, cilindraje);
    }
    
    // Método para calcular el impuesto de circulación (2% del precio)
    public void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = this.precio * 0.02; // Impuesto del 2% del precio del vehículo
    }
    
    // Método para matricular el vehículo con una placa de 6 caracteres
    public boolean matricular(String matricula) {
        if (matricula != null && matricula.length() == 6) {
            this.placa = matricula;
            return true; // Se ha podido matricular el vehículo
        } else {
            return false; // No se ha podido matricular el vehículo
        }
    }
    
    //Getters y setters Placa, Marca, Precio, Cilindraje, impuestoCirculacion, CuotaMesGaraje

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
        this.calcularImpuestoCirculacion(); // Recalcular impuesto de circulación al cambiar el precio
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }
    
    public void setImpuestoCirculacion(double impuestoCirculacion){
        this.impuestoCirculacion = impuestoCirculacion;
    }
    
    public double getcuotaMesGaraje() {
        return cuotaMesGaraje;
    }

    public void setcuotaMesGaraje(double cuotaMesGaraje) {
        if (cuotaMesGaraje >= 0) {
            this.cuotaMesGaraje = cuotaMesGaraje;
        } else {
            System.out.println("Error: La cuota mensual de garaje NO puede ser negativa.");
        }
    }
}