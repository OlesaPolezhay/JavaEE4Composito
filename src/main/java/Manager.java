import java.util.ArrayList;

public class Manager extends Employee {
    double bonus;

   public Manager (String name, String dept) {
        this.id = nextid++;
        this.name =name;
        this.dept = dept;
        this.subordites = new ArrayList<Employee>();
    }

    public double getBonus() {
        return bonus;
    }

    public void PrintEmployee(){
        System.out.println("Manager: { Name : "+ name +", dept : " + dept + "}: managerID : "+manid);
    }
}