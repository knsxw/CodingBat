public int close10(int a, int b) {
    int aDiff = Math.abs(a - 10);
    int bDiff = Math.abs(b - 10);
    
    if (aDiff < bDiff) {
      return a;
    }
    if (bDiff < aDiff) {
      return b;
    }
    return 0;
}