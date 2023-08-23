def round_sum(a, b, c):
  return round10(a)+round10(b)+round10(c)
def round10(num):
  if 5 <= num%10 <= 9:
    return ((num//10)+1)*10
  return (num//10)*10
