public class Main {
    public static void main(String[] args) {
        // Tworzymy obiekt konta
        Account account = new Account("Jan Kowalski", 1000, "1234567890");

        try {
            // Próba wykonania przelewu większego niż saldo
            account.transfer(1200);  // Kwota większa niż dostępne środki
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Wystąpił inny błąd: " + e.getMessage());
        } finally {
            System.out.println("Aktualny stan konta: " + account.getBalance());
        }
    }
}
