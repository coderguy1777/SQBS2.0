package GUIandJavaFXFrontEnd;

// Imports from javafx
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;


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


        // Tutorials Icon Caption Label
        Label tutorials = new Label("SQBS 2.0 Tutorials!");
        tutorials.setFont(new Font("Arial", 15));
        tutorials.setTranslateX(-850.0);
        tutorials.setTranslateY(75.0);
        menu.getChildren().add(tutorials);
        tutorials.getStyleClass().add("testclass");
        tutorials.setVisible(false);
        System.out.println(tutorials.getHeight());

        // Pull down arrow icon
        Image imagea = new Image("https://image.flaticon.com/icons/png/512/37/37111.png", 30, 30, false, true);
        ImageView imageA = new ImageView(imagea);
        imageA.setVisible(true);
        imageA.setTranslateX(-600);
        imageA.setTranslateY(-493);


        // Pull down bar for side menu
        // Made with the use of Hbox to
        // create vertical row.
        Button open = new Button("Open Options");
        Button close = new Button("Close Options");
        HBox menuOptions = new HBox();
        menuOptions.getChildren().addAll(close,  open);
        menu.getChildren().add(menuOptions);
        menuOptions.setTranslateX(-600);
        menuOptions.setTranslateY(-550);
        menuOptions.setId("menuOptions");
        menuOptions.setMaxWidth(300.0);
        menuOptions.setMaxHeight(40.0);
        menuOptions.setPadding(new Insets(10, 10, 15, 10));

        Button moreOptions = new Button();
        moreOptions.setMaxWidth(100.0);
        moreOptions.setMaxHeight(50.0);
        moreOptions.setTranslateX(-600);
        moreOptions.setTranslateY(-500);
        menu.getChildren().addAll(moreOptions, imageA);
        TranslateTransition dropDownTransition = new TranslateTransition(Duration.millis(300), moreOptions);
        TranslateTransition dropDDownTransition = new TranslateTransition(Duration.millis(300), imageA);
        TranslateTransition dropDDDownTransition = new TranslateTransition(Duration.millis(300), menuOptions);

        dropDDDownTransition.setToY(-480);
        dropDDownTransition.setToY(-430);
        dropDownTransition.setToY(-430);

        TranslateTransition dr1opDownTransition = new TranslateTransition(Duration.millis(400), moreOptions);
        TranslateTransition dr1opDDownTransition = new TranslateTransition(Duration.millis(400), imageA);
        TranslateTransition dr1opDDDownTransition = new TranslateTransition(Duration.millis(400), menuOptions);

        dr1opDownTransition.setToY(-500);
        dr1opDDownTransition.setToY(-493);
        dr1opDDDownTransition.setToY(-550);

        moreOptions.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                dropDDDownTransition.play();
                dropDDownTransition.play();
                dropDownTransition.play();
            }
        });
        moreOptions.setId("buttonmore");
        imageA.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                dr1opDDDownTransition.play();
                dr1opDownTransition.play();
                dr1opDDownTransition.play();
            }
        });


        // Side Bar Menu
        VBox menus = new VBox();
        menus.setId("menu");
        menus.setMaxWidth(200.0);
        Button currentTournamentMonitor = new Button("Current Tournament");
        Button Tutorials = new Button("Tutorials");
        menus.setPadding(new Insets(10, 10, 10, 10));

        menus.getChildren().addAll(currentTournamentMonitor, new Button("Something else"), new Button("Something different"), Tutorials);
        menus.setTranslateX(-1200);
        TranslateTransition menuTranslation = new TranslateTransition(Duration.millis(200), menus);
        menuTranslation.setToX(-860);
        TranslateTransition menuTrans = new TranslateTransition(Duration.millis(200), menus);
        menuTrans.setToX(-1200);
        open.setOnMouseClicked(event -> menuTranslation.play());
        close.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                menuTrans.play();
            }
        });
        menu.getChildren().addAll(menus);

        // Set up of scenes and windows for the program to use
        primaryStage.setTitle("SQBS 2.0");
        // Menu
        Scene scene = new Scene(menu, 1920, 1020);
        // About section
        Scene aboutsection = new Scene(aboutsec, 1920, 1020);


        // Button Events
        about.setOnAction(event -> primaryStage.setScene(aboutsection));

        // Fullscreen event
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if(event.getCode() == KeyCode.F) {
                    primaryStage.setFullScreen(true);
                }
            }
        });

        // CSS Styling
        aboutsec.getStyleClass().add("body2");
        menu.getStylesheets().add(getClass().getResource("FrontendStyling.css").toExternalForm());
        aboutsection.getStylesheets().add(getClass().getResource("FrontendStyling.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}