import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter target");
        int target = kb .nextInt();
        System.out.println("Enter length of the array");
        int length = kb.nextInt();
        int [] array = new int[length];
        for(int i=0; i<length;i++){
            array[i] = kb.nextInt();
        }
        array = twoSum(array,target);
        for (int i =0; i<array.length;i++){
            System.out.print(array[i]);
        }
    }
    public static int[] twoSum(int[] nums, int sum) {
        int index1 = 0;
        int index2 = 0;

        for (int i =0; i<nums.length-1; i++){ // loop for checking the sum of adjucent elements of the array
            for (int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==sum){
                    index1=i;
                    index2=j;
                }
            }


        }


        int [] index = {index1,index2};
        return index ;

    }

}