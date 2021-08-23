package ch5.ex4;

public class Test {
    public static void main(String[] args) {
        Competition comp1 = new Competition("LOL", "Losers", "Winners", 2015);
        Competition comp2 = new Competition("Kek", "Winners", "Losers", 2016);
        comp1.toString();
        Team team1 = new Team("Losers", "Vasya", "Artem", "Yulia", "Kesha", comp1, comp2);
        team1.displayInfo();
        Team team2 = new Team(team1);
        team2.setTeamName("Winners");
        System.out.println(team1.getTeamName());
        System.out.println(team2.getTeamName());
        Competition comp3 = new Competition(comp1);
        comp3.setYear(2020);
        System.out.println(comp1.getYear());
    }
}
