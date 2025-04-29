/*
Create a class Student with following operations
1) create parameterized constructor to initialize the objects
2) create a function isEqual() to check whether the two objects are equal or not which returns
the boolean value and gets two objects
3) print the result in main method if objects are equals or not (take variables as your assumtion)
 */

class Student {
    String name;
    int rollNo;

    // 1) Parameterized constructor
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // 2) Function to check equality
    public static boolean isEqual(Student s1, Student s2) {
        return s1.name.equals(s2.name) && s1.rollNo == s2.rollNo;
    }

    // 3) Main method to test
    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Alice", 102);

        // Comparing the objects
        if (isEqual(student1, student2)) {
            System.out.println("The two students are equal.");
        } else {
            System.out.println("The two students are not equal.");
        }
    }
}

