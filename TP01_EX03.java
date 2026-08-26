
// ADS 471 - Fernanda Cristina Oliveira Pinheiro e Letícia Amaral Xavier
// Exercicío 03: Implemente o sistema representado pelo diagrama abaixo. 
// Obrigatório implementar uma classe de testes para todos os métodos das classes Staff e Student.

class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}

class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(
            String name,
            String address,
            String program,
            int year,
            double fee
    ) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[Person[name=" + getName()
                + ",address=" + getAddress()
                + "],program=" + program
                + ",year=" + year
                + ",fee=" + fee + "]";
    }
}

class Staff extends Person {
    private String school;
    private double pay;

    public Staff(
            String name,
            String address,
            String school,
            double pay
    ) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[Person[name=" + getName()
                + ",address=" + getAddress()
                + "],school=" + school
                + ",pay=" + pay + "]";
    }
}

class TestStudentStaff {
    public static void main(String[] args) {
        System.out.println("========== TESTE PERSON ==========");

        Person person = new Person(
                "Pessoa 01",
                "Endereço 01"
        );

        System.out.println("getName(): " + person.getName());
        System.out.println("getAddress(): " + person.getAddress());

        person.setAddress("Novo Endereço 01");

        System.out.println("setAddress(): " + person.getAddress());
        System.out.println("toString(): " + person);

        System.out.println("\n========== TESTE STUDENT ==========");

        Student student = new Student(
                "João",
                "Rua A",
                "ADS",
                2026,
                1200.50
        );

        System.out.println("getName(): " + student.getName());
        System.out.println("getAddress(): " + student.getAddress());
        System.out.println("getProgram(): " + student.getProgram());
        System.out.println("getYear(): " + student.getYear());
        System.out.println("getFee(): " + student.getFee());

        student.setAddress("Rua B");
        student.setProgram("Sistemas de Informação");
        student.setYear(2027);
        student.setFee(1350.75);

        System.out.println("setAddress(): " + student.getAddress());
        System.out.println("setProgram(): " + student.getProgram());
        System.out.println("setYear(): " + student.getYear());
        System.out.println("setFee(): " + student.getFee());

        System.out.println("toString(): " + student);

        System.out.println("\n========== TESTE STAFF ==========");

        Staff staff = new Staff(
                "Maria",
                "Avenida A",
                "IFSP",
                3500.00
        );

        System.out.println("getName(): " + staff.getName());
        System.out.println("getAddress(): " + staff.getAddress());
        System.out.println("getSchool(): " + staff.getSchool());
        System.out.println("getPay(): " + staff.getPay());

        staff.setAddress("Avenida B");
        staff.setSchool("IFSP Campus Cubatão");
        staff.setPay(4200.00);

        System.out.println("setAddress(): " + staff.getAddress());
        System.out.println("setSchool(): " + staff.getSchool());
        System.out.println("setPay(): " + staff.getPay());

        System.out.println("toString(): " + staff);
    }
}

public class TP01_EX03 {
    public static void main(String[] args) {
        TestStudentStaff.main(args);
    }
}
