package builder2;

public class BuilderTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee.EmployeeBuilder().setName("Srivatsa").setId(1).makeTeamLead().build();
        System.out.println(emp1.getId());
        System.out.println(emp1.getName());
        System.out.println("Is Manager: "+emp1.checkManager());
        System.out.println("Is team lead: "+emp1.checkTeamLead());
    }
}

