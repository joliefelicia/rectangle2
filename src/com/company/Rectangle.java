package com.company;
import java.util.Scanner;
public class Rectangle {
    public float length;
    public float width;

    Rectangle() {
        this.length=1;
        this.width=1;
    }

    Rectangle(float w, float l) {
        this.setRectangle(w, l);
    }

    public void setRectangle(float w, float l) {
        this.length = l;
        this.width = w;
    }

    public float getlength() {
        return length;

    }

    public float getwidth() {
        return width;
    }



    public float luas(float w, float l) {
        float hasil = w * l;
        System.out.println("hasil luas= " + hasil);
        return hasil;

    }

    public float keliling(float w, float l) {
        float hasil = (2 * w) + (2 * l);
        System.out.println("hasil keliling= " + hasil);
        return hasil;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }

}

class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input=new Scanner(System.in);
        Rectangle r1=new Rectangle();
        System.out.println("Selamat datang di program rectangle");
        System.out.println("length: ");
        r1.length=input.nextFloat();
        System.out.println("width: ");
        r1.width=input.nextFloat();
        System.out.println(r1.toString());
        r1.luas(r1.width, r1.length);
        r1.keliling(r1.length,r1.width);




    }
}


