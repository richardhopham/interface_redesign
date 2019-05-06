
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
import javafx.scene.control.TitledPane;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CraigsListRevamp extends Application{

	public static void main(String[] args) {
		
		launch(args);
		
	}
	
	public void start(Stage primaryStage) {
		
		primaryStage.setFullScreen(true);

		Label logoLabel = new Label("CraigsList");
		logoLabel.setId("logo-header");
		logoLabel.setPrefHeight(30);

		ComboBox<String> locationComboBox = new ComboBox<>();
		locationComboBox.setPromptText("Location");
		locationComboBox.setPrefHeight(30);
		locationComboBox.setId("location-combo-box");
		locationComboBox.getItems().addAll("Los Angeles", "San Luis Obsipo", "Santa Barbara", "Inland Empire");
		
		TextField searchField = new TextField();
		searchField.setPrefWidth(500);
		searchField.setPrefHeight(30);
		searchField.setPromptText("Search CraigsList");

		HBox topHeaderBox = new HBox(logoLabel, locationComboBox, searchField);
		topHeaderBox.setSpacing(50);
		topHeaderBox.setAlignment(Pos.BASELINE_LEFT);

		TitledPane communityPane = new TitledPane();
		communityPane.setText("community");
		communityPane.setId("section-header");
		communityPane.setExpanded(false);
		
		VBox communityBox = new VBox();
		communityBox.getChildren().add(new Label("activities"));
		communityBox.getChildren().add(new Label("events"));
		communityBox.getChildren().add(new Label("volunteers"));
		communityBox.getChildren().add(new Label("groups"));
		communityBox.getChildren().add(new Label("local news"));
		communityBox.getChildren().add(new Label("lost+found"));
		communityBox.getChildren().add(new Label("missed connections"));
		communityBox.getChildren().add(new Label("rideshare"));
		communityBox.getChildren().add(new Label("general"));
		communityPane.setContent(communityBox);
		
		TitledPane servicesPane = new TitledPane();
		servicesPane.setText("services");
		servicesPane.setExpanded(false);
		VBox servicesBox = new VBox();
		servicesBox.getChildren().add(new Label("automotive"));
		servicesBox.getChildren().add(new Label("lifestyle"));
		servicesBox.getChildren().add(new Label("technology"));
		servicesBox.getChildren().add(new Label("financial"));
		servicesBox.getChildren().add(new Label("education"));
		servicesBox.getChildren().add(new Label("general"));

		servicesPane.setContent(servicesBox);
		servicesPane.setId("section-header");

		TitledPane discussionPane = new TitledPane();

		discussionPane.setText("discussion forums");
		discussionPane.setExpanded(false);                
		VBox discussionBox = new VBox();
		discussionBox.getChildren().add(new Label("technology"));
		discussionBox.getChildren().add(new Label("religion"));
		discussionBox.getChildren().add(new Label("education"));
		discussionBox.getChildren().add(new Label("beauty"));
		discussionBox.getChildren().add(new Label("finance"));
		discussionBox.getChildren().add(new Label("lifestyle"));
		discussionBox.getChildren().add(new Label("relationship"));
		discussionBox.getChildren().add(new Label("general"));
		discussionPane.setContent(discussionBox);
		discussionPane.setId("section-header");

		TitledPane housingPane = new TitledPane();
		housingPane.setText("housing");
		housingPane.setExpanded(false);
		VBox housingBox = new VBox();
		housingBox.getChildren().add(new Label("apartments/housing"));                 
		housingBox.getChildren().add(new Label("office/commercial"));
		housingBox.getChildren().add(new Label("parking/storage"));   
		housingBox.getChildren().add(new Label("sublease"));   
		housingBox.getChildren().add(new Label("vacation"));   
		housingPane.setContent(housingBox);
		housingPane.setId("section-header");

		TitledPane forSalePane = new TitledPane();
		forSalePane.setText("for sale");
		forSalePane.setExpanded(false);
		VBox forSaleBox = new VBox();
		forSaleBox.getChildren().add(new Label("technology"));
		forSaleBox.getChildren().add(new Label("appliances"));
		forSaleBox.getChildren().add(new Label("automotive"));
		forSaleBox.getChildren().add(new Label("outdoors"));
		forSaleBox.getChildren().add(new Label("music"));
		forSaleBox.getChildren().add(new Label("fashion"));
		forSaleBox.getChildren().add(new Label("general"));
		forSalePane.setContent(forSaleBox);
		forSalePane.setId("section-header");

		TitledPane jobsPane = new TitledPane();
		jobsPane.setText("jobs");
		jobsPane.setExpanded(false);
		VBox jobsBox = new VBox();
		jobsBox.getChildren().add(new Label("technology"));
		jobsBox.getChildren().add(new Label("business/finance"));
		jobsBox.getChildren().add(new Label("medical"));
		jobsBox.getChildren().add(new Label("education"));
		jobsBox.getChildren().add(new Label("retail"));
		jobsBox.getChildren().add(new Label("legal"));
		jobsBox.getChildren().add(new Label("volunteer"));
		jobsBox.getChildren().add(new Label("general"));
		
		jobsPane.setContent(jobsBox);
		jobsPane.setId("section-header");
		jobsBox.setId("section-header");

		HBox sectionBox = new HBox(communityPane, servicesPane, discussionPane, housingPane, forSalePane,jobsPane);

		VBox headerBox = new VBox(topHeaderBox, sectionBox);
		headerBox.setPadding(new Insets(10, 10, 10, 10));
		headerBox.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		headerBox.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		headerBox.setId("header");

		Label post1Label = new Label("1");
		post1Label.setId("post-label");
		
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
		
		ImageView pic2 = new ImageView(new Image("file:HelpWanted.png"));
		
		Label post2Label = new Label("2");
		post2Label.setId("post-label");
		
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
		
		ImageView pic3 = new ImageView(new Image("file:HelpWanted.png"));
		
		Label post3Label = new Label("3");
		post3Label.setId("post-label");
		
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
		
		ImageView pic4 = new ImageView(new Image("file:HelpWanted.png"));
		
		Label post4Label = new Label("4");
		post4Label.setId("post-label");
		
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
		
		Button next = new Button("Next Page >");
		next.setId("select-page");
		
		Label buttonSeparator = new Label("|");
		buttonSeparator.setId("post-label");
		
		Button previous = new Button("< Prev Page");
		previous.setId("select-page");
		
		HBox pageSelection = new HBox(previous, buttonSeparator, next);
		pageSelection.setSpacing(20);
		
		VBox mainBody = new VBox(post1, post2, post3, post4, pageSelection);
		mainBody.setPadding(new Insets(8));
		mainBody.setSpacing(12);
		
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
