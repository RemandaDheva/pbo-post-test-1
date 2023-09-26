/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

import java.util.ArrayList;

public class Posttest1 {

    public static void main(String[] args) {
        lagu track1 = new lagu("Enchanted","Taylor Swift",2010);
        lagu track2 = new lagu("Back To December","Taylor Swift",2010);
        lagu track3 = new lagu("Set Fire to the Rain","Adele",2011);
        lagu track4 = new lagu("In The Stars","Benson Boone",2022);
        lagu track5 = new lagu("happier","Olivia Rodrigo",2021);
        lagu track6 = new lagu("Tracing That Dream","Yoasobi",2020);
        lagu track7 = new lagu("Film Out","BTS",2021);
        
        ArrayList<lagu> songs = new ArrayList<>();
        songs.add(track1);
        songs.add(track2);
        songs.add(track3);
        songs.add(track4);
        songs.add(track5);
        songs.add(track6);
        songs.add(track7);
        
        for (lagu dataLagu: songs) {
            System.out.println("Lagu Berjudul "+dataLagu.judulLagu+" Dinyanyikan Oleh "+dataLagu.penyanyiLagu+" Sejak Tahun "+dataLagu.tahunRilis+".");
       }
    }   
}
