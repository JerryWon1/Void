import java.util.HashMap;

public class Player {
    HashMap<Integer, String> inventory = new HashMap<Integer, String>();
    String username;
    int i = 1;
    //add item to location hashmap
    public void addItem(String item) {
        inventory.put(i, item);
        i++;
    }

    //remove item from location hashmap
    public void removeItem(String location) {
        inventory.remove(location);
    }

    //get item from location hashmap
    public String getItem(String location) {
        return inventory.get(location);
    }

    // initialize player
    public Player(String username) {
        this.username = username;
    }

}
