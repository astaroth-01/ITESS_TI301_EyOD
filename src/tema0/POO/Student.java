package tema0.POO;

public class Student extends User implements StudentInterface{
    private String id;
    private LibraryITESS library;
    
    public Student(String name, String id, LibraryITESS library) {
        super(name);
        this.id = id;
        this.library = library;
    }
    
    public String getId() {
        return this.id;
    }

    @Override
    public void borrow() {
    }

    @Override
    public void returnBack() {
    }
   
}
