public class Driver {
    public static void main(String[] args) {
        int[] nums = {5,10,3,6,7,8,9};
        int index1 = 0, index2 = 0;

        for(int c = 0; c<nums.length; c++){
            if(nums[c]>nums[index1]){
                index2=index1;
                index1=c;
            }else if(nums[c]>nums[index2] || index1==index2){
                index2=c;
            }
        }

        System.out.println("[" + index1 + "," + index2 + "]");
    }
}
