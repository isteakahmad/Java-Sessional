class Student {
    private String name;
    private String id;
    private double cgpa;

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Isteak");
        s.setId("E251016");
        s.setCgpa(3.56);

        System.out.println("Student Information:");
        System.out.println("Name: " + s.getName());
        System.out.println("ID: " + s.getId());
        System.out.println("CGPA: " + s.getCgpa());
    }
}

