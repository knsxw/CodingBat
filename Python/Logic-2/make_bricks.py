def make_bricks(small, big, goal):
  if small + 5*big < goal:
    return False
  if goal%5 > small:
    return False
  return True
