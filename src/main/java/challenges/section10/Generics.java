package challenges.section10;

import java.util.ArrayList;
import java.util.Collections;

public class Generics {
    public static void main(String[] args) {

    }
}

class League<T extends Team> {
    private String leagueName;
    private ArrayList<T> league;

    public League(String leagueName) {
        this.leagueName = leagueName;
        this.league = new ArrayList<>();
    }

    public String getLeagueName() {
        return leagueName;
    }

    public boolean addTeam(T team) {
        if (league.contains(team)) {
            System.out.println(team + " is already in the league");
            return false;
        } else {
            league.add(team);
            System.out.println(team + " was added too the league");
            return true;
        }
    }
    public void showTable() {
        Collections.sort(league);
        for (Team team: league) {
            System.out.println((league.indexOf(team) + 1) + " " + team.getTeamName() + " points: " + team.getPoints());
        }
    }
}

class Team<T extends Player> implements Comparable<Team<T>> {
    private String teamName;
    private int played;
    private int won;
    private int lost;
    private int tied;
    private int points;
    private ArrayList<T> team;

    public Team(String teamName) {
        this.teamName = teamName;
        this.team = new ArrayList<>();
        this.played = 0;
        this.won = 0;
        this.lost = 0;
        this.tied = 0;
        this.points = 0;
    }

    public String getTeamName() {
        return teamName;
    }

    public int numPlayers() {
        return this.team.size();
    }

    public int getPoints() {
        return points;
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            played++;
            won++;
            points += 3;
        } else if (ourScore == theirScore) {
            tied++;
            played++;
            points++;
        } else {
            lost++;
            played++;
        }
    }

    public boolean addPlayer(T player) {
        if (team.contains(player)) {
            System.out.println(player.getName() + " is already in this team");
            return false;
        } else {
            team.add(player);
            System.out.println(player.getName() + " picked for team " + this.teamName);
            return true;
        }
    }

    @Override
    public int compareTo(Team<T> team) {
        return Integer.compare(team.points, this.points);
    }
}

class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class FootballPlayer extends Player {
    public FootballPlayer(String name) {
        super(name);
    }
}

class BaseballPlayer extends Player {
    public BaseballPlayer(String name) {
        super(name);
    }
}

class BasketBallPlayer extends Player {
    public BasketBallPlayer(String name) {
        super(name);
    }
}
