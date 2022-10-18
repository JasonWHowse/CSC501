public class Driver {
    public static void main(String[] args) {
        int[] nums = {5,10,3,2,7,8,9};
        int target = 14;
        int index1 = 0, index2 = 0;

        breakFor:
        for(; index1 < nums.length; index1++){
            for(index2 = 0; index2 < nums.length; index2++){
                if(index2!=index1 && nums[index1] + nums[index2] == target){
                    break breakFor;
                }
            }
        }

        System.out.println("[" + index1 + "," + index2 + "]");

    }
}
