package GUIandJavaFXFrontEnd;

// Imports from javafx

import MainFiles.DivisionEntry;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;


public class Frontend extends Application {
    public String a;
    public String b;
    public String c;


    // About section info string
    private static String aboutinfo =
                    "  Made by CSW Quizbowl Students to revitalize stat keeping during NAQT Tournaments in Wilmington Delaware.  \n "
                    + "SQBS 2.0 is meant to revitalize the loved stat application, SQBS, with a more modern touch. SQBS 2.0 is made to\n"
                    + "fix these problems by integrating much needed features, such as more intuitive features that can speed up the\n"
                    + "statistical process of running Quizbowl tournament.";
    @Override
    public void start(Stage primaryStage) throws Exception {
        // StackPanes for use within the program
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

        // Back Button for about section
        Button back = new Button("Go back");
        back.setFont(new Font("Arial", 15));
        back.setTranslateX(-900);
        back.setTranslateY(475);
        aboutsec.getChildren().add(back);

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
        DynamicScale scale2 = new DynamicScale(primaryStage.getHeight(), primaryStage.getWidth(), imagea.getHeight(), imagea.getWidth());
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
        menuOptions.setTranslateY(-560);
        menuOptions.setId("menuOptions");
        menuOptions.setMaxWidth(300.0);
        menuOptions.setMaxHeight(40.0);
        menuOptions.setPadding(new Insets(10, 10, 15, 10));
        DynamicScale scale = new DynamicScale(primaryStage.getMaxHeight(), primaryStage.getMaxWidth(), menuOptions.getHeight(), menuOptions.getWidth());

        // More Options Button for the menu.
        Button moreOptions = new Button();
        moreOptions.setMaxWidth(100.0);
        moreOptions.setMaxHeight(50.0);
        moreOptions.setTranslateX(-600);
        moreOptions.setTranslateY(-500);

        // Adding of animation transitions into the pull down for the buttons
        // to pull the side menu up. as well, etc.
        menu.getChildren().addAll(moreOptions, imageA);
        TranslateTransition dropDownTransition = new TranslateTransition(Duration.millis(300), moreOptions);
        TranslateTransition dropDDownTransition = new TranslateTransition(Duration.millis(300), imageA);
        TranslateTransition dropDDDownTransition = new TranslateTransition(Duration.millis(300), menuOptions);

        // Setting of the animation positions
        dropDDDownTransition.setToY(-480);
        dropDDownTransition.setToY(-430);
        dropDownTransition.setToY(-430);

        //Closing animations for the buttons in this case
        TranslateTransition dr1opDownTransition = new TranslateTransition(Duration.millis(400), moreOptions);
        TranslateTransition dr1opDDownTransition = new TranslateTransition(Duration.millis(400), imageA);
        TranslateTransition dr1opDDDownTransition = new TranslateTransition(Duration.millis(400), menuOptions);

        dr1opDownTransition.setToY(-500);
        dr1opDDownTransition.setToY(-493);
        dr1opDDDownTransition.setToY(-550);

        // Side Menu events for mouse clicks
        moreOptions.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                dropDDDownTransition.play();
                dropDDownTransition.play();
                dropDownTransition.play();
            }
        });
        // Setting up css button id
        moreOptions.setId("buttonmore");

        // Mouse Click event for the image.
        imageA.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                // Plays the animations for the closing part of the drop down button
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

        // More action for the side menu and that working as well.
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

        /*
        section in which the team entering UI is created.
         */

        // Rectangle for storing the first options of amount of teams and divisions
        Rectangle rectangle = new Rectangle(250, 260, 20, 20);
        rectangle.setHeight(360.0);
        rectangle.setWidth(260.0);
        rectangle.setTranslateX(-500);
        rectangle.setTranslateY(-100);
        tournamententering.getChildren().add(rectangle);
        rectangle.setId("Test");
        ShapeColors shapeColors = new ShapeColors(10);
        rectangle.setFill(shapeColors.getColor(10));
        rectangle.setArcHeight(15);
        rectangle.setArcWidth(15);

        // Label for the amount of divisions wanted for the tournament.
        Label amountsofteamsdivs = new Label("Amount of Divisions");
        amountsofteamsdivs.setFont(new Font("Arial", 15));
        amountsofteamsdivs.setTranslateX(-500);
        amountsofteamsdivs.setTranslateY(-200.0);
        tournamententering.getChildren().add(amountsofteamsdivs);

        // Label for the amount of teams in each division
        Label teamamount = new Label("Amount of Teams");
        teamamount.setFont(new Font("Arial", 15));
        teamamount.setTranslateX(-500);
        teamamount.setTranslateY(-110);
        tournamententering.getChildren().add(teamamount);

        //Label for the teams with substiutes.
        Label teamswithsubs = new Label("Amount of Teams with Subs");
        teamswithsubs.setFont(new Font("Arial", 15));
        teamswithsubs.setTranslateX(-500);
        teamswithsubs.setTranslateY(-20);
        tournamententering.getChildren().add(teamswithsubs);


        // Text Field for entering the division amount
        TextField divisions = new TextField();
        divisions.isEditable();
        divisions.setTranslateX(-530);
        divisions.setTranslateY(-170);
        divisions.setId("textDivField");
        tournamententering.getChildren().add(divisions);

        // Text Field for entering team amount
        TextField teams = new TextField();
        teams.isEditable();
        teams.setTranslateX(-530);
        teams.setTranslateY(-78);
        teams.setId("textDivField");
        tournamententering.getChildren().add(teams);

        // Text Field for entering teams with subs.
        TextField teamsWithSubs = new TextField();
        teamsWithSubs.isEditable();
        teamsWithSubs.setTranslateX(-530.0);
        teamsWithSubs.setTranslateY(12);
        teamsWithSubs.setId("textDivField");
        tournamententering.getChildren().add(teamsWithSubs);


        // Button to confirm the amount of divisions entered
        Button confirmDivs = new Button("Confirm");
        confirmDivs.setTranslateY(-170);
        confirmDivs.setTranslateX(-480);
        confirmDivs.setFont(new Font("Arial", 10));
        confirmDivs.setId("confirmButton");
        tournamententering.getChildren().add(confirmDivs);
        confirmDivs.setOnMouseClicked(event -> divisions.setEditable(false));

        // Button to confirm the amount of teams entered
        Button confirmTeams = new Button("Confirm");
        confirmTeams.setTranslateX(-480);
        confirmTeams.setTranslateY(-78);
        confirmTeams.setFont(new Font("Arial", 10.0));
        confirmTeams.setId("confirmButton");
        tournamententering.getChildren().add(confirmTeams);
        confirmTeams.setOnMouseClicked(event -> teams.setEditable(false));


        // Confirm button for bottom
        Button finalConfirm = new Button("Confirm all choices");
        finalConfirm.setTranslateX(-500);
        finalConfirm.setTranslateY(50);
        finalConfirm.setFont(new Font("Arial", 15));
        finalConfirm.setId("finalConf");
        tournamententering.getChildren().add(finalConfirm);

        /*
            An event that confirms the team names, division names, and team names, and
            prepares them for being named in this case in the next option box.
         */
        finalConfirm.setOnMouseClicked(event -> {
            // Prepares the match info for parsing
            ArrayList<String>tournamentinfo = new ArrayList<>();
            a = divisions.getText();
            b = teams.getText();
            c = teamsWithSubs.getText();
            tournamentinfo.add(a);
            tournamentinfo.add(b);
            tournamentinfo.add(c);
            DivisionEntry divisionEntry = new DivisionEntry(tournamentinfo);
            divisionEntry.newBracketCreator();
            System.out.println(divisionEntry.getDivisionamount());
            divisionEntry.newBracketCreator();
            divisionEntry.tester();
            MenuButton tester;
            for(int i = 0; i < divisionEntry.getDivisionamount(); i++) {
                System.out.println(i);
            }
        });


        // Button to confirm teams with subs entered
        Button teamsWWithSubs = new Button();
        teamsWWithSubs.setText("Confirm");
        teamsWWithSubs.setTranslateX(-480);
        teamsWWithSubs.setTranslateY(12.0);
        teamsWWithSubs.setFont(new Font("Arial", 10.00));
        teamsWWithSubs.setId("confirmButton");
        tournamententering.getChildren().add(teamsWWithSubs);
        teamsWWithSubs.setOnMouseClicked(event -> teamsWithSubs.setEditable(false));

        // Rectangle for the background of the teamn name set up and experienced
        // setup for brackets
        Rectangle bracketSetupTeams = new Rectangle(300, 350,20, 20);
        bracketSetupTeams.setHeight(300.0);
        bracketSetupTeams.setWidth(250.0);
        bracketSetupTeams.setTranslateX(-200);
        bracketSetupTeams.setTranslateY(-100);
        bracketSetupTeams.setId("BracketSetupP1");
        bracketSetupTeams.setFill(shapeColors.getColor(10));
        bracketSetupTeams.setArcWidth(15);
        bracketSetupTeams.setArcHeight(15);
        tournamententering.getChildren().add(bracketSetupTeams);

        // Label for the divisions and the division name
        Label divNames = new Label();
        divNames.setText("Division and Team names");
        divNames.setId("DivisionNames");
        divNames.setFont(new Font("Arial", 13));
        divNames.setTranslateX(-200);
        divNames.setTranslateY(-220);
        divNames.setPadding(new Insets(5, 5, 5, 5));
        tournamententering.getChildren().add(divNames);

        // Labels for division selection
        Label divisionName = new Label();
        divisionName.setText("Division");
        divisionName.setId("DivisionName");
        divisionName.setFont(new Font("Arial", 13));
        divisionName.setTranslateX(-250);
        divisionName.setTranslateY(-190);
        divisionName.setPadding(new Insets(3, 3, 3, 3));
        tournamententering.getChildren().add(divisionName);


        /* Label for team selection */
        Label teamNamee = new Label();
        teamNamee.setText("Team");
        teamNamee.setId("teamNamer");
        teamNamee.setFont(new Font("Arial", 13));
        teamNamee.setTranslateX(-250.0);
        teamNamee.setTranslateY(-140);
        teamNamee.setPadding(new Insets(3, 3, 3, 3));
        tournamententering.getChildren().add(teamNamee);

        // Input for Name value
        Label newNameDiv = new Label();
        newNameDiv.setText("Name");
        newNameDiv.setId("newDiv");
        newNameDiv.setFont(new Font("Arial", 13));
        newNameDiv.setTranslateX(-145);
        newNameDiv.setTranslateY(-190);
        newNameDiv.setPadding(new Insets(3, 3, 3,3));
        tournamententering.getChildren().add(newNameDiv);

        // Second new name value
        Label newNameeTeam = new Label();
        newNameeTeam.setId("NewTeam");
        newNameeTeam.setText("Name");
        newNameeTeam.setFont(new Font("Arial", 13));
        newNameeTeam.setTranslateX(-145);
        newNameeTeam.setTranslateY(-140.0);
        tournamententering.getChildren().add(newNameeTeam);




        // Back Button (Tournament Entering Section)
        Button backTournament = new Button("Go Back");
        backTournament.setFont(new Font("Arial", 15));
        backTournament.setTranslateX(-900);
        backTournament.setTranslateY(475);
        tournamententering.getChildren().add(backTournament);

        /*
            CSS IDS for use for styling.
         */
        amountsofteamsdivs.setId("TeamDivID");
        teamamount.setId("TeamAmountID");
        teamswithsubs.setId("TeamSubID");

        // Creation of padding for the labels for the stat keeping set.
        teamamount.setPadding(new Insets(5, 5, 5, 5));
        amountsofteamsdivs.setPadding(new Insets(5, 5, 5, 5));
        teamswithsubs.setPadding(new Insets(5, 5, 5, 5));

        // Set up of scenes and windows for the program to use
        primaryStage.setTitle("SQBS 2.0");
        // Menu
        Scene scene = new Scene(menu, 1920, 1020);
        // About section
        Scene aboutsection = new Scene(aboutsec, 1920, 1020);
        // Tournament Creation section
        Scene tournamentcreation = new Scene(tournamententering, 1920, 1020);


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

        // Back Button event for the about section
        back.setOnMouseClicked(event -> primaryStage.setScene(scene));

        // Button that goes back from the new tournament section
        backTournament.setOnMouseClicked(event -> primaryStage.setScene(scene));

        // Opens the new tournament section for a new tournament creation
        new_tournament.setOnMouseClicked(event -> primaryStage.setScene(tournamentcreation));

        // CSS Styling
        aboutsec.getStyleClass().add("body2");
        menu.getStylesheets().add(getClass().getResource("FrontendStyling.css").toExternalForm());
        aboutsection.getStylesheets().add(getClass().getResource("FrontendStyling.css").toExternalForm());
        tournamententering.getStylesheets().add(getClass().getResource("TournamentEntering.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}