boolean doubleX(String str) {
  int i = str.indexOf("x");
  if (i == -1) 
    return false;
    
  if (i+1 >= str.length())
    return false;
    
  return (str.substring(i,i+2).equals("xx"));
    
}