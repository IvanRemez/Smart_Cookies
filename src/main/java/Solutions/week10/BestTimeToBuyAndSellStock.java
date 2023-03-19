package Solutions.week10;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {

  public static void main(String[] args) {
    int[] ints = null;

    ints = new int[]{7, 1, 5, 3, 6, 4}; // 5
    System.out.println(dummySolution(ints));
    //todo call your method from here with sout like above line

    ints = new int[]{7, 6, 4, 3, 1}; // 0
    System.out.println(dummySolution(ints));
    //todo call your method from here with sout like above line
  }

  static int dummySolution(int[] prices) {
    //just for method blueprint
    return 0;
  }
}
