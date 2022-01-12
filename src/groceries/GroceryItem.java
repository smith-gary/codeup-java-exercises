package groceries;

import java.util.ArrayList;

public class GroceryItem {
    protected String name;
    protected String category;
    protected ArrayList<String> list;

    public GroceryItem(ArrayList<String> list) {
        this.list = list;
    }
    public GroceryItem() {

    }

    public GroceryItem(String name, String category) {
        this.name = name;
        this.category = category;

    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void addItem(String name) {
        this.name = name;
        list.add(name);
    }


}
