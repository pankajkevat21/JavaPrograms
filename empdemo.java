class Employee {
    int id;
    String name, course;

    Employee() {
        this(null, 0, null);
    }

    Employee(String name) {
        this(name, 0, null);
    }

    Employee(int id) {
        this(null, id, null);
    }

    Employee(String name, int id) {
        this(name, id, null);
    }

    Employee(String name, String course) {
        this(name, 0, course);
    }

    Employee(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    void display() {
        System.out.println("Name: " + name + ", Id: " + id + ", Course: " + course);
    }
}
    class empdemo {
        public static void main(String[] ar) {
            Employee e1 = new Employee("pankaj");
            Employee e2 = new Employee("Rahim", 123);
            Employee e3 = new Employee(15);
            Employee e4 = new Employee("Aakash", "MCA");
            Employee e5 = new Employee("Rashmi", 256, "MCA");

            e1.display();
            e2.display();
            e3.display();
            e4.display();
            e5.display();
        }
    }