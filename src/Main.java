public class Main {
    public static void main(String[] args) {
        int cost = 21000;       // стоимости билета
        int costOfMile = 20;   // количество рублей для одной бонусной мили
        int miles = cost / costOfMile;
        System.out.println("Начислено " + miles + " бонусных миль.");
    }
}