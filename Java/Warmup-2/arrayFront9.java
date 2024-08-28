public boolean arrayFront9(int[] nums) {
  int frontLen = 4;
  if (nums.length < 4) {
    frontLen = nums.length;
  }
  for (int i=0; i<frontLen; i++) {
    if(nums[i]==9) {
      return true;
    }
  }
  return false;
}