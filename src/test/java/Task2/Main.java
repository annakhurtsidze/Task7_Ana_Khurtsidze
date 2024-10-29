package Task2;

import static Task2.NotificationService.sendAlert;

public class Main {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

       sendAlert(email, "This in no-reply email");
        sendAlert(sms, "Please enter otp code you received to close account");
    }
}
