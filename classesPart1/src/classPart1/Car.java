package classPart1;

// The word 'public' means unrestricted access to the class. In another word, other classes thar we create have
// got access ti this class without being restricted
public class Car {

    // create a field for a class
    // specify an access modifier When you're defining fields in Java in a class, you go with the access modifier private
    // 'private' means when talking about fields is, we're adhering to encapsulation
    // 'adhering to encapsulation' is key fundamental rule of object-orientated programming
    // this is the states of the Car
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return this.model;
    }

}
