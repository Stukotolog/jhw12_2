public class Main {
    public static void main(String[] args) {

        int replenishment = 999;
        int remain = 100;

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }


    int balance = remain + replenishment + bonus;

        System.out.println("Ваш платеж принят. На Вашем счете: " + balance + " р. " + "Ваш бонус составил: " + bonus + " p.,");
    }
}
