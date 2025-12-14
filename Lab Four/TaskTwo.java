class IDCard {
    String name;
    String id;
    String department;
    String institution;

    IDCard(String name, String id, String department, String institution) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.institution = institution;
    }

    void showID() {
        System.out.println("Name        : " + name);
        System.out.println("ID          : " + id);
        System.out.println("Department  : " + department);
        System.out.println("Institution : " + institution);
    }
}

public class Main {
    public static void main(String[] args) {
        IDCard student1 = new IDCard("Isteak", "251016", "CCE", "IIUC");
        IDCard student2 = new IDCard("Rakib", "251002", "CCE", "IIUC");

        System.out.println("== Student 1 ID Card ==");
        student1.showID();

        System.out.println("\n== Student 2 ID Card ==");
        student2.showID();
    }
}

