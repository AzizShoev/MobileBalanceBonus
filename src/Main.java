public class Main {
    public static void main(String[] args) {

        int clientBalance = 500;
        int upAmountBalance = 1590;
        int bonus = 0;

        if (upAmountBalance > 1000) {
            bonus = (upAmountBalance / 100 * 1);
        }
        else{
            System.out.println("Внесено недостаточно средств для начисления бонуса.");
        }

        int totalBalance = clientBalance + upAmountBalance + bonus;

        System.out.println("Сумма пополнения счета: " + upAmountBalance + " рублей");
        System.out.println("Сумма бонуса: " + bonus + " рублей");
        System.out.println("Итоговый баланс: " + totalBalance + " рублей");
    }

}