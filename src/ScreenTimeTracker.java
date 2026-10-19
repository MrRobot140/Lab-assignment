import java.util.Scanner;

public class ScreenTimeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        int total = 0, sessions = 0, entertainmentTime = 0;
        int studyingTime = 0, socialMediaTime = 0, gamingTime = 0, streamingTime = 0;
        // menu loop
        while (running) {
            System.out.println("\n===== SCREEN-TIME TRACKER =====");
            System.out.println("\n1. Add social media time");
            System.out.println("2. Add gaming time");
            System.out.println("3. Add studying time");
            System.out.println("4. Add video or streaming time");
            System.out.println("5. View statistics");
            System.out.println("6. Exit");
            System.out.print("\nChoose an option: ");
            int option = sc.nextInt();
            switch (option) {
                // social media minutes
                case 1 -> {
                    System.out.print("\nEnter social media minutes: ");
                    int minutes = sc.nextInt();
                    if (minutes <= 0) {
                        System.out.println("\nInvalid time. Minutes must be greater than 0.");
                    } else {
                        System.out.println("\nTime added successfully!\n");
                        socialMediaTime += minutes;
                        total += minutes;
                        sessions++;
                    }
                }
                // gaming minutes
                case 2 -> {
                    System.out.print("\nEnter gaming minutes: ");
                    int minutes = sc.nextInt();
                    if (minutes <= 0) {
                        System.out.println("\nInvalid time. Minutes must be greater than 0.");
                    } else {
                        System.out.println("\nTime added successfully!\n");
                        gamingTime += minutes;
                        total += minutes;
                        sessions++;
                    }
                }
                // studying minutes
                case 3 -> {
                    System.out.print("\nEnter studying minutes: ");
                    int minutes = sc.nextInt();
                    if (minutes <= 0) {
                        System.out.println("\nInvalid time. Minutes must be greater than 0.");
                    } else {
                        System.out.println("\nTime added successfully!\n");
                        studyingTime += minutes;
                        total += minutes;
                        sessions++;
                    }
                }
                // streaming minutes
                case 4 -> {
                    System.out.print("\nEnter streaming minutes: ");
                    int minutes = sc.nextInt();
                    if (minutes <= 0) {
                        System.out.println("\nInvalid time. Minutes must be greater than 0.");
                    } else {
                        System.out.println("\nTime added successfully!\n");
                        streamingTime += minutes;
                        total += minutes;
                        sessions++;
                    }
                }
                // view statistics
                case 5 -> {
                    System.out.println("\n===== TODAY'S SCREEN TIME =====");
                    System.out.println("\nSocial media: " + socialMediaTime + " minutes");
                    System.out.println("Gaming: " + gamingTime + " minutes");
                    System.out.println("Studying: " + studyingTime + " minutes");
                    System.out.println("Streaming: " + streamingTime + " minutes");
                    System.out.println("\nTotal screen time: " + total + " minutes");
                    System.out.println("Recorded sessions: " + sessions);
                    entertainmentTime = socialMediaTime + gamingTime + streamingTime;
                    if (studyingTime > entertainmentTime) {
                        System.out.println("\nStudy screen time is greater than entertainment screen time. Good balance!");
                    } else if (studyingTime < entertainmentTime) {
                        System.out.println("\nEntertainment screen time is greater than study time.");
                    } else {
                        System.out.println("\nStudy and entertainment screen time are equal.");
                    }
                    if (total < 120) {
                        System.out.println("\nLow screen time");
                    } else if (total <= 240) {
                        System.out.println("\nModerate screen time");
                    } else {
                        System.out.println("\nHigh screen time");
                    }
                }
                // exit
                case 6 -> {
                    System.out.println("\nScreen-time tracker closed.");
                    running = false;
                }
                default -> {
                    System.out.println("\nInvalid option. Choose between 1 and 6.");
                }
            }
        }
        sc.close();
    }
}
