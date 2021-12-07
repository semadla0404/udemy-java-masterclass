public class Main {

    public static void main(String[] args) {
        // Create some leagues
        League<SportTeam<FootballTeam>> footballLeague = new League<>("National Football League");
        League<SportTeam<BaseballTeam>> baseballLeague = new League<>("Major League Baseball");
        League<SportTeam<SoccerTeam>> soccerLeague = new League<>("Major League Soccer");

        // Create some teams
        SportTeam<FootballTeam> cowboys = new SportTeam<>("Cowboys");
        SportTeam<FootballTeam> texans = new SportTeam<>("Texans");
        SportTeam<FootballTeam> giants = new SportTeam<>("Giants");
        SportTeam<FootballTeam> saints = new SportTeam<>("Saints");

        SportTeam<BaseballTeam> astros = new SportTeam<>("Astros");
        SportTeam<BaseballTeam> rangers = new SportTeam<>("Rangers");
        SportTeam<BaseballTeam> marlins = new SportTeam<>("Marlins");
        SportTeam<BaseballTeam> angels = new SportTeam<>("Angels");

        SportTeam<SoccerTeam> safc = new SportTeam<>("SAFC");
        SportTeam<SoccerTeam> lafc = new SportTeam<>("LAFC");
        SportTeam<SoccerTeam> columbusCrew = new SportTeam<>("Columbus Crew");
        SportTeam<SoccerTeam> dallasTexans = new SportTeam<>("Dallas Texans");

        // Add teams to a league: football
        footballLeague.addTeam(cowboys);
        footballLeague.addTeam(texans);
        footballLeague.addTeam(giants);
        footballLeague.addTeam(saints);
//        footballLeague.addTeam(lafc);

        // Add teams to a league: baseball
        baseballLeague.addTeam(astros);
        baseballLeague.addTeam(rangers);
        baseballLeague.addTeam(marlins);
        baseballLeague.addTeam(angels);

        // Add teams to a league: soccer
        soccerLeague.addTeam(safc);
        soccerLeague.addTeam(lafc);
        soccerLeague.addTeam(columbusCrew);
        soccerLeague.addTeam(dallasTexans);
        soccerLeague.addTeam(dallasTexans);

        // Print league rankings prior to match play
        footballLeague.printTeamRanking();
        baseballLeague.printTeamRanking();
        soccerLeague.printTeamRanking();

        // Football: Record match play
        cowboys.matchResult(texans, 28, 14);
        cowboys.matchResult(giants, 14, 13);
        cowboys.matchResult(saints, 10, 13);

        texans.matchResult(saints, 56, 49);
        texans.matchResult(giants, 9, 9);
        texans.matchResult(cowboys, 17, 21);

        giants.matchResult(saints, 14, 10);
        giants.matchResult(texans, 28, 21);
        giants.matchResult(cowboys, 0, 0);

        saints.matchResult(cowboys, 14, 10);
        saints.matchResult(texans, 28, 21);
        saints.matchResult(giants, 0, 0);
//        saints.matchResult(safc, 3, 3);

        // Print league rankings
        footballLeague.printTeamRanking();

    }
}
