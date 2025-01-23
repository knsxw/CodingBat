public String withoutX2(String str) {
    if (str.length() > 1 && str.charAt(0) == 'x' && str.charAt(1) == 'x')
        return str.substring(2, str.length());
    if (str.length() > 1 && str.charAt(1) == 'x')
        return str.substring(0, 1) + str.substring(2, str.length());
    if (str.length() > 0 && str.charAt(0) == 'x')
        return str.substring(1, str.length());
    return str;
}
