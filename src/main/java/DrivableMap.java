/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /*
     */
    public boolean addDrivable(String id, Drivable obj) {
        if (this.drivable_map.get(id) == null) {
            this.drivable_map.put(id, obj);
            return true;
        } else {
            return false;
        }
    }




    /*
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */
    public boolean hasFasterThan(int speed) {
        for (Drivable value : this.drivable_map.values()) {
            if (value.getMaxSpeed() >= speed) {
                return true;
            }
        }
        return false;
    }





    /*
     */
    public List<Tradable> getTradable() {
        List<Tradable> lst = new ArrayList<>();
        for (String key : this.drivable_map.keySet()) {
            if (this.drivable_map.get(key) instanceof Tradable) {
                lst.add((Tradable) this.drivable_map.get(key));
            }
        }
        return lst;
    }



    
}