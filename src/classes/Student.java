package classes;

public class Student {
    private String name; //global variable
    private String matricNumber;
    private String department;


    public Student(String n, String mN, String dept){
        name = n;
        matricNumber = mN;
        department = dept;
    }

    public void setName(String name /*local variable */) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getMatricNumber() {
        return matricNumber;
    }

    public void setMatricNumber(String matricNumber) {
        this.matricNumber = matricNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
