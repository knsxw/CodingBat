public boolean frontAgain(String str) {
    if (str.length() < 2)
        return false;
    return str.endsWith(str.substring(0, 2));
}
