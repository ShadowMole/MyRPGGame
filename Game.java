public class Game{
    private Team team;
    private Map map;
    public Game(){
        map = new Map();
        team = new Team();
    }

    public Team getTeam(){
        return team;
    }
}
