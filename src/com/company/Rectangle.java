package com.company;
import java.util.Scanner;
public class Rectangle {
    private float length;
    private float width;

    Rectangle() {
        this.length=1;
        this.width=1;
    }

    public void setRectangle(Scanner scan) {
        System.out.println("length: ");
        this.length =scan.nextFloat();
        System.out.println("width: ");
        this.width = scan.nextFloat();
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
        r1.setRectangle(input);
        System.out.println(r1.toString());
        float width=r1.getwidth();
        float length=r1.getlength();

        r1.luas(width, length);
        r1.keliling(width,length);




    }
}


