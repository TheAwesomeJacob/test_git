package Rest;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ZadanieNaOcene extends Application {
    public static void replace(char OldChar, char NewChar) {

    }
    public static String s2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox gornyVBox = new VBox(10);
        gornyVBox.setPadding(new Insets(10));
        Label przypis = new Label();
        przypis.setText("Tekst");
        gornyVBox.getChildren().add(przypis);
            TextArea obszarTekstowy = new TextArea();
        obszarTekstowy.setWrapText(true);
        gornyVBox.getChildren().add(obszarTekstowy);
        Label pierwszaLitera = new Label("Pierwsza litera");
        gornyVBox.getChildren().add(pierwszaLitera);
            TextField kolejnyObszarTekstowy = new TextField();
        kolejnyObszarTekstowy.setMinWidth(200);
        gornyVBox.getChildren().add(kolejnyObszarTekstowy);
        Label drugaLitera = new Label("Druga litera");
        gornyVBox.getChildren().add(drugaLitera);
            TextField kolejnyKolejnyObszarTekstowy = new TextField();
        kolejnyObszarTekstowy.setMinWidth(200);
        gornyVBox.getChildren().add(kolejnyKolejnyObszarTekstowy);
        Button przeksztalcButton = new Button("Start");
        HBox przyciskiHBox = new HBox(20);

        przeksztalcButton.setOnAction(new EventHandler<>(){
            @Override
            public void handle(ActionEvent event) {
                s2 = obszarTekstowy.getText().replace(kolejnyObszarTekstowy.getText().charAt(0) , kolejnyKolejnyObszarTekstowy.getText().charAt(0));
                obszarTekstowy.setText(s2);
            }

            });
        przyciskiHBox.getChildren().addAll(przeksztalcButton);
        gornyVBox.getChildren().add(przyciskiHBox);
        Scene scene = new Scene(gornyVBox, 300, 250);
        primaryStage.setTitle("Zadanie na ocene");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private String replace(String text, String text1) {
        return null;
    }

}
