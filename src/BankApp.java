import java.util.Scanner;

public class BankApp {
    // Dane użytkownika dodane na stałe
    private static User user = new User(
            "Jan Kowalski",
            "jan.kowalski@example.com",
            "12345678901",             // PESEL
            "ul. Główna 10, 00-001 Warszawa", // Adres zamieszkania
            "123-456-789"              // Numer telefonu
    );

    // Inicjalizacja konta z domyślnym stanem konta
    private static BankAccount account = new BankAccount(5000.0); // Stan konta: 5000 zł

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Dodajemy przykładowe transakcje do historii
        account.addTransaction(new Transaction("Wpłata", 1000.0));
        account.addTransaction(new Transaction("Wpłata", 500.0));
        account.addTransaction(new Transaction("Wypłata", 300.0));

        System.out.println("Witaj, " + user.getName() + "!");
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // konsumowanie nowej linii

            switch (choice) {
                case 1:
                    user.displayUserData();
                    break;
                case 2:
                    System.out.println("Stan konta: " + account.getBalance() + " zł");
                    break;
                case 3:
                    account.displayTransactionHistory();
                    break;
                case 4:
                    System.out.print("Podaj kwotę do wpłaty: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 5:
                    System.out.print("Podaj kwotę do wypłaty: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 6:
                    System.out.println("Wylogowano.");
                    return;
                default:
                    System.out.println("Nieprawidłowy wybór.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nWybierz opcję:");
        System.out.println("1. Moje dane");
        System.out.println("2. Stan konta");
        System.out.println("3. Historia transakcji");
        System.out.println("4. Wpłata");
        System.out.println("5. Wypłata");
        System.out.println("6. Wylogowanie");
        System.out.print("Twój wybór: ");
    }
}
