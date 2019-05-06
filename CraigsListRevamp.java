
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

public class CraigsListRevamp extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		primaryStage.setFullScreen(true);
		
		Label logoLabel = new Label("CraigsList");
		logoLabel.setId("logo-header");
		
		ComboBox<String> locationComboBox = new ComboBox<>();
		locationComboBox.setPromptText("Location");
		locationComboBox.getItems().addAll("Los Angeles", "San Luis Obsipo", "Santa Barbara", "Inland Empire");
		
		
		TextField searchField = new TextField();
		searchField.setPrefWidth(500);
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
		sectionBox.setSpacing(150);

		VBox headerBox = new VBox(topHeaderBox, sectionBox);		
		headerBox.setPadding(new Insets(10,10,10,10));
		headerBox.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		headerBox.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		headerBox.setId("header");
		
		BorderPane site = new BorderPane();
		site.setTop(headerBox);
		
		Scene scene = new Scene(site);
		scene.getStylesheets().add("style.css");
		primaryStage.setTitle("craigslist");
		primaryStage.setScene(scene);
		primaryStage.show();
			
		
	}

}
