package com.ford.day4;

public class Sort {
    @FunctionalInterface
    interface TriFunction<A,B,C,R> {
         R apply(A first, B second, C third);
    }

//    public String merge(Integer first, String second, Double third) {
//        return first + second + third;

        public static void main (String args[]){
            TriFunction<Integer,String,Double,String > merger=(first,second,third) -> {
            return first + second + third; };
            System.out.println(merger.apply(1,"teo",1.2));

        }

    }


