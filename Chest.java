import java.util.ArrayList;
import java.util.Random;
public class Chest extends Holder{
    private Random rgen;
    public Chest(String location, int level){
        super();
        rgen = new Random();
        if(location.equals("Blacksmith")){
            for(int i = 0; i < rgen.nextInt(8); i++){
                super.addItem(new Weapon(1 + rgen.nextInt(2)));
            }
            for(int i = 0; i < rgen.nextInt(10); i++){
                super.addItem(new Armor(1 + rgen.nextInt(2)));
            }
        }
        if(location.equals("Merchant Shop")){
            for(int i = 0; i < rgen.nextInt(6); i++){
                super.addItem(new Weapon(1 + rgen.nextInt(1)));
            }
            for(int i = 0; i < rgen.nextInt(6); i++){
                super.addItem(new Armor(1 + rgen.nextInt(1)));
            }
        }
        if(location.equals("Armory")){
            for(int i = 0; i < rgen.nextInt(11); i++){
                super.addItem(new Weapon(level));
            }
            for(int i = 0; i < rgen.nextInt(16); i++){
                super.addItem(new Armor(level));
            }
        }
        if(location.equals("Guard Room")){
            for(int i = 0; i < rgen.nextInt(5); i++){
                super.addItem(new Weapon(level));
            }
            for(int i = 0; i < rgen.nextInt(5); i++){
                super.addItem(new Armor(level));
            }
        }
        if(location.equals("Barracks")){
            for(int i = 0; i < rgen.nextInt(3); i++){
                super.addItem(new Weapon(level));
            }
            for(int i = 0; i < rgen.nextInt(6); i++){
                super.addItem(new Armor(level));
            }
        }
    }
}
