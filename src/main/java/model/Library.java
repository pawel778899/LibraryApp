package model;

public class Library {

    private static final int MAX_PUBLICATONS = 2000;
    private int publicationsNumber;
    private Publication[] publications = new Publication[MAX_PUBLICATONS];

    public Publication[] getPublications() {
        Publication[] resulat = new Publication[publicationsNumber];
        for (int i = 0; i < resulat.length; i++) {
            resulat[i] = publications[i];
        }
        return resulat;
    }

    public void addBook(Book book) {
        addPublication(book);
    }

    public void addMagazine(Magazine magazine) {
        addPublication(magazine);
    }

    private void addPublication(Publication publication) {
        if (publicationsNumber >= MAX_PUBLICATONS) {
            throw new ArrayIndexOutOfBoundsException("Max publications exceeded " + MAX_PUBLICATONS);
        }
        publications[publicationsNumber] = publication;
        publicationsNumber++;
    }
}
