import java.util.ArrayList;
import java.util.Collections;

public class League<T extends SportTeam> {
    private String name;
    private ArrayList<T> leagueTeams = new ArrayList<>();

    public League(String name) {
        this.name = name;
        System.out.println("League Created: " + this.name);
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        // check array list if the team already exists
        if(leagueTeams.contains(team)) {
            System.out.println(team.getName() + " already exists in league.  Not added.");
            return false;
        } else {
            leagueTeams.add(team);
            System.out.println(team.getName() + " added to the " + this.getName());
            return true;
        }
    }

    public void printTeamRanking() {
        System.out.println();
        System.out.println("===== " + this.getName().toUpperCase() + " =====");
        Collections.sort(leagueTeams);
        int i = 1;
        for(T team : leagueTeams) {
            System.out.println(i + ": " + team);
            i++;
        }
        System.out.println("=======================================");
    }

}
