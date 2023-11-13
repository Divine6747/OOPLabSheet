package Lab_9.exercise5;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private  int pages;

    public Book(){
        this("Title Not Available",0.00,"ISBN Not Available",0);
    }

    public Book(String title, double price, String ISBN, int pages) {

        setTitle(title);

        setPrice(price);

        setISBN(ISBN);

        setPages(pages);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.equals("") || title == null )
            this.title = "Not Valid Title Supplied";
        else
            this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0 || price > 50000)
            this.price = 0 ;
        else
            this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        if (ISBN.equals("")|| ISBN == null)
            this.ISBN = "NOt Valid ISBN Supplied";

        else
            this.ISBN = ISBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages < 0 || pages > 4000)
            this.pages = 0;

        else
            this.pages = pages;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + " Price: "
                + getPrice() + " ISBN: " + getISBN()
                + " Number of Pages: " + getPages();
    }
}
