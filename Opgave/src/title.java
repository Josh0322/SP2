// calculatePoints abstrakt, hvor calculateRoyalty kan være fælles.

// Superklassen for alle bogtyper og indeholder fælles oplysninger som titel, litteraturtype og sats (RATE).
// Beregner bibliotekspengene og omdanner litteraturtypen til en talværdi.
abstract class title {

    private String title;
    private String literatureType;
    public static final double RATE = 0.067574;

    public title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty() {
        return calculatePoints() * RATE;
    }

    public double convertLiteratureType() {
        switch (literatureType) {
            case "BI":
                return 3;
            case "TE":
                return 3;
            case "LYRIK":
                return 6;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1;
            default:
                throw new IllegalArgumentException("Ukendt litteraturtype: " + literatureType);
        }
    }

    public abstract double calculatePoints();

    public String getTitle() {
        return title;
    }

    public String getLiteratureType() {
        return literatureType;
    }
}

