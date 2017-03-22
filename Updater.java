import java.util.*;

public class Updater extends Listener{
    private int remaining;
    public Updater(Integer left){
        super();
        remaining = left;
    }

    public void update(Observable o, Object data){
        if(data instanceof Integer){
            remaining = (Integer) data;
        }
        display();
    }

    public void display(){
        setText("You have " + remaining + " attributes left to assign.");
    }

    public int getRemaining(){
        return remaining;
    }
}
