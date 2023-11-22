package org.example.sem.cw.cw2;


import org.example.sem.cw.Vector;

public class ex3vector {
    public static void main(String[] args) {
        Vector vector = new Vector(1,2,1);
        Vector vector2 = new Vector(1,1,1);

        System.out.println("lenghtVector(vector) = " + vector.lenghtVector());

        System.out.println("vector.scalar(vector2) = " + vector.scalar(vector2));

        System.out.println("vector.vectorProduct(vector2) = " + vector.vectorProduct(vector2));

        System.out.println("vector.cos(vector2) = " + vector.cos(vector2));

        System.out.println("vector.sumVectors(vector2) = " + vector.sumVectors(vector2));

        System.out.println("vector.diffVectors(vector2) = " + vector.diffVectors(vector2));

    }}
