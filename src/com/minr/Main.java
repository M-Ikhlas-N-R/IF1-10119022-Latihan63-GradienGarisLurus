package com.minr;

/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : latihan abstract dan interface
 *
 */
public class Main {

    public static void main(String[] args) {
        Koordinat gradien1 = new Koordinat(2,10,5,7);
        System.out.println("Garis yang memalui titik (" + gradien1.getX1() + "," + gradien1.getY1() + 
                           ") dan (" + gradien1.getX2() + "," + gradien1.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + gradien1.hitungGradien());
        
        Koordinat gradien2 = new Koordinat(5,1,3,12);
        System.out.println("Garis yang memalui titik (" + gradien2.getX1() + "," + gradien2.getY1() + 
                           ") dan (" + gradien2.getX2() + "," + gradien2.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + gradien2.hitungGradien());
    }
    
}
