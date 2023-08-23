def no_teen_sum(a, b, c):
  def fix_teen(n):
    if 13 <= n <= 19:
      if n == 15 or n == 16:
        return n
      return 0
    return n
  return fix_teen(a)+fix_teen(b)+fix_teen(c)
