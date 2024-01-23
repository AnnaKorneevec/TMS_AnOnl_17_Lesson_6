;public class CreditCard {
    private final long Number;
    private long Cashcash;
    public CreditCard(long Number, long Cashcash) {
        this.Number = Number;
        this.Cashcash = Cashcash;
    }
    public void addCash(int cash) {
        Cashcash += cash;
    }
    public void BalanceCash(int cash) {
        if (cash > Cashcash || cash < 0) {
            System.out.println("Ошибка. Недостаточно средств");
        }
        Cashcash -= cash;
    }
    public void BalanceInfo() {
        System.out.printf("Номер счета: %S Состояние счета: %S \n, Number, Cashcash");
    }
}
