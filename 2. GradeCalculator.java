import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //input no of subjects taken by the student
        System.out.println("No of Subjects: ");
        int noOfSubjects = sc.nextInt();

        //input marks obtained by the student in each subject in an array
        int []marks = new int[noOfSubjects];
        System.out.println("Marks obtained in " +noOfSubjects+ " subjects");
        for(int i = 0;i < noOfSubjects;i++){
            if(sc.hasNextInt()){
                marks[i] = sc.nextInt();
            }
        }

        int averagePercentage = 0;
        int totalMarks =0;
        //calculating total marks
        for(int i = 0;i < noOfSubjects;i++){
            totalMarks = totalMarks + marks[i];
        }
        System.out.println("Total Marks: "+totalMarks);

        //calculating average percentage
        averagePercentage = totalMarks/noOfSubjects;
        System.out.println("Average Percentage: "+averagePercentage);

        //assigning grades based on average percentage
        if(averagePercentage >= 90){
            System.out.println("Your grade is A");
        }
        else if(averagePercentage >= 80){
            System.out.println("Your grade is B");
        }
        else if(averagePercentage >= 70) {
            System.out.println("Your grade is C");
        }
        else if(averagePercentage >= 60) {
            System.out.println("Your grade is D");
        }
        else if(averagePercentage >= 50) {
            System.out.println("Your grade is E");
        }
        else{
            System.out.println("Your grade is F");
            System.out.println("You have failed to cross the qualifying mark");
        }
    }
}
