import java.util.Scanner;

public class StudyTracker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int weeklyGoal = 600, total = 0, sessions = 0;
        int progTotal = 0, mathTotal = 0, engTotal = 0, otherTotal = 0;
        boolean running = true;
        // menu loop
        while (running) {
            System.out.println("===== STUDY TRACKER =====");
            System.out.println("\n1. Add study session");
            System.out.println("2. View statistics");
            System.out.println("3. Check weekly goal");
            System.out.println("4. Exit");
            System.out.print("\nChoose an option: ");
            int option = sc.nextInt();
            // choose subject
            switch (option) {
                case 1 -> {
                    System.out.println("\nChoose subject:");
                    System.out.println("1. Programming");
                    System.out.println("2. Mathematics");
                    System.out.println("3. English");
                    System.out.println("4. Other");
                    System.out.print("\nChoose an option: ");
                    int option2 = sc.nextInt();
                    if (option2 > 0 && option2 <= 4){
                        System.out.print("\nStudy time in minutes: ");
                        int time = sc.nextInt();
                        if (time <= 0) {
                            System.out.println("\nInvalid study time. Time must be greater than 0.");
                            System.out.println();
                        } // add session
                        else {
                            sessions++;
                            total += time;
                            switch (option2) {
                                case 1 -> progTotal += time;
                                case 2 -> mathTotal += time;
                                case 3 -> engTotal += time;
                                case 4 -> otherTotal += time;
                            }
                            System.out.println("\nStudy time added!");
                            System.out.println("Current total study time: " + total + " minutes");
                            System.out.println();
                        }
                    } else {
                        System.out.println("\nInvalid option. Choose between 1 and 4!");
                        System.out.println();
                    }
                } // statistics
                case 2 -> {
                    System.out.println("\n===== WEEKLY STATISTICS =====");
                    System.out.println("\nStudy sessions: " + sessions);
                    System.out.println("Total study time: " + total + " minutes");
                    System.out.println("\nProgramming: " + progTotal + " minutes");
                    System.out.println("Mathematics: " + mathTotal + " minutes");
                    System.out.println("English: " + engTotal + " minutes");
                    System.out.println("Other: " + otherTotal + " minutes");
                    System.out.println();
                } // goal check
                case 3 -> {
                    System.out.println("\nWeekly goal: " + weeklyGoal + " minutes");
                    System.out.println("You studied: " + total + " minutes");
                    if (total >= weeklyGoal) {
                        System.out.println("Weekly goal achieved!");
                        System.out.println();
                    } else {
                        System.out.println("Remaining: " + (weeklyGoal - total) + " minutes");
                        System.out.println();
                    }
                } // exit
                case 4 -> {
                    System.out.println("\nStudy tracker closed. Keep up the good work!");
                    running = false;
                }
                default -> {
                    System.out.println("\nInvalid option. Choose between 1 and 4.");
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
