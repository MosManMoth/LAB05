import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

    public User (){
        name = null;
        dob = LocalDate.now();
    }
    public User(String name, int year, int month, int day){
        this.name = name;
        this.dob = LocalDate.of(1946, 7, 6);
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println(this.getName());
        System.out.println(this.getDob());
    }

    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getMonth() == dob.getMonth()
                && today.getDayOfMonth() == dob.getDayOfMonth();
    }

    public void displayHappyBirthday(boolean force) {
        if (force || isBirthday()) {
            System.out.println("Happy birthday " + this.name + "!");
        }
    }

}
