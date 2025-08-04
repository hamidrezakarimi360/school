package org.example;

public class Lesson {
    private String namebook;
    private int codebook;

    public Lesson(String namebook, int codebook) {
        this.namebook = namebook;
        this.codebook = codebook;
    }

    String getNamebook() {
        return namebook;
    }
    public void  setNamebook(String namebook) {
        this.namebook = namebook;
    }
    int getCodebook() {
        return codebook;
    }
    public void setCodebook(int codebook) {
        this.codebook = codebook;
    }
}
