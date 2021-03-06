package it.polito.tdp.ScenaProva;

import javafx.application.Application;
import static javafx.application.Application.launch;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class EntryPoint extends Application {

    @Override
    public void start(Stage stage) throws Exception {
    	
    /*	FXMLLoader loader=new FXMLLoader(getClass().getResource("Scene.fxml")); //devo fare questo
		
		BorderPane root = (BorderPane)loader.load(); //anche qui modificare
		Scene scene = new Scene(root);
		
		FXMLController controller=loader.getController();
    	*/
    	
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
