import java.util.Scanner;
public class GroupProjectStudentCouncilElection {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Candidate names
    String[] candidates = {
        "Candidate 1 - Rahul",
        "Candidate 2 - Priya",
        "Candidate 3 - Arjun"
    };

    // Vote counts
    int[] votes = new int[3];

    // Number of voters
    System.out.print("Enter number of voters: ");
    int n = sc.nextInt();

    // Voting process
    for (int i = 1; i <= n; i++) {

        System.out.println("\nVoter " + i + ", choose your candidate:");

        for (int j = 0; j < candidates.length; j++) {
            System.out.println((j + 1) + ". " + candidates[j]);
        }

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= 3) {
            votes[choice - 1]++;
            System.out.println("Vote recorded successfully!");
        } else {
            System.out.println("Invalid choice! Vote not recorded.");
        }
    }

    // Display results
    System.out.println("\n========== ELECTION RESULTS ==========");

    for (int i = 0; i < candidates.length; i++) {
        System.out.println(candidates[i] + " : " + votes[i] + " votes");
    }

    // Find winner
    int maxVotes = votes[0];
    int winner = 0;

    for (int i = 1; i < votes.length; i++) {
        if (votes[i] > maxVotes) {
            maxVotes = votes[i];
            winner = i;
        }
    }

    System.out.println("\n========== WINNER ==========");
    System.out.println("Winner: " + candidates[winner]);
    System.out.println("Votes: " + maxVotes);

    sc.close();
}
}