package Solutions.week10;
/*
Question-2 Excel Sheet Column Number

Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 ...

Example 1:
Input: columnTitle = "A"  Output: 1
Example 2:
Input: columnTitle = "AB" Output: 28
Example 3:
Input: columnTitle = "ZY" Output: 701

Constraints:
1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters. columnTitle is in the range ["A", "FXSHRXW"].
Please, test your solution here: https://leetcode.com/problems/excel-sheet-column-number/
 */
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
