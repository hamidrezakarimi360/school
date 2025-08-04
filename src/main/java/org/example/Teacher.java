package org.example;

public class Teacher {
    private String techername;
    private String techerlastname;
    private int techercode;
    public Teacher(String techername, String techerlastname, int codebook) {
        this.techername = techername;
        this.techerlastname = techerlastname;
        this.techercode = codebook;
    }
    public String getTechername() {
        return techername;
    }

    public void setTechername(String techername) {
        this.techername = techername;
    }

    public String getTecherlastname() {
        return techerlastname;
    }

    public void setTecherlastname(String techerlastname) {
        this.techerlastname = techerlastname;

    }

    public int getTechercode() {
        return techercode;
    }

    public void setTechercode(int techercode) {
        this.techercode = techercode;
    }
}
