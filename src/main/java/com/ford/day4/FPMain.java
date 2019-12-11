package com.ford.day4;
import java.util.function.*;

public class FPMain {

    @FunctionalInterface
    interface Writable<T>{
        //T->();
        public void write(T data);
        //public void writeLine(T data);


    }


    public static void main (String args[]){
        //Interface with method to convert as lamda
        Writable<Integer> console = data -> System.out.println("writing to console"+data);
        console.write(10);
        Function<Integer,Integer> increment = x->x+1;
        BiFunction<Integer,Integer,Integer> add=(x,y)->x+y;
        Consumer<String> blackHole=message->System.out.println(message);
        blackHole.accept("Died");
        Supplier<String> mother=()->"Love";
        System.out.println(mother.get());
        Predicate<Integer> isEven = x->x%2==0;
        System.out.println(isEven.test(5));

        System.out.println(increment.apply(2));
        System.out.println(add.apply(2,4));

    }
}
