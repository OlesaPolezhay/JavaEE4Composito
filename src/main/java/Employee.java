import java.util.ArrayList;
import java.util.List;

public class Employee {
    protected int id;
    protected static int nextid = 0;
    protected String name;
    protected String dept;
    int manid;

    protected List<Employee> subordites;

    public Employee (String name, String dept) throws FieldLengthLimitException{
        this.id = nextid++;
        if(name.length() > 15){
            throw new FieldLengthLimitException("Too much symbols in name!");
        }
        else{
            this.name = name;
        }
        this.dept = dept;
        subordites = new ArrayList<Employee>();
    }

    public Employee(){

    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public void add(Employee e){
        subordites.add(e);
    }

    public void remove(Employee e){
        subordites.remove(e);
    }

    public List<Employee> getSubordites() {
        return subordites;
    }

    public void PrintEmployee(){
        System.out.println("Employee: { Name : "+ name +", dept : " + dept + "}: managerID : "+manid);
    }
}
