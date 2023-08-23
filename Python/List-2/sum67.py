def sum67(nums):
  s = 0
  found = False
  for i in range(len(nums)):
    if nums[i] == 6:
      found = True
    if not found:
      s += nums[i]
    if found and nums[i]==7:
      found = False
  return s
