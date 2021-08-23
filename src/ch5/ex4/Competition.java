package ch5.ex4;

public class Competition {
    private String nameComp;
    private String winningNameTeam;
    private String runner_up;
    private int year;

    public Competition(String nameComp, String winningNameTeam, String runner_up, int year) {
        this.nameComp = nameComp;
        this.winningNameTeam = winningNameTeam;
        this.runner_up = runner_up;
        this.year = year;
    }
    public Competition() {
        this.nameComp = null;
        this.winningNameTeam = null;
        this.runner_up =  null;
        this.year = 0000;
    }

    public Competition(Competition competition){
        this.nameComp = competition.getNameComp();
        this.winningNameTeam = competition.getWinningNameTeam();
        this.runner_up = competition.getRunner_up();
        this.year = competition.getYear();

    }

    public String getNameComp() {
        return nameComp;
    }

    public void setNameComp(String nameComp) {
        this.nameComp = nameComp;
    }

    public String getWinningNameTeam() {
        return winningNameTeam;
    }

    public void setWinningNameTeam(String winningNameTeam) {
        this.winningNameTeam = winningNameTeam;
    }

    public String getRunner_up() {
        return runner_up;
    }

    public void setRunner_up(String runner_up) {
        this.runner_up = runner_up;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return String.format("%-20s%s%n%-20s%s%n%-20s%s%n%-20s%s%n",
                "Competition Name :", getNameComp(),
                "Year :", getYear(),
                "Winning Team ",getWinningNameTeam(),
                "Second Place :", getRunner_up());

    }


}

