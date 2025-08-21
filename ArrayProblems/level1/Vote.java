package ArrayProblems.level1;
import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[]ages=new int[10];
        for(int i=0;i<10;i++){
            ages[i]=read.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if(ages[i]>=18){
                System.out.println("the student with the age" + ages[i] + "can vote");
            }
            else if(ages[i]<0){
                System.out.println("Invalid Age");
            }
            else{
                System.out.println("the student with the age" + ages[i] + "cannot vote");
            }
        }
    }
}