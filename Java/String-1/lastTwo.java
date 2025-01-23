public String lastTwo(String str) {
    int l = str.length();
    if (l < 2)
        return str;
    return str.substring(0, l - 2) + str.charAt(l - 1) + str.charAt(l - 2);
}
