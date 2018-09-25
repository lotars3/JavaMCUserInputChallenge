package ArrayList09;


import java.util.ArrayList;
import java.util.List;

public class GroceryList{

    private List<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have" + groceryList.size());
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + "." + groceryList.get(i));
        }
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
        // boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }


}
