//package com.tts.day3.abs;
//
//class Scratch {
//    public static void main(String[] args) {
//        Adder myAdder = new Adder();
//        System.out.println(myAdder.add(4,3));
//        myAdder.setBrand("Casio");
//        System.out.println(myAdder.getBrand());
//        myAdder.setAdderName("Adder Machine 2000");
//    }
//}
//class Adder extends Calculator {
//    private String adderName;
//    public String getAdderName() {
//        return adderName;
//    }
//    public void setAdderName(String adderName) {
//        this.adderName = adderName;
//    }
//    @Override
//    public Integer add(Integer x, Integer y) {
//        return x + y;
//    }
//}
//abstract class Calculator {
//    private String brand;
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public abstract Integer add(Integer x, Integer y);
//}
