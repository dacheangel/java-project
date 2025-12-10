public class StudentScores{
    public static void main(String[]args){
        int[][]marks={
            {75,80,90},// Student 1
            {65,70,85},// Student 2
            {88,92,81},// Student 3
        };
        System.out.println("Marks Table:");
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nAverage Marks of Each Student:");
        for(int i=0;i<marks.length;i++){
            int sum=0;
            for(int j=0;j<marks[i].length;j++){
                sum+=marks[i][j];
            }
            double average=(double)sum/marks[i].length;
            System.out.println("Student " + (i+1) + ": " + average);
        }
    }
}