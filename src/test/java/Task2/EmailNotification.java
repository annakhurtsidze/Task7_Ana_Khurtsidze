package Task2;

public class EmailNotification extends Notification{
    @Override
    void sendNotification(String message) {
        System.out.println(message + " -- is E-mail Notification");
    }
}
