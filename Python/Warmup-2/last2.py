def last2(str):
  count = 0
  if len(str) < 2:
    return 0
  for i in range(len(str)-2):
    if str[i]+str[i+1] == str[-2:]:
      count += 1
  return count
