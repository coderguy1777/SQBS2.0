package TestingZone;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesterClass extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        StackPane test = new StackPane();
        root.setPrefSize(400, 300);
        Text text = new Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit."
                + " Nullam vehicula justo et sem venenatis mattis non ut quam. "
                + "Aliquam erat volutpat. Etiam maximus magna quis tortor "
                + "pellentesque, in sollicitudin odio ullamcorper. Phasellus "
                + "a quam nisl. Fusce at urna dapibus, elementum quam "
                + "ultricies, posuere ipsum. Etiam varius orci a tortor "
                + "vestibulum fringilla. Sed consectetur nunc rhoncus diam "
                + "volutpat, vitae finibus eros cursus. Praesent quam mauris, "
                + "lacinia nec metus vitae, blandit faucibus tortor.");

        text.setWrappingWidth(385);
        text.setLayoutX(15);
        text.setLayoutY(20);


        VBox menu = new VBox();
        menu.setId("menu");
        menu.setMaxWidth(200.0);

        menu.getChildren().addAll(new Button("Something"), new Button("Something else"), new Button("Something different"));

        menu.getStylesheets().add(getClass().getResource("word-like-menu-button.css").toExternalForm());
        menu.setTranslateX(-750);
        TranslateTransition menuTranslation = new TranslateTransition(Duration.millis(200), menu);

        menuTranslation.setToX(20.0);
        Button button = new Button();
        button.setTranslateX(-20);
        button.setMaxHeight(20.0);
        button.setMaxWidth(20.0);
        button.setText("HEL");
        menuTranslation.setToX(-550.0);


        Button button2 = new Button("Resr");
        button2.setTranslateX(-50);
        button2.setMaxWidth(20.0);
        button2.setMaxHeight(20.0);
        button2.setVisible(false);
        button.setOnMouseClicked(evt -> {
            menuTranslation.play();
            button2.setVisible(true);
            button.setVisible(false);
        });

        test.getChildren().addAll(menu, button, button2);
        TranslateTransition menuTrans = new TranslateTransition(Duration.millis(200), menu);
        menuTrans.setToX(-750.0);
        button2.setOnMouseClicked(evt -> {
            menuTrans.play();
            button.setVisible(true);
            button2.setVisible(false);
        });


        Scene scene = new Scene(test, 800, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}