package Ejercicio8_termometroIoT;

public class TermometroIoT {
    private double temperaturaCelsius;
    public TermometroIoT(double temperaturaCelsius){
        this.temperaturaCelsius = temperaturaCelsius;
    }
    public double obtenerFahrenheit() {
        return (temperaturaCelsius * 9/5.0) + 32;
    }
    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }
}
