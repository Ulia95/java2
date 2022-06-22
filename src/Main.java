public class Main {
    public static void main(String[] args) {
        int startingScore = 100;
        int replenishmentAmount = 1500;
        int x = replenishmentAmount;
        int bonus;


        if (x > 1000) {
            bonus = x / 100;
            int customerAccount = bonus + x + startingScore;
            System.out.println("Счет клиента: "+ customerAccount);
        }  else {
            bonus = 0;
        }

    }

}
