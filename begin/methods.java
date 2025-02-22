class TempConversion {

	// Define the temperature conversion method
    static int fahrenheitToCelsius (int fahrenheitTemperature){
    	// Compute and return the celsius temperature from the parameter
    	return (fahrenheitTemperature - 32) * 5/9;
    }

	public static void main(String[] args) {
    	// Call the method to print the conversion of 32F 
        System.out.println("32F in Celsius is: " + fahrenheitToCelsius(32));
        // Call the method to print the conversion of 90F 
        System.out.println("90F in Celsius is: " + fahrenheitToCelsius(90));
    }
}