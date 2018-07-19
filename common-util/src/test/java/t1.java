import common.IResource;
import common.Resource;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class t1 extends Application{


    public static void main(String[] args) {
        Application.launch(t1.class);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        IResource resource = Resource.loadImg(new File(getClass().getResource("obj.png").toURI()));

        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5,5,5,5));
        Image image = new Image("obj.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        pane.getChildren().add(imageView);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowImage");// Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
