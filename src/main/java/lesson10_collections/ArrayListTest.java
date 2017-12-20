package lesson10_collections;

/**
 * Created by FlySpot on 14.12.2017.
 */
import java.util.*;

public class ArrayListTest {
    ArrayList lst = new ArrayList();
    Random generator = new Random();

    void addRandom() {
        lst.add(new Integer(generator.nextInt()));
    }


    public String toString() {
        return lst.toString();
    }

    public static void main(String args[]) {
        ArrayListTest tst = new ArrayListTest();
        for(int i = 0; i < 100; i++ )
            tst.addRandom();
        System.out.println("Сто случайных чисел: "+tst.toString());
    }
}