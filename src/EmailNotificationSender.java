public class EmailNotificationSender implements NotificationSender {
    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Sending Email...\nEmail sent to: " + email);
    }
}
