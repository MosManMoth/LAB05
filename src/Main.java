public class Main {
    public static void main(String[] args) {

        User john = new User("John", 1954, 2, 18);
        john.displayInfo();
        john.displayHappyBirthday(true);
        john.displayHappyBirthday(false);

        Admin nicolas = new Admin("Nicolas", 1964, 1, 7);
        nicolas.displayInfo();
        nicolas.displayInfo();

        nicolas.displayHappyBirthday(true);
        nicolas.displayHappyBirthday(false);

    }
}
