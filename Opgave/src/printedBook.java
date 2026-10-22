class PrintedBook extends title {

    // Repræsenterer en fysisk bog med et bestemt antal sider og eksemplarer.
    // Beregner point ud fra sidetal, litteraturtype og antal eksemplarer.

    private int pages;
    private int copies;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType);
        this.copies = copies;
        this.pages = pages;
    }

    // Lav metoden om så den beregner med sider, litteratur type og kopier.
    @Override
    public double calculatePoints() {
        return pages * convertLiteratureType() * copies;
    }
}