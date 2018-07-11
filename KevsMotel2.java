import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.out;

class KevsMotel2{
  public static void main(String[] args) throws FileNotFoundException {

    Scanner keyboard = new Scanner(System.in);
    Scanner diskScanner = new Scanner(new File("guests.txt"));

    out.println("Select a room number ");

    int selectedRoom = keyboard.nextInt();

    for (int roomNum = 0; roomNum < selectedRoom && diskScanner.hasNext(); roomNum ++){
      diskScanner.nextInt();
    }
    if (diskScanner.hasNext()){
      out.println("Room " + selectedRoom + " has " + diskScanner.nextInt() + " guest(s).");
    }
    keyboard.close();
    diskScanner.close();
  }
}
