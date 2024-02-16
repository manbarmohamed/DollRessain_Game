import java.util.Scanner;

public class Menu {

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first doll : ");
        int sizeDoll = scanner.nextInt();
        DollRussian doll1 = new DollRussian(sizeDoll);
        System.out.print("Enter the size of the second doll : ");
        int sizeDoll2 = scanner.nextInt();
        DollRussian doll2 = new DollRussian(sizeDoll2);
        System.out.print("Enter the size of the third doll : ");
        int sizeDoll3 = scanner.nextInt();
        DollRussian doll3 = new DollRussian(sizeDoll3);

        DollRussian currentDoll = null;

        int dollChoice;
        do {
            System.out.print("Choose a doll (1, 2, or 3) or enter 0 to exit: ");
            dollChoice = scanner.nextInt();

            switch (dollChoice) {
                case 1:
                    currentDoll = doll1;
                    break;
                case 2:
                    currentDoll = doll2;
                    break;
                case 3:
                    currentDoll = doll3;
                    break;
                case 0:
                    System.out.println("End Programme!!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }

            if (dollChoice != 0 && currentDoll != null) {
                int operationChoice;
                do {
                    System.out.println("╔══════════════════════════════╗");
                    System.out.println("║           Doll Menu          ║");
                    System.out.println("╟──────────────────────────────╢");
                    System.out.println("║ 1. Open the Doll             ║");
                    System.out.println("║ 2. Close the Doll            ║");
                    System.out.println("║ 3. Place Doll Inside Another ║");
                    System.out.println("║ 4. Take Doll Out of Another  ║");
                    System.out.println("║ 5. Back to Doll Selection    ║");
                    System.out.println("║ 0. Exit                      ║");
                    System.out.println("╚══════════════════════════════╝");
                    System.out.print("Choose an option: ");
                    operationChoice = scanner.nextInt();

                    switch (operationChoice) {
                        case 1:
                            currentDoll.open();
                            break;
                        case 2:
                            currentDoll.close();
                            break;
                        case 3:
                            System.out.print("Enter the doll to place inside (1, 2, or 3): ");
                            int DollChoice2 = scanner.nextInt();

                            if (DollChoice2 == 1) {
                                currentDoll.placeIn(doll1);
                            } else if (DollChoice2 == 2) {
                                currentDoll.placeIn(doll2);
                            } else if (DollChoice2 == 3) {
                                currentDoll.placeIn(doll3);
                            } else {
                                System.out.println("Invalid choice. Please choose a valid doll to place inside.");
                                break;
                            }
                            break;
                        case 4:
                            System.out.print("Enter the doll to take out (1, 2, or 3): ");
                            int sourceTakeOutChoice = scanner.nextInt();

                            if (sourceTakeOutChoice == 1) {
                                currentDoll.getOutOf(doll1);
                            } else if (sourceTakeOutChoice == 2) {
                                currentDoll.getOutOf(doll2);
                            } else if (sourceTakeOutChoice == 3) {
                                currentDoll.getOutOf(doll3);
                            } else {
                                System.out.println("Invalid choice. Please choose a valid doll to take out from.");
                                break;
                            }
                            break;
                        case 5:
                            break;
                        case 0:
                            System.out.println("End Programme!!");
                            break;
                        default:
                            System.out.println("Invalid choice. Please choose again.");
                    }
                } while (operationChoice != 0 && operationChoice != 5);
            }

        } while (dollChoice != 0);
    }

}


