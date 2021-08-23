package ch4.ex9;

public class AnimalSpeciesDemo {
    public static void main(String[] args)
    {

        AnimalSpecies a1 = new AnimalSpecies("Tiger");
        AnimalSpecies a2 = new AnimalSpecies("Snake", 50);
        AnimalSpecies a3 = new AnimalSpecies("Mouse", 124, 2.5);
        AnimalSpecies a4 = new AnimalSpecies("Mouse");
        a1.setPopulation(20);
        a1.setGrowth(-1.5);
        a2.setGrowth(4.5);
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
        System.out.println();
        System.out.println(a1.getSpeciesName() + " statistics: ");
        System.out.println("Growth Rate: " + a1.getGrowth());
        System.out.println("Population: " + a1.getPopulation());
        System.out.println();
        System.out.println("Endangered status: ");
        System.out.println(a1.getSpeciesName() + ": " + a1.endangered());
        System.out.println(a2.getSpeciesName() + ": " + a2.endangered());
        System.out.println(a3.getSpeciesName() + ": " + a3.endangered());
        System.out.println();
        System.out.println(a3.equals(a4));
        System.out.println(a3.equals(a1));
        System.out.println(a3.equals(a2));

    }
}
