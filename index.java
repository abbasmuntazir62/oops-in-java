public class index {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "muntazir";
    s1.age = 24;
    Student s2 = new Student(s1);
    s2.printInfo();
  }
}

class Student {
  String name;
  int age;

  Student() {}

  Student(Student s) {
    this.name = s.name;
    this.age = s.age;
  }

  void printInfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
  // Overloaded methods (not used in main, but kept for demonstration)
  void printInfo(String name) {
    System.out.println(name);
  }
  void printInfo(int age) {
    System.out.println(age);
  }
  void printInfo(String name, int age) {
    System.out.println(name);
    System.out.println(age);
  }
}