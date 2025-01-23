public String lastChars(String a, String b) {
    String first = (a.length() == 0) ? "@" : a.substring(0, 1);
    String last = (b.length() == 0) ? "@" : b.substring(b.length() - 1);
    return first + last;
}
