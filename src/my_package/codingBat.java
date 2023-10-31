package my_package;

public class codingBat {

    public static void main(String[] args) {

        int nums[] = {1,2,5,6,7};
        System.out.println(nums[2]+2);


    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == nums[i+1] && nums[i] == nums[i+2]){
                return false;
            }
        }
        return true;
    }


}
