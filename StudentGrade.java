public class StudentGrade {
    public static void main(String[] args) {

        String name = "Ankith";
        int marks = 85;

        System.out.println("Student: " + name);
        System.out.println("Marks: " + marks);

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
