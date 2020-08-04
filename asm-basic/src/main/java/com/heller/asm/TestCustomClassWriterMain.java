package com.heller.asm;

public class TestCustomClassWriterMain {
    public static void main(String[] args) {
        CustomClassWriter ccw = new CustomClassWriter();
        ccw.publicizeMethod();
    }
}
