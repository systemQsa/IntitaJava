package ua.intita.qa.roshen;

public class Main {
    public static void main(String[] args) {

        // where is the hierarchy?
        // Sweets - parent class, child for example Lollipop, ChocolateCandy,

        Sweets[] sweets = new Sweets[5];
        sweets[0] = new Sweets("snickers", 120.2, 18.2);
        sweets[1] = new Sweets("milka", 230.3, 17.1);
        sweets[2] = new Sweets("olenka", 100.1, 23.3);
        sweets[3] = new Sweets("romashka", 5.6, 9.8);
        sweets[4] = new Sweets("trauben-nuss", 150.5, 13.3);

        Present present = new Present(sweets);
        present.printCandiesByName();
        present.printSweets();
        present.printCandySugarConsistence(15.5,24.4);

    }
}
