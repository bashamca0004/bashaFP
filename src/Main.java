import com.sun.deploy.cache.MemoryCache;
import com.sun.deploy.util.SystemUtils;
import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.Random;

public class Main {

   static long memory = SystemUtils.microTime();
    @Getter
    String number;

    public long add(Integer x, long y){
        return x+y;
    }

    public long addToMemory(Integer x){
        memory = add(x,memory);
        System.out.println(memory);
        return memory;


    }

    public int random(){
        Random rnd = new Random(3);
        return rnd.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Main c= new Main();
        System.out.println(c.add(2,3));
        //System.out.println(c.addToMemory(2));
        System.out.println(c.random());
    }

    public Enum PushAuthEvent{
        MASTER_RESET("202"),
        INVEHICLE("101");

        PushAuthEvent(String s){
            this.number=number;
        }
    }
}

