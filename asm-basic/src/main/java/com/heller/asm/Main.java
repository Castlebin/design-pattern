package com.heller.asm;

public class Main {
    public static void main(String[] args) {
        CustomClassWriter ccw = new CustomClassWriter();
        ccw.publicizeMethod();
    }
}
