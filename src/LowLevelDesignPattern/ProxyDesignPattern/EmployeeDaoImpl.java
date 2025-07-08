package LowLevelDesignPattern.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, EmployeeTable obj) throws Exception {
        // create a new Row
        System.out.println("created new row in the employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
            // delete a row
        System.out.println("deleted row with employeeId" + employeeId);
    }

    @Override
    public EmployeeDao get(String client, int employeeId) throws Exception {
        // fetch obj
        System.out.println("fetching data from db");
        return new EmployeeDaoImpl();
    }
}
