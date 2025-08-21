package ArrayProblems.level1;
import java.util.*;
public class NumberStatus {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[]nums = new int[5];
        for(int i=0;i<5;i++){
            nums[i]=read.nextInt();
        }
        for(int i=0;i<5;i++){
            if(nums[i]==0){
                System.out.println("Zero");
            }
            else if(nums[i]<0){
                System.out.println("Negative");
            }
            else{
                if(nums[i]%2==0){
                    System.out.println("Even Number");
                }
                else{
                    System.out.println("Odd Number");
                }
            }
        }
        if(nums[0]>nums[nums.length-1]){
            System.out.println("First Number is greater than Last Number");
        }
        else if(nums[0]<nums[nums.length-1]){
            System.out.println("Last Number is greater than First Number");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}