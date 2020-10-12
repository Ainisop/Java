
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {

        int count = 0;
        int wins = 0;
        int losses = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team");
        String team = scan.nextLine();
        try ( Scanner newScanner = new Scanner(Paths.get(file))) {

            while (newScanner.hasNextLine()) {
                String search = newScanner.nextLine();

                String[] parts = search.split(",");
                String teamOne = parts[0];
                String teamTwo = parts[1];
                int teamOneResult = Integer.valueOf(parts[2]);
                int teamTwoResult = Integer.valueOf(parts[3]);

                if (search.contains(team)) {
                    count++;
                }

                if (teamOne.contains(team) && teamOneResult > teamTwoResult) {
                    wins++;
                } else if (teamTwo.contains(team) && teamTwoResult > teamOneResult) {
                    wins++;

                } else if (teamOne.contains(team) && teamOneResult < teamTwoResult) {
                    losses++;
                } else if (teamTwo.contains(team) && teamTwoResult < teamOneResult) {
                    losses++;

                }
                }
                System.out.println("Games: " + count);
                System.out.println("Wins: " + wins);
                System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
