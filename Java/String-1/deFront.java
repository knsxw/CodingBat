public String deFront(String str) {
    if (str.length() == 1 && str.charAt(0) != 'a')
        return "";
    if (str.length() >= 2) {
        if (str.charAt(0) != 'a' && str.charAt(1) != 'b')
            return str.substring(2);
        if (str.charAt(0) != 'a')
            return str.substring(1);
        if (str.charAt(1) != 'b')
            return "a" + str.substring(2);
    }
    return str;
}
