import java.util.ArrayList;

// Gemmer forfatterens navn og en liste over forfatterens titler.
// Beregner den samlede bibliotekspengeudbetaling for alle titlerne.

class author {

    private String name;
    private ArrayList<title> titles;

    public author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(title title) {
        titles.add(title);
    }

    public double calculateRoyalties() {
        double total = 0;

        for (title title : titles) {
            total += title.calculateRoyalty();
        }

        return Math.round(total * 100.0) / 100.0;
        // Math.round() afrunder til et helt tal.
        // Ved at gange med 100 flytter vi decimalerne to pladser, så vi kan afrunde til hundrededele.
        // Derefter dividerer vi med 100 igen for at få det korrekte tal med 2 decimal.
    }

    public String getName() {
        return name;
    }
}
