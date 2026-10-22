class libraryRoyaltyCalculator {

    // forfatterene og bøgerne oprettes.
    // Vi tester systemet og udskriver forfatterens samlede bibliotekspenge.

    void main() {

        // Forfatter 1
        author author = new author("Olga Ravn");

        PrintedBook book1 = new PrintedBook("Celestine", "SKØN", 140, 166);
        audioBook book2 = new audioBook("Celestine", "SKØN", 140, 192);
        PrintedBook book3 = new PrintedBook("Billedbog", "BI", 50, 32);

        // Tilføj til tittle array liste
        author.addTitle(book1);
        author.addTitle(book2);
        author.addTitle(book3);

        System.out.println(author.getName() + ": " + author.calculateRoyalties() + "kr");

        // Forfatter 2
        author author2 = new author("Mads Johnson");

        audioBook book4 = new audioBook("Fire", "TE", 120, 185);
        PrintedBook book5 = new PrintedBook("Ice", "BI", 135, 100);
        PrintedBook book6 = new PrintedBook("Water", "TE", 140, 95);

        author2.addTitle(book4);
        author2.addTitle(book5);
        author2.addTitle(book6);

        System.out.println(author2.getName() + ": " + author2.calculateRoyalties() + "kr");


    }
    }

