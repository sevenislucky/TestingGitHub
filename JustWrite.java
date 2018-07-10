import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class JustWrite{
  public static void main(String args[]) throws FileNotFoundException {
    PrintStream diskWriter = new PrintStream("approval.txt");
    diskWriter.print('o');
    diskWriter.println('k');
    diskWriter.close();
  }
}
