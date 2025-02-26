package com.example.Calculator;


	import javafx.application.Application;
	import javafx.fxml.FXMLLoader;
	import javafx.scene.Scene;
	import javafx.scene.layout.StackPane;
	import javafx.stage.Stage;

	public class Main extends Application {

	    @Override
	    public void start(Stage primaryStage) throws Exception {
	       
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Main.fxml"));
	        StackPane root = loader.load();

	        
	        Scene scene = new Scene(root);

	       
	        primaryStage.setTitle("JavaFX Application");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}

