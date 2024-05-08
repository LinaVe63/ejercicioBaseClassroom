
public interface iGarage {
    
    double calcularIngresos(); //Calcula la suma de ingresos mensuales de todos 
    //los vehículos existentes en el garaje
    
    int calcularOcupacionPorTipoVehiculo(Vehiculo v);//Indica cuantos vehículos 
    //hay del tipo pasado por parámetro en el garaje.
}
