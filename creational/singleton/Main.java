package singleton;


class Main {
    public static void main(String[] args) {
        Database db1;
        db1= Database.getInstance();
        db1.getConnection();
        System.out.println(db1.hashCode());
        Database db2 = Database.getInstance();
        System.out.println(db2.hashCode());

    }


}