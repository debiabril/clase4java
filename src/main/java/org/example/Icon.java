package org.example;

public class Icon {
    public static Icon MUSICAL_NOTE = new Icon(new int[]{55356, 57269});
    public static Icon ROCKET = new Icon(new int[]{55357, 56960});
    public static Icon FIRE = new Icon(new int[]{55357, 56613});
    private int[] internalEncoding;

    Icon(int[] internalEncoding) {
        this.internalEncoding = internalEncoding;
    }

    public String texto() {
        return new String(this.internalEncoding, 0, this.internalEncoding.length);
    }
}
