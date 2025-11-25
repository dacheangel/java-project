import java.util.Scanner;
class Student{
    private String name;
    private double marks;
    public Student(String name, double marks){
        this.name = name;
        this.marks = marks;
    }
    public void displayDetails(){
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
    public double getMarks(){
        return marks;
    }
    public String getName(){
        return name;
    }
}
class GradeCalculator{
    public static String calculateGrade(double marks){
        if(marks >= 90){
            return "A";
        } else if(marks >= 80){
            return "B";
        } else if(marks >= 70){
            return "C";
        } else {
            return "D";
        }
    }
}
public class MainApp{
   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        
        Student student = new Student(name, marks);
        student.displayDetails();
        
        String grade = GradeCalculator.calculateGrade(student.getMarks());
        System.out.println("Grade: " + grade);
        
        scanner.close();
    } 
}