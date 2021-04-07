package Rest;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class PaneleIKontrolki1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        //odstepy między elementami = 10
        VBox pionowyVBox = new VBox(10);
        // odstęp pomiędzy krawędziami a elementami = 10
        pionowyVBox.setPadding(new Insets(10));

        // Etykieta
        Label napis = new Label();
        napis.setText("Sekwencja");

        // Dodajemy etykietę do panela VBox
        pionowyVBox.getChildren().add(napis);

        // Tworzymy kontrolkę TextArea (Obszar tekstowy)
        TextArea obszarTekstowy = new TextArea();
        // Ustawiamy możliwość zawijania tekstu
        obszarTekstowy.setWrapText(true);
        // Dodajemy kontrolkę
        pionowyVBox.getChildren().add(obszarTekstowy);




        Label kopiujLabel = new Label("Kopia: ");
        pionowyVBox.getChildren().add(kopiujLabel);

        // Tworzymy kontrolkę TextArea (Obszar tekstowy)
        TextArea obszarTekstowyKopia = new TextArea();
        // Ustawiamy możliwość zawijania tekstu
        obszarTekstowyKopia.setWrapText(true);
        obszarTekstowyKopia.setMinWidth(200);
        pionowyVBox.getChildren().add(obszarTekstowyKopia);


        Button kopiujButton = new Button("Sprawdzanko libczy litery A");
        // Ustawiamy akcję
        kopiujButton.setOnAction(new EventHandler<>(){
            @Override
            public void handle(ActionEvent event) {
                int count = 0;
                for (int i = 0; i < obszarTekstowy.getText().length(); i++) {
                    if (obszarTekstowy.getText().charAt(i) == 'a' || obszarTekstowy.getText().charAt(i) == 'A') {
                        count++;
                    }
                }
                obszarTekstowyKopia.setText("Litera A wystepuje w tekscie " + count + " razy!");
            }
        });

        // Teraz przycisk "Zakończ"
        Button zakonczButton = new Button("Zakończ");
        // Akcja dla przycisku "Zakończ"
        zakonczButton.setOnAction(new EventHandler<>() {

            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });

        // Tworzymy HBox, odstęp między elementami = 10
        HBox przyciskiHBox = new HBox(10);
        //dodaj przyciski do panela HBox
        przyciskiHBox.getChildren().add(kopiujButton);
        przyciskiHBox.getChildren().add(zakonczButton);

        // Element możemy również dodawać za pomocą metody addAll
        //        przyciskiHBox.getChildren().addAll(kopiujButton,  zakonczButton);


        // Dodajemy panel przyciskiHBox do panela pionowyVBox
        pionowyVBox.getChildren().add(przyciskiHBox);

        // Tworzymy Scene
        Scene scene = new Scene(pionowyVBox, 300, 250);
        // Tutuł okna
        primaryStage.setTitle("Szukanie sekwencji");
        // Ustawianie sceny
        primaryStage.setScene(scene);
        // Pokaż
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}


