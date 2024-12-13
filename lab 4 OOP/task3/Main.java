package lab4.task3.sensors;

public class Main {
    public static void main(String[] args) {
        FahrenheitSensor fahrenheitSensor = new FahrenheitSensor();

        TemperatureSensor adapter = new TemperatureAdapter(fahrenheitSensor);

        System.out.println("Температура в Цельсіях: " + adapter.getTemperature());
    }
}

interface TemperatureSensor {
    double getTemperature();
}

class CelsiusSensor implements TemperatureSensor {
    private double temperature;

    public CelsiusSensor(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        System.out.println("Temperature in Celsius: " + temperature);
        return temperature;
    }
}

class FahrenheitSensor {
    private double temperatureFahrenheit;

    public FahrenheitSensor() {
        this.temperatureFahrenheit = temperatureFahrenheit;
    }

    public double getTemperatureFahrenheit() {
        return temperatureFahrenheit;
    }
}

class TemperatureAdapter implements TemperatureSensor {
    private FahrenheitSensor fahrenheitSensor;

    public TemperatureAdapter(FahrenheitSensor fahrenheitSensor) {
        this.fahrenheitSensor = fahrenheitSensor;
    }

    @Override
    public double getTemperature() {
        return (fahrenheitSensor.getTemperatureFahrenheit() - 32) * 5.0 / 9.0;
    }
}
