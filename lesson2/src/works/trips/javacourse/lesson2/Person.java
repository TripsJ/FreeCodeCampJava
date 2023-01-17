package works.trips.javacourse.lesson2;

public class Person {
    private Name personName;
    public String helloWorld() {
        return "Hello World";
    }

    public String hello(String name){
        return "Hello "+ name;
    }
    public Person(Name personName){
        this.personName = personName;
    }

    public Person(){
        //default constructor _ empty
    }

}
