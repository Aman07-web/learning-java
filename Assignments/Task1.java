
class Book{
    String title;
    String author;
    double price;

    Book(String title,String author,double price){
      this.title=title;
      this.author=author;
      this.price=price;
    }
    void displayDetails(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }
    
}
class Task1{
    public static void main(String[] args) {
        Book sc=new Book("Java", "James Gosling", 987);
        sc.displayDetails();

    }
}