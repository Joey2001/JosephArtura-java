public class LabWS6_1 {
    public static void main(String[] args) {
        ProjectManager manager = new ProjectManager();
        System.out.println(manager.getHours());
        System.out.println(manager.getSalary());
        System.out.println(manager.getVacationDays());
        System.out.println(manager.getVacationForm());
        System.out.println(manager.trackStatus());

        Engineer engineer = new Engineer();
        System.out.println(engineer.getHours());
        System.out.println(engineer.getSalary());
        System.out.println(engineer.getVacationDays());
        System.out.println(engineer.getVacationForm());
        System.out.println(engineer.testCode());

        SeniorEngineer seniorEngineer = new SeniorEngineer();
        System.out.println(seniorEngineer.getHours());
        System.out.println(seniorEngineer.getSalary());
        System.out.println(seniorEngineer.getVacationDays());
        System.out.println(seniorEngineer.getVacationForm());
        System.out.println(seniorEngineer.herdCats());

        Janitor janitor = new Janitor();
        System.out.println(janitor.getHours());
        System.out.println(janitor.getSalary());
        System.out.println(janitor.getVacationDays());
        System.out.println(janitor.getVacationForm());
        System.out.println(janitor.hardWork());
    }
}
