class ReportCard {

    public static void main(String[] args) {
        int score = 85;
        char grade = assignGrade(score);
        // Add the condition to check if a person's grade is F
		if (grade == 'F') {
            System.out.println("Sorry, you did not pass");
        } // Add and else statement to print a passing score when the grade is not F
        else {
            System.out.println("You have passed the course with a grade of: " + grade);
        }
    }
    
    public static char assignGrade (int score){
        // Add a conditional to check if the score parameter is larger than 90
        if (score > 90) {
            return 'A';
        } // Add an else conditional to check if the score is larger than 80
        else if(score > 80) {
            return 'B';
        } else if (score > 70) {
            return 'C';
        }else{
        return 'F';
    }
    }
}