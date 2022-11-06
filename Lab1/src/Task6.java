import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){

        Scanner scann = new Scanner(System.in);
        System.out.print("Enter number:");
        int lenght = scann.nextInt();

        Integer[] nums = new Integer[lenght];

        for(int i = 0; i < nums.length; i++){
            if(i < 2){
                nums[i]=1;
            }
            else {
                nums[i]=nums[i - 2]+nums[i - 1];
            }
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        System.out.println("Elements in reverse order");
        String result = "";

        for (int i : nums) {
            result = i + " " + result;
        }

        System.out.println(result);

    }
}

