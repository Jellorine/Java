abstract class LibraryItem{
    private String title;
    private String itemID;

    LibraryItem(String title,String itemID){
        this.title = title;
        this.itemID = itemID;
    }
    public String getTitle(){
        return title;
    }
    public String getItemId(){
        return itemID;
    }
    String checkOut(){
        return "checked out";
    }
    String checkIn(){
        return "checked in";
    }
    String displayItemDetails(){
        return "Title: "+this.title+"\t\tItemID: "+this.itemID;
    }   
}

class Book extends LibraryItem{
    String author;
    int numPages;

    Book(String title,String itemID,String author,int numPages){
        super(title,itemID);
        this.author = author;
        this.numPages = numPages;
    }
    public String getAuthor(){
        return author;
    }
    public int getNumPages(){
        return numPages;
    }
}
class Magazine extends LibraryItem{
    String issueDate;
    String publisher;

    Magazine(String title,String itemID,String issueDate,String publisher){
        super(title,itemID);
        this.issueDate = issueDate;
        this.publisher = publisher;
    }
    public String getIssueDate(){
        return issueDate;
    }
    public String getPublisher(){
        return publisher;
    }
}
class LibraryMember{
    private String memberID;
    String name;

    LibraryMember(String memberID,String name){
        this.memberID = memberID;
        this.name = name;
    }
    public String getMemberID(){
        return memberID;
    }
    public String getName(){
        return name;
    }
    String displayMemberDetails(){
        return "Member ID: "+memberID+"\t\tName: "+name;
    }
}

class LibraryManagementSystem{
    public static void main(String args[]){
        Book b1 = new Book("The Catcher in the Rye","B001","J.D.Salinger",240);
        Book b2 = new Book("To Kill a Mockingbird","B002","Harper Lee",281);
        Book b3 = new Book("1984","B003","George Orwell",328);
        Book b4 = new Book("Pride and Prejudice","B004","Jane Austen",432);
        Book b5 = new Book("The Hobbit","B005","J.R.R.Tolkien",320);

        Magazine m1 = new Magazine("National Geographic","M001","August 2023","National Geographic Society");
        Magazine m2 = new Magazine("Time","M002","September 2023","Time USA,LLC");
        Magazine m3 = new Magazine("Forbes","M003","June 2023","Forbes Media");
        Magazine m4 = new Magazine("Vogue","M004","July 2023","Conde Nast");
        Magazine m5 = new Magazine("Sports Illustrated","M005","July 2023","Maven Coalition");

        LibraryMember lm1 = new LibraryMember("L001","John Doe");
        LibraryMember lm2 = new LibraryMember("L002","Jane Smith");
        LibraryMember lm3 = new LibraryMember("L003","David Johnson");
        LibraryMember lm4 = new LibraryMember("L004","Sarah Williams");
        LibraryMember lm5 = new LibraryMember("L005","Michael Brown");

        System.out.println(b1.checkIn());
        System.out.println(b1.checkOut());

        System.out.println(b1.displayItemDetails());
        System.out.println(b2.displayItemDetails());
        System.out.println(b3.displayItemDetails());
        System.out.println(b4.displayItemDetails());
        System.out.println(b5.displayItemDetails()+"\n");

        System.out.println(lm1.displayMemberDetails());
        System.out.println(lm2.displayMemberDetails());
        System.out.println(lm3.displayMemberDetails());
        System.out.println(lm4.displayMemberDetails());
        System.out.println(lm5.displayMemberDetails());
    }
}