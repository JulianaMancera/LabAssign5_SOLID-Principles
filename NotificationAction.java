// Notification Implementation
public class NotificationAction implements Notification {
    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
}
