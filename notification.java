public class NotificationSystemDemo {

    interface NotificationService {
        void sendNotification(String message);
    }

    static class EmailNotification implements NotificationService {
        @Override
        public void sendNotification(String message) {
            System.out.println("Email Notification: " + message);
        }
    }

    static class SMSNotification implements NotificationService {
        @Override
        public void sendNotification(String message) {
            System.out.println("SMS Notification: " + message);
        }
    }

    static class PushNotification im
