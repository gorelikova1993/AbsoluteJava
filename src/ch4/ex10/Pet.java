package ch4.ex10;

public class Pet {
    private String name;
    private int age;
    private double weight;
    private boolean isDog;

    public Pet(String startName) {
        name = startName;
        age = 0;
        weight = 0;
        isDog = false;
    }
    public Pet(double startWeight) {
        name = "No name still";
        age = 0;
        if (startWeight < 0) {
            System.out.println("Error: Negative weight");
            System.exit(0);
        } else
            weight = startWeight;
        isDog = false;
    }
    public Pet(String startName, int ageBegins, double startWeight, boolean type) {
        name = startName;
        if (ageBegins < 0 || startWeight < 0) {
            System.out.println("Error contains Negative age or weight");
            System.exit(0);
        } else {
            age = ageBegins;
            weight = startWeight;
        }
        isDog = type;
    }
    public void setPet(String newName, int newAge, double newWeight, boolean type) {
        name = newName;
        if (newAge < 0 || newWeight < 0) {
            System.out.println("Error: Negative age or 	weight");
            System.exit(0);
        } else {
            age = newAge;
            weight = newWeight;
            isDog = type;
        }
    }


    public double acepromazine()
    {
        if (isDog)
            return (weight / 2.2) * (0.03 / 10);
        else
            return (weight / 2.2) * (0.002 / 10);
    }

    public double carprofen()
    {
        if(isDog)
            return (weight / 2.2) *  (0.5 / 12);

        else
            return (weight / 2.2) *  (0.25 / 12);
    }

}
