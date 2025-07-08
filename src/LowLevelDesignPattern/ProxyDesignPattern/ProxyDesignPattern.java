package LowLevelDesignPattern.ProxyDesignPattern;

public class ProxyDesignPattern {
    public static void main(String[] args) {
        try
        {
            EmployeeDao employeeDao = new EmployeeDaoProxy();
            employeeDao.create("ADMIN",new EmployeeTable());
            employeeDao.create("USER",new EmployeeTable());
            System.out.println("Operation successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
