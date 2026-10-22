class audioBook extends title {

    // Repræsenterer en lydbog med en bestemt varighed i minutter og et antal eksemplarer.
    // Beregner point ud fra varighed, litteraturtype og antal eksemplarer.

    private int durationInMinutes;
    private int copies;

    public audioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType);
        this.copies = copies;
        this.durationInMinutes = durationInMinutes;
    }

    // Lav metoden om så den beregner med minutter, litteratur type og kopier.
    // (egen implementation af calculatePoints() - polymorfi)
    @Override
    public double calculatePoints() {
        return (durationInMinutes * 0.5) * convertLiteratureType() * copies;
    }
}
