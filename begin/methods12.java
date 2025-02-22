class EvenOrOdd {

	// Define a method to compute and return whether a number is even
    public static boolean isEven(int aNumber){
        int result = aNumber/2;
    	// Return the result multiplied by two equals the input
        return result * 2 == aNumber;
    }
    
    public static void main(String[] args) {
    	// Call on the method with argument 5
        System.out.println("5 even: " + isEven(5));
        // Call on the method with argument 102
        System.out.println("102 even: " + isEven(102));
    }
}