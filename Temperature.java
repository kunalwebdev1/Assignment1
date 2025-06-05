package Training;

// Temperature.java
// Converts temperature from Celsius to Fahrenheit

public class Temperature {

    // Attribute to store temperature in Celsius
    double celsius;

    // Constructor to initialize temperature in Celsius
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    // Method to display both Celsius and Fahrenheit temperatures
    public void displayTemperatures() {
        System.out.println("Temperature in Celsius    : " + celsius + " °C");
        System.out.println("Converted to Fahrenheit   : " + toFahrenheit() + " °F");
        System.out.println("-------------------------------");
    }

    // Main method to demonstrate the temperature conversion
    public static void main(String[] args) {
        Temperature temp1 = new Temperature(25.0);
        Temperature temp2 = new Temperature(0.0);

        System.out.println("Welcome to the Weather Wizard!\n");
        temp1.displayTemperatures();
        temp2.displayTemperatures();
    }
}

