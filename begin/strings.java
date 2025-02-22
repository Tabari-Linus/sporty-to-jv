class ShoutItOut {
    public static void main(String[] args) {
        String message = "It's a good day to have a good day";
        // Concatenate the exclamation to the message 
        String strongMessage = message + "!";
        // Concatenate the period to the message 
        String softMessage = message + ".";
        // Output the strongMessage in uppercase
        System.out.println(strongMessage.toUpperCase());
        // Output the softMessage in lowercase
        System.out.println(softMessage.toLowerCase());
    }
}