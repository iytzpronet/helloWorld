package org.example.controller;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        //calculo
        double x, y;
        Scanner ler = new Scanner(System.in);

        System.out.println("digite o numero a seguir: ");
        x = ler.nextDouble();

        System.out.println("digite o numero a seguir: ");
        y = ler.nextDouble();

        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));

    }}