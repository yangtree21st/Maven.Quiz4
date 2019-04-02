package rocks.zipcode.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCounter {

    Map<String,Integer> map ;

    public WordCounter(String... strings) {
        map = new HashMap<>();
        for(int i = 0 ; i< strings.length;i++){

            map.put(strings[i],count(strings,strings[i]));

        }
    }

    public int count(String[] strings,String string ){
        int count = 0;
        for(int i =0; i< strings.length;i++){
            if(strings[i].equals(string)){
                count++;
            }
        }
        return count;
    }

    public Map<String, Integer> getWordCountMap() {
        return map;
    }
}
