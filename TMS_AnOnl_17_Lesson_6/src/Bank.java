public class Bank {
    private static int Cash;
    private int Twenty;
    private int Fifty;
    private int Onehundred;

    public Bank(int Twenty, int Fifty, int Onehundred) {
        this.Twenty = Twenty;
        this.Fifty = Fifty;
        this.Onehundred = Onehundred;
    }

    public void addCash(int CashTwenty, int CashFifty, int CashOnehundred, int currentCash) {
        CashTwenty += CashTwenty;
        CashFifty += CashFifty;
        CashOnehundred += CashOnehundred;
        currentCash = CashTwenty * 20 + CashFifty * 50 + CashOnehundred * 100;
    }

    public boolean CheckCash(int cash) {
        boolean result;
        int Twenty;
        int Firty;
        int Onehundred;
        int currentCash = 0;

        if (currentCash > cash && cash != 0) ;
        Onehundred = cash / 100;
        Fifty = (cash % 100) / 50;
        Twenty = ((cash % 100) % 50) / 20;

        currentCash -= cash;

        System.out.printf("Выдано: %S \nКупюрами 100: %S, Выдано: %S \nКупюрами 50: %S, Выдано: %S \nКупюрами 20: %S");
        result = true;
        return result;
    }
}
