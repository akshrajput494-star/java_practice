public class StepTracker {
    private int[] dailySteps;

    // Parameterized constructor
    public StepTracker(int[] steps) {
        this.dailySteps = steps.clone();
    }

    // Calculate total steps for all days
    public int calculateTotalSteps() {
        int total = 0;
        for (int steps : dailySteps) {
            total += steps;
        }
        return total;
    }

    // Calculate average steps per day
    public double calculateAverageSteps() {
        if (dailySteps.length == 0) {
            return 0.0;
        }
        return (double) calculateTotalSteps() / dailySteps.length;
    }

    // Count days with 10,000 or more steps
    public int countActiveDays() {
        int count = 0;
        for (int steps : dailySteps) {
            if (steps >= 10000) {
                count++;
            }
        }
        return count;
    }

    // Find the longest streak of consecutive active days
    public int longestActiveStreak() {
        int longest = 0;
        int current = 0;

        for (int steps : dailySteps) {
            if (steps >= 10000) {
                current++;
                if (current > longest) {
                    longest = current;
                }
            } else {
                current = 0;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] steps = {11000, 12000, 10500, 10000, 8000, 10000, 11000, 12000, 9000, 7800};
        StepTracker tracker = new StepTracker(steps);

        System.out.println("Total Steps: " + tracker.calculateTotalSteps());
        System.out.println("Average Steps: " + tracker.calculateAverageSteps());
        System.out.println("Active Days: " + tracker.countActiveDays());
        System.out.println("Longest Streak: " + tracker.longestActiveStreak());
    }
}
