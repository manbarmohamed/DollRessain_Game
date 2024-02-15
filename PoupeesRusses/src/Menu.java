import java.util.Scanner;

public class Menu {

    public void showMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first doll : ");
        int sizeDoll = scanner.nextInt();
        DollRussian doll = new DollRussian(sizeDoll);
        System.out.print("Enter the size of the second doll : ");
        int sizeDoll2 = scanner.nextInt();
        DollRussian doll2 = new DollRussian(sizeDoll2);

        int choice;
        do {

            System.out.println("╔══════════════════════════════╗");
            System.out.println("║           Doll Menu          ║");
            System.out.println("╟──────────────────────────────╢");
            System.out.println("║ 1. Open the Doll             ║");
            System.out.println("║ 2. Close the Doll            ║");
            System.out.println("║ 3. Place Doll Inside Another ║");
            System.out.println("║ 4. Take Doll Out of Another  ║");
            System.out.println("║ 5. Exit                      ║");
            System.out.println("╚══════════════════════════════╝");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    doll.open();
                    break;
                case 2:
                    doll.close();
                    break;
                case 3:
                    doll.placeIn(doll2);
                    break;
                case 4:
                    doll.getOutOf(doll2);
                    break;
                case 5:
                    System.out.println("End Programme!!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (choice != 5);
    }


}


