import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.out;

class numberOfGuests{
  public static void main(String[] args) throws FileNotFoundException{
    Scanner diskScanner = new Scanner(new File("hotelData.txt"));
    out.println("                Number Of Guests per Room");
    for (int floor = 1; floor <= 9; floor++){
      out.print("Floor ");
      out.print(floor);
      out.print(":  ");

      for (int roomNumber = 1; roomNumber <=20; roomNumber++){
        out.print(diskScanner.nextInt());
        out.print(" ");
      }
      out.println();
    }
  diskScanner.close();
  }
}
