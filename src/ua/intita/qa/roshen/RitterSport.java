package ua.intita.qa.roshen;

public class RitterSport extends Sweets {
    private String chocoCountry;

    public RitterSport(String name, double weight, double sugarConsistence, String chocoCountry) {
        super(name, weight, sugarConsistence);
        this.chocoCountry = chocoCountry;
    }

    @Override
    public String toString() {
        return super.toString() + " chocoCountry= '" + chocoCountry + '\'';
    }
}
