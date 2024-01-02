package using_enums;
enum Department{
    assem,manuf,acc,sto
}
class Employee{
    private String name;
    private int age;
    private float sal;
    private Department dept;

public Employee(String n,int a,float s,Department d){
    name=n;
    age=a;
    sal=s;
    dept=d;
}
public void displayData(){
    System.out.println(name+" "+age+" "+sal+" "+dept);
    if(dept==Department.acc){
        System.out.println(name +"is AN acc\n");
    }
    else{
        System.out.println(name+"is not an acc\n");
    }
}


}
public class using_enums {
    public static void main(String[] args) throws Exception {
        Employee e=new Employee("Sandeep Shah",28,155575.50f,Department.acc);
        e.displayData();
    }
}
