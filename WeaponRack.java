import java.util.ArrayList;
import java.util.Random;
public class WeaponRack extends Holder{
    private Random rgen;
    public WeaponRack(int level){
        super();
        rgen = new Random();
        for(int i = 0; i < rgen.nextInt(6); i++){
            super.addItem(new Weapon(level));
        }
    }
}
