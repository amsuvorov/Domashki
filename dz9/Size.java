public enum Size {
    S("S", 60, 50), M("M", 70, 60),
    XL("XL", 80, 70);
    private String abbreviatedName;
    private int width;
    private int length;

    String getAbbreviatedName() {
        return abbreviatedName;
    }

    int getWidth() {
        return width;
    }

    int getLength() {
        return length;
    }

    Size(String abbreviatedName, int width, int length) {
        this.abbreviatedName = abbreviatedName;
        this.width = width;
        this.length = length;
    }

}
