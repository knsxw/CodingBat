public boolean startHi(String str) {
    if (str.length() < 2)
      return false;
    String start = str.substring(0,2);
    if (start.equals("hi"))
      return true;
    return false;
}