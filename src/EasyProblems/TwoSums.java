package EasyProblems;

class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        int index1=0, index2=0, addTwoNums=0;
        for(int i=0; i<=nums.length-2;i++){


            for(int j=0; j<=nums.length-1;j++){
                if(i==j) continue;

                addTwoNums = nums[i] + nums[j];

                if(addTwoNums == target) {
                    index1=i;
                    index2=j;
                    break;
                }
            }

            if(addTwoNums == target) break;

        }
        int[] outputArray = {index1, index2};
        return outputArray;

    }
}