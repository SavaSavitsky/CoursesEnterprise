package Test.Two;

import java.util.Arrays;
import java.util.Collection;

/*Write a generic method that takes an array of objects and a collection, and puts all objects in
        the array into the collection.*/

public class App02<T> {
    private Collection<T> data(T[] arr, Collection<T> coll) {
        if (arr == null && coll == null) {
            throw new NullPointerException();
        }
        coll.addAll(Arrays.asList(arr));
        return coll;
    }
}
 
