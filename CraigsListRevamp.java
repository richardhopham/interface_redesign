
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
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
		
		TextField searchField = new TextField();
		searchField.setPrefWidth(500);
		searchField.setPromptText("Search CraigsList");
		
		HBox topHeaderBox = new HBox(logoLabel, searchField);
		topHeaderBox.setSpacing(200);
		
		Label communityLabel = new Label("community");
		communityLabel.setId("section-header");
		
		Label servicesLabel = new Label("services");
		servicesLabel.setId("section-header");
		
		Label housingLabel = new Label("housing");
		housingLabel.setId("section-header");
		
		Label jobsLabel = new Label("jobs");
		jobsLabel.setId("section-header");
		
		Label forSaleLabel = new Label("for sale");
		forSaleLabel.setId("section-header");
		
		Label gigsLabel = new Label("gigs");
		gigsLabel.setId("section-header");
		
		HBox sectionBox = new HBox(communityLabel, servicesLabel, housingLabel, jobsLabel, forSaleLabel, gigsLabel);
		sectionBox.setSpacing(150);
		
		VBox headerBox = new VBox(topHeaderBox, sectionBox);
		
		headerBox.setPadding(new Insets(10));
		headerBox.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		headerBox.setBackground(new Background(new BackgroundFill(Color.gray(0.9), CornerRadii.EMPTY, Insets.EMPTY)));
		headerBox.setId("header");
		
		BorderPane site = new BorderPane();
		site.setTop(headerBox);
		
		Scene scene = new Scene(site);
		scene.getStylesheets().add("style.css");
		primaryStage.setTitle("craigslist: los angeles");
		primaryStage.setScene(scene);
		primaryStage.show();
			
		
	}

}
