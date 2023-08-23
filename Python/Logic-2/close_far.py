def close_far(a, b, c):
  if abs(a-b)<=1 and abs(a-c)>=2 and abs(c-b)>=2:
    return True
  elif abs(b-c)<=1 and abs(a-b)>=2 and abs(c-a)>=2:
    return True
  elif abs(c-a)<=1 and abs(c-b)>=2 and abs(a-b)>=2:
    return True
  return False
