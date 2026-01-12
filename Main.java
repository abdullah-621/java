// class person {
//   String name;
//   int age;

//   person() {
//     this("Unknown", 0);
//     System.err.println("Person() called.");
//   }

//   person(String name) {
//     this("Unknown", 0);
//     System.err.println("Person(String name) called.");
//   }

//   person(String name, int age) {
//     this.name = name;
//     this.age = age;
//     System.err.println("Person(String name, int age) called.");
//   }
// }

// class student extends person
// {
//   int id;

//   student()
//   {
//     super();
//     System.err.println("Student() called");
//   }

//   student(String name, int age, int id)
//   {
//     super(name, age);
//     this.id = id;
//     System.err.println("student(String name, int age, int id) called");
//   }
// }

// public class main2 {
//   public static void main(String[] args) {
//     // person s = new person();
//     student s1 = new student();
//     student s2 = new student("Masum", 22, 621);


//   }
// }




// Parent class
class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        System.out.println("Person()");
    }

    // Constructor with 1 parameter
    Person(String name) {
        this();
        this.name = name;
        System.out.println("Person(String)");
    }

    // Constructor with 2 parameters
    Person(String name, int age) {
        this(name); // call 1-parameter constructor
        this.age = age;
        System.out.println("Person(String, int)");
    }
}

// Person(String)
// Person(String, int)
// Student()

// Child class
class Student extends Person {

    // Default constructor
    Student() {
        super("Anonymous", 18); // call 2-parameter constructor of Person
        System.out.println("Student()");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Student s = new Student();  // Create Student object
    }
}
