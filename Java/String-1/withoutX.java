public String withoutX(String str) {
    int start = 0;
    int end = str.length();
    if (end > 0 && str.charAt(0) == 'x')
        start++;
    if (end > 1 && str.charAt(end - 1) == 'x')
        end--;
    return str.substring(start, end);
}
