public boolean stringE(String str) {
    int i,count = 0;
    for (i=0; i<str.length(); i++) {
      if(str.charAt(i) == 'e')
        count ++;
    }
    return (1 <= count && count <= 3);
}