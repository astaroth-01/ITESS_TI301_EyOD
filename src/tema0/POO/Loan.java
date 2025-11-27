package tema0.POO;

import java.util.List;

public class Loan {
    private Student student;
    private List<String> books;
    
    public Loan(Student student, List<String> books) {
        this.student = student;
        this.books = books;
    }
    
    public boolean contain(String book) {
        return this.books.contains(book);
    }
    
    
}
