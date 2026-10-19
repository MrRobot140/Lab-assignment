import java.util.Scanner;

public class GradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        int assignmentPoints = 0, examPoints = 0, assignmentCount = 0, examCount = 0;
        double assignmentAverage = 0, examAverage = 0, overallAverage = 0;
        // menu loop
        while (running) {
            System.out.println("===== SEMESTER GRADE TRACKER =====");
            System.out.println("\n1. Add assignment result");
            System.out.println("2. Add exam result");
            System.out.println("3. View current grade");
            System.out.println("4. Exit");
            System.out.print("\nChoose an option: ");
            int option = sc.nextInt();
            switch (option) {
                // assignment score
                case 1 -> {
                    System.out.print("\nEnter assignment score: ");
                    int score = sc.nextInt();
                    if (score >= 0 && score <= 100) {
                        assignmentPoints += score;
                        System.out.println("\nAssignment score added.");
                        assignmentCount++;
                        System.out.println();
                    } else {
                        System.out.println("\nInvalid score. Enter a value from 0 to 100.");
                        System.out.println();
                    }
                } // exam score
                case 2 -> {
                    System.out.print("\nEnter exam score: ");
                    int score = sc.nextInt();
                    if (score >= 0 && score <= 100) {
                        examPoints += score;
                        System.out.println("\nExam score added.");
                        examCount++;
                        System.out.println();
                    } else {
                        System.out.println("\nInvalid score. Enter a value from 0 to 100.");
                        System.out.println();
                    }
                } // current grade
                case 3 -> {
                    if (assignmentCount == 0 && examCount == 0) {
                        System.out.println("No results available yet.");
                        System.out.println();
                    } else {
                        // calculate averages and overall average
                        if (assignmentCount > 0) {
                            assignmentAverage = (double) assignmentPoints / assignmentCount;
                        }
                        if (examCount > 0) {
                            examAverage = (double) examPoints / examCount;
                        }
                        if (assignmentCount > 0 && examCount > 0) {
                            overallAverage = assignmentAverage * 0.50 + examAverage * 0.50;
                        } else if (assignmentCount > 0) {
                            overallAverage = assignmentAverage;
                        } else {
                            overallAverage = examAverage;
                        }
                        // print results
                        System.out.println("\n===== CURRENT RESULTS =====");
                        System.out.println("\nAssignments completed: " + assignmentCount);
                        System.out.println("Assignment average: " + assignmentAverage);
                        System.out.println("\nExams completed: " + examCount);
                        System.out.println("Exam average: " + examAverage);
                        System.out.println("\nOverall average: " + overallAverage);
                        // letter grade
                        if (overallAverage >= 90) {
                            System.out.println("Grade: A");
                            System.out.println("Status: Passing\n");
                        } else if (overallAverage >= 80) {
                            System.out.println("Grade: B");
                            System.out.println("Status: Passing\n");
                        } else if (overallAverage >= 70) {
                            System.out.println("Grade: C");
                            System.out.println("Status: Passing\n");
                        } else if (overallAverage >= 60) {
                            System.out.println("Grade: D");
                            System.out.println("Status: Passing\n");
                        } else {
                            System.out.println("Grade: F");
                            System.out.println("Status: Failing\n");
                        }
                        // explanation if only one category was entered
                        if (assignmentCount > 0 && examCount == 0) {
                            System.out.println("Only assignments entered, overall average uses assignments only.\n");
                        } else if (assignmentCount == 0 && examCount > 0) {
                            System.out.println("Only exams entered, overall average uses exams only.\n");
                        }
                    }
                } // exit
                case 4 -> {
                    System.out.println("\nGrade tracker closed.");
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
