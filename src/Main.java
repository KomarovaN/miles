public class Main {
    public static void main(String[] args) {
        int cost = 21000;       // стоимости билета
        // int costOfMile = 10;   // количество рублей для одной бонусной мили
        // int miles = cost / costOfMile;

        // Модернизация
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(cost);
        System.out.println("Начислено " + miles + " бонусных миль.");
    }
}