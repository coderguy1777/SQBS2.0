package GUIandJavaFXFrontEnd;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.shape.Box;
import javafx.scene.layout.StackPane;
import MainFiles.DivisionEntry;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Frontend extends Application {

    private static String aboutinfo =
                    "  Made by CSW Quizbowl Students to revitalize stat keeping during NAQT Tournaments in Wilmington Delaware.  \n "
                    + "SQBS 2.0 is meant to revitalize the loved stat application, SQBS, with a more modern touch. SQBS 2.0 is made to\n"
                    + "fix these problems by integrating much needed features, such as more intuitive features that can speed up the\n"
                    + "statistical process of running Quizbowl tournament.";
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane menu = new StackPane();
        StackPane tournamententering = new StackPane();
        StackPane aboutsec = new StackPane();

        // New Tournament option.
        Button new_tournament = new Button("New Tournament");
        new_tournament.setMaxWidth(200.0);
        new_tournament.setMaxHeight(50.0);
        new_tournament.setTranslateY(-100.0);
        new_tournament.setFont(new Font("Sans", 20));
        menu.getChildren().add(new_tournament);

        // Old Tournament Option
        Button old_tournament = new Button("Open a Previous Tournament");
        old_tournament.setMaxHeight(50.0);
        old_tournament.setMaxWidth(200.0);
        old_tournament.setTranslateY(-40.0);
        old_tournament.setFont(new Font("Sans", 13));
        menu.getChildren().add(old_tournament);

        // Settings Option
        Button settings = new Button("Settings");
        settings.setMaxHeight(50.0);
        settings.setMaxWidth(200.0);
        settings.setTranslateY(20.0);
        settings.setFont(new Font("Sans", 20));
        menu.getChildren().add(settings);

        // Option for another language
        Button languageoption = new Button("Languages");
        languageoption.setMaxWidth(200.0);
        languageoption.setMaxHeight(50.0);
        languageoption.setTranslateY(80.0);
        languageoption.setFont(new Font("Sans", 20));
        menu.getChildren().add(languageoption);

        // Option for the about section of SQBS
        Button about = new Button("About");
        about.setMaxHeight(50.0);
        about.setMaxWidth(200.0);
        about.setTranslateY(140.0);
        about.setFont(new Font("Sans", 20));
        menu.getChildren().add(about);

        // Title
        Label title = new Label("SQBS 2.0");
        title.setTranslateY(-400.0);
        title.setAlignment(Pos.CENTER);
        title.setMaxWidth(300.0);
        title.setMaxHeight(100.0);
        title.setFont(new Font("Sans", 50));
        menu.getChildren().add(title);

        // About section stuff
        Label info = new Label(aboutinfo);
        info.setTranslateY(-130.0);
        info.setWrapText(true);
        info.setAlignment(Pos.CENTER);
        info.setFont(new Font("Sans", 15));
        aboutsec.getChildren().add(info);
        info.getStyleClass().add("aboutcss");

        // Aligns content in the center of the window.
        menu.setAlignment(Pos.CENTER);

        // Set up of scenes and windows for the program to use
        primaryStage.setTitle("SQBS 2.0");
        // Menu
        Scene scene = new Scene(menu, 1920, 1020);
        // About section
        Scene aboutsection = new Scene(aboutsec, 1920, 1020);

        // Button Events
        about.setOnAction(event -> primaryStage.setScene(aboutsection));

        // CSS Styling
        aboutsec.getStyleClass().add("body2");
        menu.getStylesheets().add(getClass().getResource("FrontendStyling.css").toExternalForm());
        aboutsection.getStylesheets().add(getClass().getResource("FrontendStyling.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}