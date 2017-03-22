import java.util.ArrayList;

public abstract class Holder{
    private ArrayList<Item> items;

    public Holder(){
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    public void displayItems(){
        for(Item i : items){
            i.display();
            System.out.println("");
        }
    }
}
