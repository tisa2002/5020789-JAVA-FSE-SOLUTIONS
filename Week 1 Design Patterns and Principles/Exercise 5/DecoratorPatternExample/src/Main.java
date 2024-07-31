public class Main {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        System.out.println("Sending Notification via Email:");
        emailNotifier.send("Hello via Email!");

        System.out.println("\nSending Notification via Email and SMS:");
        smsNotifier.send("Hello via Email and SMS!");

        System.out.println("\nSending Notification via Email, SMS, and Slack:");
        slackNotifier.send("Hello via Email, SMS, and Slack!");
    }
}
