package ObjectOriented.Encapsulation;
/*
    Encapsulation is way of hiding the data.
 */
public class EmpImpl {
    public static void main(String[] args) {
        Employees e=new Employees();
        e.setEmpno(7545);
        e.setEname("King");
        e.setSal(5000);
        e.setDeptno(40);
        System.out.println("After setting the value get the employee details");
        System.out.println(e.getEmpno());
        System.out.println(e.getEname());
        System.out.println(e.getSal());
        System.out.println(e.getDeptno());
    }
}
