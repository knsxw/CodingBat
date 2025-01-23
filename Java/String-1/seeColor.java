public String seeColor(String str) {
    if (str.startsWith("blue"))
        return "blue";
    if (str.startsWith("red"))
        return "red";
    return "";
    /*
     * if (str.length() < 3) {
     * return "";
     * }
     * if (str.length() >= 4) {
     * return str.startsWith("blue")?"blue":(str.startsWith("red")?"red":"");
     * }
     * return str.startsWith("red")?"red":"";
     */
}
