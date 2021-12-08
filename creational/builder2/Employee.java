package builder2;

class Employee {

    private  String name;
    private int id;

    private boolean isTeamLead;
    private boolean isManager;

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public boolean checkTeamLead(){
        return this.isTeamLead;
    }

    public boolean checkManager() {
        return this.isManager;
    }

    private Employee(EmployeeBuilder builder){
        this.name = builder.name;
        this.id = builder.id;
        this.isManager = builder.isManager;
        this.isTeamLead = builder.isTeamLead;
    }

     static class EmployeeBuilder{
        private  String name;
        private int id;

        private boolean isTeamLead;
        private boolean isManager;

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public void setTeamLead(boolean teamLead) {
            isTeamLead = teamLead;
        }

        public void setManager(boolean manager) {
            isManager = manager;
        }


        public EmployeeBuilder makeTeamLead(){
            this.isTeamLead = true;
            return this;
        }
        public EmployeeBuilder makeManager(){
            this.isManager = true;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }
}
