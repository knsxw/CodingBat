def count_evens(nums):
  count = 0
  for ele in nums:
    if ele%2 == 0:
      count+=1
  return count
