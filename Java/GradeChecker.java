public class GradeChecker {
    public static void main(String [] args) {
        int grade = 85;

        if (grade >= 90) {
            System.out.println("Excellent!");
        } else if (grade >= 80) {
            System.out.println("Very good!");
        } else if (grade >= 70) {
            System.out.println("Good!");
        } else if (grade >= 60) {
            System.out.println("Satisfactory!");
        } else {
            System.out.println("Needs improvement!");
        }
    }
}