package Ejercicio8_termometroIoT;

public class Main {
    public static void main(String[] args) {
        TermometroIoT termometro = new TermometroIoT(25.0);
        double fahrenheit = termometro.obtenerFahrenheit();
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
        System.out.println("La temperatura en Celsius es: " + termometro.getTemperaturaCelsius());
    }
}
