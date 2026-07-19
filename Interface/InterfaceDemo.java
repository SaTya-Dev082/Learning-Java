package Interface;

// Definition: Interface គឺជា contract/rule។ Class ដែល implements interface ត្រូវតែសរសេរ method ដែល interface បានកំណត់។

// Where use: Service layer, Repository layer, Payment Gateway, Notification.

// When use: ពេលចង់ separate logic និងចង់ឲ្យ code easy to change.

public class InterfaceDemo {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotification();
        NotificationService telegramService = new TelegramNotification();

        emailService.send("Your order is completed");
        telegramService.send("Your account is hacked.");
    }
}

interface NotificationService {
    void send(String message);
}

class EmailNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Send email: " + message);
    }
}

class TelegramNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Send Telegram: " + message);
    }
}
