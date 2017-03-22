import java.util.ArrayList;
import java.util.Scanner;
public class Team implements java.io.Serializable{
    private ArrayList<Character> players;
    private CharacterCreator charCreator;
    public Team(){
        players = new ArrayList<>();
        for(int i = 0;i < 4;i++){
            players.add(new Character());
        }
        charCreator = new CharacterCreator(this);
    }

    public ArrayList<Character> getTeam(){
        return players;
    }

    public void printTeamInfo(){
        for(int i = 0;i < 4;i++){
            players.get(i).printInfo();
            System.out.println("");
        }
    }
}
