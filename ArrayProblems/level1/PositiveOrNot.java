import java.util.Scanner;
public class PositiveOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums =new int[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter the number: ");
            nums[i] = sc.nextInt();
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                if(nums[i]% 2==0){
                    System.out.println("Even");
                }
                else{
                    System.out.println("Odd");
                }
            }
            else if(nums[i]==0){
                System.out.println("Zero");
            }
            else{
                System.out.println("Negative");
            }

        }
        int first = nums[0];
        int last = nums[nums.length-1];
        if(first==last){
            System.out.println("equal");
        }
        else if(first>last){
            System.out.println("first number is greater than last");
        }
        else{
            System.out.println("first number is lesser than last");
        }
    }
}