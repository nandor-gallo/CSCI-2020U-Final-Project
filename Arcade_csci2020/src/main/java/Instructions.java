package mainApp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Instructions extends Application {

    private int Width = 900;
    private int Height = 590;

    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox box = new VBox(10);

        Pane pane = new Pane();

        MenuTitle title = new MenuTitle("Instructions");
        title.setTranslateX(Width / 2 - title.getTitleWidth() / 2);
        title.setTranslateY(Height / 11);

        pane.getChildren().add(title);

        Text[] text = {new Text("TicTacToe:"), new Text("Blackjack:"), new Text("Snake:"),
                new Text("Jeopardy:"), new Text("President:"), new Text("Rain"),
                new Text("Pong:"), new Text("Hangman:")};

        for(int i=0; i<8; i++){
            text[i].setFill(Color.WHITE);
            text[i].setFont(Font.loadFont(MenuDriver.class.getResource("res/HyperspaceBold.otf").toExternalForm(), 15));
            box.getChildren().addAll(text[i]);
        }

        Button button = new Button("Back");
        button.setOnAction(actionEvent -> primaryStage.close());

        box.getChildren().addAll(button);
        box.setTranslateX(Width/4 + 20);
        box.setTranslateY(Height/4);

        pane.getChildren().addAll(box);
        pane.setStyle("-fx-background-color: black");

        primaryStage.setTitle("Instructions");
        primaryStage.setScene(new Scene(pane, Width, Height));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
