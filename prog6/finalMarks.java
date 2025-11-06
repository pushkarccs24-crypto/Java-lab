import java.util.*;
import CIE.*;
import SEE.*;

class Student{
    internal internal;
    external external;
    int[] finalMarks=new int[5];

    public Student(String usn,String name,int sem,int[] internalMarks,int[] externalMarks){
        internal = new internal(usn, name, sem, internalMarks);
        external = new external(usn, name, sem, externalMarks);
        calculateFinalMarks();
    }

     private void calculateFinalMarks() {
        int[] intMarks = internal.getInternalMarks();
        int[] extMarks = external.getExternalMarks();
        
        for(int i = 0; i < 5; i++) {
            finalMarks[i] = intMarks[i] + (extMarks[i] / 2);
        }
    }

    public void displayFinalMarks() {
        System.out.println("\nSTUDENT DETAILS");
        internal.display();
        System.out.println("\nCourse-wise Marks:");
        
        int[] intMarks = internal.getInternalMarks();
        int[] extMarks = external.getExternalMarks();
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Course " + (i+1) + "\t" + 
                             intMarks[i] + "\t\t" + 
                             extMarks[i] + "\t\t" + 
                             finalMarks[i]);
        }
        
        System.out.println("\nTotal Final Marks: " + getTotalFinalMarks() + "/500");
        System.out.println("Percentage: " + String.format("%.2f", getPercentage()) + "%");
    }

     
    public int getTotalFinalMarks() {
        int total = 0;
        for(int mark : finalMarks) {
            total += mark;
        }
        return total;
    }
    
    public double getPercentage() {
        return (getTotalFinalMarks() / 500.0) * 100;
    }
}
    
public class finalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Student[] students = new Student[n];
        
        for(int i = 0; i < n; i++) {
   
            
            System.out.print("Enter USN: ");
            String usn = sc.nextLine();
            
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter Semester: ");
            int sem = sc.nextInt();
            
            int[] internalMarks = new int[5];
            System.out.println("Enter Internal marks for 5 courses (out of 50):");
            for(int j = 0; j < 5; j++) {
                System.out.print("Course " + (j+1) + ": ");
                internalMarks[j] = sc.nextInt();
                while(internalMarks[j] < 0 || internalMarks[j] > 50) {
                    System.out.print("Invalid! Enter marks between 0-50: ");
                    internalMarks[j] = sc.nextInt();
                }
            }
            
            int[] externalMarks = new int[5];
            System.out.println("Enter External (SEE) marks for 5 courses (out of 100):");
            for(int j = 0; j < 5; j++) {
                System.out.print("Course " + (j+1) + ": ");
                externalMarks[j] = sc.nextInt();
                while(externalMarks[j] < 0 || externalMarks[j] > 100) {
                    System.out.print("Invalid! Enter marks between 0-100: ");
                    externalMarks[j] = sc.nextInt();
                }
            }
            sc.nextLine(); // Consume newline
            
            students[i] = new Student(usn, name, sem, internalMarks, externalMarks);
        }
        
        // Display all students' final marks
        for(int i = 0; i < n; i++) {
            students[i].displayFinalMarks();
        }
        
        
        sc.close();
    }
}