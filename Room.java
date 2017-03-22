import java.util.ArrayList;
public class Room{
    private String name;
    private ArrayList<Holder> containers;
    private FileRead reader;
    public Room(int level, String type){
        name = type;
        containers = new ArrayList<>();
        reader = new FileRead();
        String[] roomInfo = reader.roomReader(type);
        for(int i = 0; i < Integer.parseInt(roomInfo[1]); i++){
            containers.add(new Chest(type, level));
        }
        for(int i = 0; i < Integer.parseInt(roomInfo[2]); i++){
            containers.add(new WeaponRack(level));
        }
        for(int i = 0; i < Integer.parseInt(roomInfo[3]); i++){
            containers.add(new WeaponDisplay(level));
        }
        for(int i = 0; i < Integer.parseInt(roomInfo[4]); i++){
            containers.add(new Mannequin(level));
        }
    }

    public ArrayList<Holder> getContainers(){
        return containers;
    }

    public String getName(){
        return name;
    }
}
