package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        List<String> arraylist = new ArrayList<String>(Arrays.asList(values));
        arraylist.remove(getMiddleElement(values));

        String[] result = arraylist.toArray(new String[values.length-1]);
        return result;

    }

    public static String getLastElement(String[] values) {
       return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        List<String> arraylist = new ArrayList<>(Arrays.asList(values));
        arraylist.remove(getLastElement(values));

        String[] result = arraylist.toArray(new String[values.length-1]);
        return result;
    }
}