import java.util.ArrayList;

public class Registry {
    private final ArrayList<Employee> workers = new ArrayList<>();
    static Registry instance = null;

    private Registry(){};

    public static Registry getInstance(){
        if (instance == null) {
            instance = new Registry();
        }
        return instance;
    }

    public void addWorker(Employee emp) throws EmployeeInRegistyExseption{
        boolean check = false;
        for (Employee emp1: workers){
            if (emp.getName().equals(emp1.getName()) && emp.getDept().equals(emp1.getDept()) ) {
                check = true;
                break;
            }
        }
        if(check ){
            throw new EmployeeInRegistyExseption("Employee " + emp.getName() +" is  in the base");
        }
        else {
            workers.add(emp);
        }
    }

    public void toStringList(){
        for (Employee emp: workers){
            emp.PrintEmployee();
        }
    }

}