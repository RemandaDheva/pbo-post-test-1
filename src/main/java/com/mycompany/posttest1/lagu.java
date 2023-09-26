package com.mycompany.posttest1;

public class lagu {
    public String judulLagu, penyanyiLagu;
    public int tahunRilis;
    
    public lagu(String judulLagu, String penyanyiLagu, int tahunRilis) {
        this.judulLagu = judulLagu;
        this.penyanyiLagu = penyanyiLagu;
        this.tahunRilis = tahunRilis;
    }
    public String judulLagu() {
        return judulLagu;
    }
    public String penyanyiLagu() {
        return penyanyiLagu;
    }
    public int tahunRilis() {
        return tahunRilis;
    }
    
}
