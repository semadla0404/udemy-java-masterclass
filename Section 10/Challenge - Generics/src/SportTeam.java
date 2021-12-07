public class SportTeam<T> implements Comparable<SportTeam<T>>{
    private String name;
    private int gamesPlayed = 0;
    private int wins = 0;
    private int losses = 0;
    private int ties = 0;

    public SportTeam(String name) {
        this.name = name;
        System.out.println("Team Created: " + this.name);
    }

    public String getName() {
        return name;
    }

    public void matchResult(SportTeam<T> opponent, int ourScore, int theirScore) {

        String message;

        if(ourScore > theirScore) {
            wins++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            ties++;
            message = " drew with ";
        } else {
            losses++;
            message = " lost to ";
        }
        gamesPlayed++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (wins * 2) + ties;
    }

    @Override
    public String toString() {
        return  name +
                " (" + ranking() + " pts): " +
                "games played = " + gamesPlayed +
                ", wins = " + wins +
                ", losses = " + losses +
                ", ties = " + ties
                ;
    }

    @Override
    public int compareTo(SportTeam<T> team) {
        return Integer.compare(team.ranking(), this.ranking());
    }
}
