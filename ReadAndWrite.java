import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

class ReadAndWrite{
  public static void main(String args[]) throws FileNotFoundException {
    Scanner diskScanner = new Scanner(new File("cookedData.txt"));
    PrintStream diskWriter = new PrintStream("helloFile.txt");

    double unitPrice, quantity, total;

    unitPrice = diskScanner.nextDouble();
    quantity = diskScanner.nextInt();

    total = unitPrice * quantity;

    diskWriter.println(total);

    diskScanner.close();
    diskWriter.close();
  }
}
