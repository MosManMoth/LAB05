import java.time.LocalDate;
import java.time.LocalDateTime;

public class Admin extends User {

    public Admin(String name, int year, int month, int date) {
        super(name, year, month, date);
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type: admin");
    }

    public void displayHappyBirthday(boolean force) {
        int age = LocalDate.now().getYear() - this.getDob().getYear();
        if(force || isBirthday()) {
            System.out.println("Happy birthday " + this.name +
                    "! You are " + age + "!");
        }
    }

    public void displayHappyBirthday() {
        int age = LocalDate.now().getYear()- this.getDob().getYear();
        if(isBirthday()) {
            System.out.println("Happy birthday " + this.name +
                    "! You are " + age + "!");
        }
    }
}