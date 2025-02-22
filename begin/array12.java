class ArrayWorld {

    public static void main(String[] args) {
        int[] scores = {89, 82, 64, 97, 80, 79, 60, 69, 99, 100};
        // Get the second score from the scores array
        int secondScore = scores[1];
        System.out.println("The second score is: " + secondScore);
        // Print the scores length
        System.out.println(scores.length);
		String helloWorld = "Hello World";
        // Convert helloWorld to an array of char
        char[] chars = helloWorld.toCharArray();
        System.out.println(chars[6]);
        double[] costs = {5.5, 7.2, 1.8, 3.0};
        // Replace 1.8 with 9.4
        costs[2] = 9.4;
    }
}