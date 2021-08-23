package ch4.ex9;

public class AnimalSpecies {
    private String species;
    private double growth;
    private int population;

    public AnimalSpecies(String str) {
        this.species = str;
        population = 0;
        growth = 0;
    }

    public AnimalSpecies(String s, int p) {
        this.species = s;
        if (p >= 0)
            this.population = p;
        else
            this.population = 0;

        growth = 0;
    }

    public AnimalSpecies(String s, int p, double g) {
        this.species = s;
        if (p >= 0)
            this.population = p;
        else
            this.population = 0;

        this.growth = g;
    }

    public void setSpecies(String s) {
        species = s;
    }

    public void setPopulation(int p) {
        if (p >= 0)
            population = p;
        else
            population = 0;
    }

    public void setGrowth(double r) {
        growth = r;
    }

    public String getSpeciesName() {
        return species;
    }

    public int getPopulation() {
        return population;
    }

    public double getGrowth() {
        return growth;
    }

    public String toString() {

        return "There are " + population + " " + species + "(s) growing at a ratee of " + growth + "%";
    }

    public boolean equals(AnimalSpecies as) {
        return species.equals(as.species);
    }

    //a boolean valued method named endangered that returns true
    //when the growth rate is negative and returns false otherwise.
    public boolean endangered() {
        return growth < 0;
    }
}
