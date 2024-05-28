import java.util.Scanner;
public class studentgradecalculator
{
    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("student grade calculator");
        System.out.println("enter the no.of subjects");
        int ns = sc.nextInt();
        int total = 0;
        for(int i=0;i<ns;i++) {
            System.out.println("enter marks obtaines in " + i+1 + ":");
            int marks = sc.nextInt();
            total+=marks;
        }
        double averp=(double)total/ns;
        char grade;
        if(averp>=90) {
            grade='O';
        }
        else if(averp>=80) {
            grade='A';
        }
        else if(averp>=70) {
            grade='B';
        }
        else if(averp>=60) {
            grade='C';
        }
        else if(averp>=50) {
            grade='D';
        }
        else if(averp>=40) {
            grade='E';
        }
        else {
            grade='F';
        }
        System.out.println("total marks scored is"+ total);
        System.out.println("average  percentaeg gained is" + averp );
        System.out.println("grade " +grade);
    }
}
