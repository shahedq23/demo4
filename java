import java.time.LocalTime;
import java.util.Scanner;

public class SmartTV {

    // Recommend a channel based on current hour
    public static String recommendChannel(int hour) {
        if (hour >= 6 && hour < 9) {
            return "📰 News Channel";
        } else if (hour >= 9 && hour < 17) {
            return "📚 Educational Channel";
        } else if (hour >= 17 && hour < 21) {
            return "🎭 Entertainment Channel";
        } else {
            return "🎬 Movie Channel";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime time = LocalTime.now();
        int hour = time.getHour();

        System.out.println("=== Smart TV AI ===");
        System.out.println("Current time: " + time);
        System.out.println("Recommended channel: " + recommendChannel(hour));

        System.out.println("\nWould you like to switch to the recommended channel? (yes/no)");
        String response = scanner.nextLine().toLowerCase();

        if (response.equals("yes")) {
            System.out.println("Switching to: " + recommendChannel(hour));
        } else {
            System.out.println("Okay, staying on the current channel.");
        }

        scanner.close();
    }
}

