def count_hi(str):
  count =0
  for i in range(len(str)-1):
    if "hi" == str[i]+str[i+1]:
      count+=1
  return count
