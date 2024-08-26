public int max1020(int a, int b) {
    int max = a;
    int min = b;
    if (b > a) {
      max = b;
      min = a;
    }
    
    if (10 <= max && max <= 20)
      return max;
    if (10 <= min && min <= 20)
      return min;
    return 0;
}