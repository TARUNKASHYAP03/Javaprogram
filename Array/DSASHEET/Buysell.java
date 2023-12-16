package JavaProgram.Array.DSASheet;

public class Buy$sell {
    public static void stock(int dayprice[]) {
        int buyP = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < dayprice.length; i++) {
            if (buyP < dayprice[i]) {
                int profit = dayprice[i] - buyP;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyP = dayprice[i];
            }
        }
        System.out.println("Maxmimum profit : " + maxprofit);
    }

    public static void main(String[] args) {
        int dayprice[] = { 7, 1, 5, 3, 6, 4 };

        stock(dayprice);
    }
}
