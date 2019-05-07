
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.CornerRadii;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CraigsListRevamp extends Application{

	public static void main(String[] args) {
		
		launch(args);
		
	}
	
	public void start(Stage primaryStage) {
		
		primaryStage.setFullScreen(true);

		Label logoLabel = new Label("craigslist");
		logoLabel.setId("logo-header");
		logoLabel.setPrefHeight(30);

		ComboBox<String> locationComboBox = new ComboBox<>();
		locationComboBox.setPromptText("Location");
		locationComboBox.setPrefHeight(30);
		locationComboBox.setId("location-combo-box");
		locationComboBox.getItems().addAll("Los Angeles", "San Luis Obsipo", "Santa Barbara", "Inland Empire");
		
		TextField searchField = new TextField();
		searchField.setPrefWidth(850);
		searchField.setPrefHeight(30);
		searchField.setPromptText("Search CraigsList");
		

		HBox topHeaderBox = new HBox(logoLabel, locationComboBox, searchField);
		topHeaderBox.setSpacing(50);
		topHeaderBox.setAlignment(Pos.BASELINE_LEFT);
		topHeaderBox.setId("top-header");
		topHeaderBox.setPadding(new Insets(10));
		topHeaderBox.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		topHeaderBox.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		

		ComboBox<String> communityComboBox = new ComboBox<>();
		communityComboBox.setPromptText("community");
		communityComboBox.setId("section-header");
		
		communityComboBox.getItems().addAll("activities", "events", "volunteers", "groups", "local news", "lost+found", "missed connections", "rideshare", "general");
		
		
		ComboBox<String> servicesComboBox = new ComboBox<>();
		servicesComboBox.setPromptText("services");
		servicesComboBox.setId("section-header");	
		servicesComboBox.getItems().addAll("automotive", "lifestyle", "technology", "financial", "education", "general");
		
		
		ComboBox<String> discussionComboBox = new ComboBox<>();

		discussionComboBox.setPromptText("discussion forums"); 
		discussionComboBox.getItems().addAll("technology", "religion", "education", "beauty", "finance", "lifestyle", "relationship", "general");
		discussionComboBox.setId("section-header");

		ComboBox<String> housingComboBox = new ComboBox<>();
		housingComboBox.setPromptText("housing");
		housingComboBox.getItems().addAll("apartments/housing", "office/commercial", "parking/storage", "sublease", "vacation");		
		housingComboBox.setId("section-header");

		ComboBox<String> forSaleComboBox = new ComboBox<>();
		forSaleComboBox.setPromptText("for sale");
		forSaleComboBox.getItems().addAll("technology", "appliances", "automotive", "outdoors", "music", "fashion", "general");
		forSaleComboBox.setId("section-header");

		ComboBox<String> jobsComboBox = new ComboBox<>();
		jobsComboBox.setPromptText("jobs");
		jobsComboBox.getItems().addAll("technology", "business/finance", "medical", "education", "retail", "legal", "volunteer", "general");
		jobsComboBox.setId("section-header");

		Label accountLabel = new Label("my account |");
		Label postLabel = new Label(" create a posting");
		
		HBox accountBox = new HBox(accountLabel, postLabel);
		accountBox.setAlignment(Pos.BASELINE_RIGHT);
		accountBox.setId("account");
		
		HBox sectionBox = new HBox(communityComboBox, servicesComboBox, discussionComboBox, housingComboBox, forSaleComboBox,jobsComboBox);
		
		HBox bottomHeaderBox = new HBox(sectionBox, accountBox);
		bottomHeaderBox.setSpacing(300);

		VBox headerBox = new VBox(topHeaderBox, bottomHeaderBox);
		headerBox.setPadding(new Insets(10, 10, 10, 10));
		headerBox.setId("header");
		
		
		
		

		Label post1Label = new Label("1");
		post1Label.setId("post-label");
		post1Label.setPadding(new Insets(10));
		
		ImageView pic1 = new ImageView(new Image("file:HelpWanted.png"));
		
		Label post1Title = new Label("New UI/UX designer wanted for CraigsList!   Set your own schedule!   Wages: $34-76/hr");
		post1Title.setId("post");
		
		Label post1Date = new Label("Posted: May 7");
		post1Date.setId("post-date");
		
		Label post1Options = new Label("save");
		post1Options.setId("post-options");
		
		VBox post1Description = new VBox(post1Title, post1Date, post1Options);
		HBox post1 = new HBox(post1Label, pic1, post1Description);
		post1.setAlignment(Pos.CENTER_LEFT);
		post1.setSpacing(8);
		post1.setId("entry");
		
		ImageView pic2 = new ImageView(new Image("file:HelpWanted.png"));
		
		Label post2Label = new Label("2");
		post2Label.setId("post-label");
		post2Label.setPadding(new Insets(10));
		
		Label post2Title = new Label("New hiring manager wanted for CraigsList!   Set your own schedule!   Wages: $40-80/hr");
		post2Title.setId("post");
		
		Label post2Date = new Label("Posted: May 7");
		post2Date.setId("post-date");
		
		Label post2Options = new Label("save");
		post2Options.setId("post-options");
		
		VBox post2Description = new VBox(post2Title, post2Date, post2Options);
		HBox post2 = new HBox(post2Label, pic2, post2Description);
		post2.setAlignment(Pos.CENTER_LEFT);
		post2.setSpacing(8);
		post2.setId("entry");
		
		ImageView pic3 = new ImageView(new Image("file:HelpWanted.png"));
		
		Label post3Label = new Label("3");
		post3Label.setId("post-label");
		post3Label.setPadding(new Insets(10));
		
		Label post3Title = new Label("New back-end programmer wanted for CraigsList!   Set your own schedule!   Wages: $2/hr");
		post3Title.setId("post");
		
		Label post3Date = new Label("Posted: May 7");
		post3Date.setId("post-date");
		
		Label post3Options = new Label("save");
		post3Options.setId("post-options");
		
		VBox post3Description = new VBox(post3Title, post3Date, post3Options);
		HBox post3 = new HBox(post3Label, pic3, post3Description);
		post3.setAlignment(Pos.CENTER_LEFT);
		post3.setSpacing(8);
		post3.setId("entry");
		
		ImageView pic4 = new ImageView(new Image("file:HelpWanted.png"));
		
		Label post4Label = new Label("4");
		post4Label.setId("post-label");
		post4Label.setPadding(new Insets(10));
		
		Label post4Title = new Label("New financial advisor wanted for CraigsList!   Schedule: Mon-Fri   Wages: $100/hr");
		post4Title.setId("post");
		
		Label post4Date = new Label("Posted: May 7");
		post4Date.setId("post-date");
		
		Label post4Options = new Label("save");
		post4Options.setId("post-options");
		
		VBox post4Description = new VBox(post4Title, post4Date, post4Options);
		HBox post4 = new HBox(post4Label, pic4, post4Description);
		post4.setAlignment(Pos.CENTER_LEFT);
		post4.setSpacing(8);
		post4.setId("entry");
		
		ImageView pic5 = new ImageView(new Image("file:HelpWanted.png"));
		
		Label post5Label = new Label("5");
		post5Label.setId("post-label");
		post5Label.setPadding(new Insets(10));
		
		Label post5Title = new Label("New financial advisor wanted for CraigsList!   Schedule: Mon-Fri   Wages: $100/hr");
		post5Title.setId("post");
		
		Label post5Date = new Label("Posted: May 7");
		post5Date.setId("post-date");
		
		Label post5Options = new Label("save");
		post5Options.setId("post-options");
		
		VBox post5Description = new VBox(post5Title, post5Date, post5Options);
		HBox post5 = new HBox(post5Label, pic5, post5Description);
		post5.setAlignment(Pos.CENTER_LEFT);
		post5.setSpacing(8);
		post5.setId("entry");
		
		
		
		ImageView pic6 = new ImageView(new Image("file:HelpWanted.png"));
		
		Label post6Label = new Label("6");
		post6Label.setId("post-label");
		post6Label.setPadding(new Insets(10));
		
		Label post6Title = new Label("New financial advisor wanted for CraigsList!   Schedule: Mon-Fri   Wages: $100/hr");
		post6Title.setId("post");
		
		Label post6Date = new Label("Posted: May 7");
		post6Date.setId("post-date");
		
		Label post6Options = new Label("save");
		post6Options.setId("post-options");
		
		VBox post6Description = new VBox(post6Title, post6Date, post6Options);
		HBox post6 = new HBox(post6Label, pic6, post6Description);
		post6.setAlignment(Pos.CENTER_LEFT);
		post6.setSpacing(8);
		post6.setId("entry");
		
		
		ImageView pic7 = new ImageView(new Image("file:HelpWanted.png"));
		
		Label post7Label = new Label("7");
		post7Label.setId("post-label");
		post7Label.setPadding(new Insets(10));
		
		Label post7Title = new Label("New financial advisor wanted for CraigsList!   Schedule: Mon-Fri   Wages: $100/hr");
		post7Title.setId("post");
		
		Label post7Date = new Label("Posted: May 7");
		post7Date.setId("post-date");
		
		Label post7Options = new Label("save");
		post7Options.setId("post-options");
		
		VBox post7Description = new VBox(post7Title, post7Date, post7Options);
		HBox post7 = new HBox(post7Label, pic7, post7Description);
		post7.setAlignment(Pos.CENTER_LEFT);
		post7.setSpacing(8);
		post7.setId("entry");
		
		
		ImageView pic8 = new ImageView(new Image("file:HelpWanted.png"));
		
		Label post8Label = new Label("8");
		post8Label.setId("post-label");
		post8Label.setPadding(new Insets(10));
		
		Label post8Title = new Label("New financial advisor wanted for CraigsList!   Schedule: Mon-Fri   Wages: $100/hr");
		post8Title.setId("post");
		
		Label post8Date = new Label("Posted: May 7");
		post8Date.setId("post-date");
		
		Label post8Options = new Label("save");
		post8Options.setId("post-options");
		
		VBox post8Description = new VBox(post8Title, post8Date, post8Options);
		HBox post8 = new HBox(post8Label, pic8, post8Description);
		post8.setAlignment(Pos.CENTER_LEFT);
		post8.setSpacing(8);
		post8.setId("entry");
		
		
		ImageView pic9 = new ImageView(new Image("file:HelpWanted.png"));
		
		Label post9Label = new Label("9");
		post9Label.setId("post-label");
		post9Label.setPadding(new Insets(10));
		
		Label post9Title = new Label("New financial advisor wanted for CraigsList!   Schedule: Mon-Fri   Wages: $100/hr");
		post9Title.setId("post");
		
		Label post9Date = new Label("Posted: May 7");
		post9Date.setId("post-date");
		
		Label post9Options = new Label("save");
		post9Options.setId("post-options");
		
		VBox post9Description = new VBox(post9Title, post9Date, post9Options);
		HBox post9 = new HBox(post9Label, pic9, post9Description);
		post9.setAlignment(Pos.CENTER_LEFT);
		post9.setSpacing(8);
		post9.setId("entry");
		
		Button next = new Button("Next Page >");
		next.setId("select-page");
		
		Label buttonSeparator = new Label("|");
		buttonSeparator.setId("post-label");
		
		Button previous = new Button("< Prev Page");
		previous.setId("select-page");
		
		HBox pageSelection = new HBox(previous, buttonSeparator, next);
		pageSelection.setSpacing(20);
		
		VBox mainBody = new VBox(post1, post2, post3, post4, post5, post6, post7, post8, post9, pageSelection);
		mainBody.setPadding(new Insets(20));
		
		VBox aboutUsBox = new VBox();
		aboutUsBox.getChildren().add(new Label("About Us"));
		aboutUsBox.getChildren().get(0).setId("footer-section-label");
		aboutUsBox.getChildren().add(new Label("cl jobs"));
		aboutUsBox.getChildren().get(1).setId("footer-link");
		aboutUsBox.getChildren().add(new Label("about craigslist"));
		aboutUsBox.getChildren().get(2).setId("footer-link");
		aboutUsBox.getChildren().add(new Label("faq"));
		aboutUsBox.getChildren().get(3).setId("footer-link");
		aboutUsBox.getChildren().add(new Label("craig connects"));
		aboutUsBox.getChildren().get(4).setId("footer-link");
		aboutUsBox.getChildren().add(new Label("craigslist open source"));
		aboutUsBox.getChildren().get(5).setId("footer-link");
		aboutUsBox.setPadding(new Insets(5, 50, 5, 50));

		VBox helpfulLinksBox = new VBox();
		helpfulLinksBox.getChildren().add(new Label("Helpful Links"));
		helpfulLinksBox.getChildren().get(0).setId("footer-section-label");
		helpfulLinksBox.getChildren().add(new Label("terms of use"));
		helpfulLinksBox.getChildren().get(1).setId("footer-link");
		helpfulLinksBox.getChildren().add(new Label("privacy policy"));
		helpfulLinksBox.getChildren().get(2).setId("footer-link");
		helpfulLinksBox.getChildren().add(new Label("personal safety tips"));
		helpfulLinksBox.getChildren().get(3).setId("footer-link");
		helpfulLinksBox.getChildren().add(new Label("avoiding scams & fraud"));
		helpfulLinksBox.getChildren().get(4).setId("footer-link");
		helpfulLinksBox.getChildren().add(new Label("feedback"));
		helpfulLinksBox.getChildren().get(5).setId("footer-link");
		helpfulLinksBox.setPadding(new Insets(5, 50, 5, 50));
	    	
		VBox otherResourcesBox = new VBox();
		otherResourcesBox.getChildren().add(new Label("Other Resources"));
		otherResourcesBox.getChildren().get(0).setId("footer-section-label");
		otherResourcesBox.getChildren().add(new Label("craigslist blog"));
		otherResourcesBox.getChildren().get(1).setId("footer-link");
		otherResourcesBox.getChildren().add(new Label("best-of-craigslist"));
		otherResourcesBox.getChildren().get(2).setId("footer-link");
		otherResourcesBox.getChildren().add(new Label("craigslist TV"));
		otherResourcesBox.getChildren().add(new Label("\"craigslist joe\""));
		otherResourcesBox.getChildren().get(4).setId("footer-link");
		otherResourcesBox.getChildren().add(new Label("system status"));
		otherResourcesBox.getChildren().get(5).setId("footer-link");
		otherResourcesBox.setPadding(new Insets(5, 50, 5, 50));
	    	
		HBox footerSections = new HBox(aboutUsBox, helpfulLinksBox, otherResourcesBox);
		footerSections.setAlignment(Pos.CENTER);
		
		footerSections.setPadding(new Insets(0, 300, 0, 300));
		VBox footerRibbonBox = new VBox(footerSections, new Label("\u00A9 craigslist"));
		footerRibbonBox.getChildren().get(1).setStyle("-fx-underline: false;-fx-text-fill: #000000;-fx-background-color: #F5F5F5;-fx-alignment: CENTER;");
		
		BorderPane site = new BorderPane();
		site.setTop(headerBox);
		site.setCenter(mainBody);
		site.setBottom(footerRibbonBox);
		
	    
		Scene scene = new Scene(site);
		scene.getStylesheets().add("style.css");
		primaryStage.setTitle("craigslist");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
}

