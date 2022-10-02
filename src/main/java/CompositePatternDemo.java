import java.net.InetSocketAddress;

public class CompositePatternDemo {
    public static void main(String[] args) throws FieldLengthLimitException, EmployeeInRegistyExseption {
        Registry hr = Registry.getInstance();

        Manager CEO = new Manager("John", "CEO");
        hr.addWorker(CEO);
        Employee headSales = new Employee("Robert", "Head Sales");
        hr.addWorker(headSales);
        headSales.manid = CEO.id;
        Employee headMarketing =new Employee("michel", "Head Marketing");
        hr.addWorker(headMarketing);
        headMarketing.manid = CEO.id;

        Employee clerk1 = new Employee("laura", "marketing");
        hr.addWorker(clerk1);
        clerk1.manid = headMarketing.id;
        Employee clerk2 = new Employee("Bob", "marketing");
        hr.addWorker(clerk2);
        clerk2.manid = headSales.id;
        Employee salesExecutives = new Employee("Richard", "Sales");
        hr.addWorker(salesExecutives);
        salesExecutives.manid = headSales.id;
        Employee salesExecutives2 = new Employee("Bob", "Sales");
        hr.addWorker(salesExecutives2);
        salesExecutives2.manid = headSales.id;

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutives);
        headSales.add(salesExecutives2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        CEO.PrintEmployee();

        for(Employee headEployee : CEO.getSubordites()){
            headEployee.PrintEmployee();
            for (Employee employee :headEployee.getSubordites()){
                employee.PrintEmployee();
            }
        }
    }
}
