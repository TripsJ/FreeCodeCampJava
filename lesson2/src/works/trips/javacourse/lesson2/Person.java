package works.trips.javacourse.lesson2;

public class Person {
    private static int personCounter;
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
        personCounter++;
        //default constructor _ empty
    }

    public static int countPersons() {
        return personCounter;

    }
}
