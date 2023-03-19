package Solutions.week10;

public class ExcelSheetColumnNumber {

  public static void main(String[] args) {
    String title = null;

    title = "A";
    System.out.println("for title: " + title + ", result: " + dummySolution(title)); // 1
    //todo call your method from here with sout like above line

    title = "C";
    System.out.println("for title: " + title + ", result: " + dummySolution(title)); // 3
    //todo call your method from here with sout like above line

    title = "AA";
    System.out.println("for title: " + title + ", result: " + dummySolution(title)); // 27
    //todo call your method from here with sout like above line

    title = "AB";
    System.out.println("for title: " + title + ", result: " + dummySolution(title)); // 28
    //todo call your method from here with sout like above line

    title = "ZY";
    System.out.println("for title: " + title + ", result: " + dummySolution(title)); // 701
    //todo call your method from here with sout like above line

    title = "BCM";
    System.out.println("for title: " + title + ", result: " + dummySolution(title)); //1443
    //todo call your method from here with sout like above line
  }

  static int dummySolution(String title) {
    //just for method blueprint
    return 0;
  }
}
