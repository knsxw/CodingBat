public String atFirst(String str) {
    return (str.length() == 1) ? str + "@" : ((str.length() == 0) ? "@@" : str.substring(0, 2));
}
