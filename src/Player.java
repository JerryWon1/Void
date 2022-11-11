import java.util.HashMap;

public class Player {
    HashMap<String, String> inventory = new HashMap<String, String>();
    String username;

    //add item to location hashmap
    public void addItem(String location, String item) {
        inventory.put(location, item);
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
