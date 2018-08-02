import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{ //implements EventHandler<ActionEvent>{

  Button button;

  public static void main(String[] args) {

    launch(args);

  }
  @Override
  public void start(Stage primaryStage) throws Exception{
    // Title of the window(stage)
    primaryStage.setTitle("My Window");
    // button named Press My button!
    button = new Button();
    button.setText("Press My Button");
    // add button to the scene
    StackPane layout = new StackPane();
    layout.getChildren().add(button);
    // if button pressed go to handle method
    button.setOnAction(e -> System.out.println("hello"));
    Scene scene = new Scene(layout, 300,250);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  //@Override
  //public void handle(ActionEvent event){
  //  // if button pressed do something.....fo now im writing
  //  // to your console....mixing GUI with console nice :)
  //  if (event.getSource() == button){
  //    System.out.println("Nice touch!");
  //  }
}
