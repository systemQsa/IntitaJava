package ua.intita.qa.roshen;

public class Main {
    public static void main(String[] args) {

        Sweets[] sweets = new Sweets[4];
        sweets[0] = new KitKat("kitkat", 34.3, 56.6);
        sweets[1] = new RitterSport("ritter sport", 45.6, 12.2, "Brazil");
        sweets[2] = new Rafaello("rafaello", 67.8, 34.5, 10);
        sweets[3] = new Hoffmans("hoffmans", 34.4, 56.6);

        Present present = new Present(sweets);
        //present.printCandiesByName();
        //present.printCandySugarConsistence(34.3,56.6);
        present.printTotalWeight();

    }

}
