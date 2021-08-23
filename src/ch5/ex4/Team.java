package ch5.ex4;

public class Team {
    private String teamName;
    private String name1, name2, name3, name4;
    private Competition competition1, competition2;

    public Team(String teamName, String name1, String name2, String name3, String name4, Competition competition1, Competition competition2) {
        this.teamName = teamName;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.competition1 = competition1;
        this.competition2 = competition2;
    }

    public Team() {
        this.teamName = null;
        this.name1 = null;
        this.name2 = null;
        this.name3 = null;
        this.name4 = null;
        this.competition1 = null;
        this.competition2 = null;
    }

    public Team(Team team){
        this.teamName = team.getTeamName();
        this.name1 = team.getName1();
        this.name2 = team.getName2();
        this.name3 = team.getName3();
        this.name4 = team.getName4();
        this.competition1 = team.getCompetition1();
        this.competition2 = team.getCompetition2();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public Competition getCompetition1() {
        return competition1;
    }

    public void setCompetition1(Competition competition1) {
        this.competition1 = competition1;
    }

    public Competition getCompetition2() {
        return competition2;
    }

    public void setCompetition2(Competition competition2) {
        this.competition2 = competition2;
    }

    public void getNamesTeamMembers(){
        System.out.println(name1 + "\n" + name2 + "\n" + name3 + "\n" + name4 );
    }
    public void displayInfo(){
        System.out.println("Team name: " + getTeamName());
        System.out.println("Members of team: " + getName1() + " " + getName2() + " " +getName3() + " " +getName4());
        System.out.println("Competitions: \n" + getCompetition1().toString() + getCompetition2().toString());
    }

}
