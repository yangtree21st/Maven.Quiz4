package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    List<Spice> spices =new ArrayList<>() ;
    Map<Spice, Integer> map ;

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
//        map = new HashMap<SpiceType, Integer>();




        for(int i = 0; i< spices.size();i++){

            Class spiceType = spices.get(i).getClass();
//            map.put((SpiceType)spiceType,count((ArrayList<Spice>) spices,spices.get(i)));
        }
        return null;
    }
    public int count(ArrayList<Spice> s,Spice spice ){
        int count = 0;
        for(int i =0; i< s.size();i++){
            if(s.contains(spice)){
                count++;
            }
        }
        return count;
    }


    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
