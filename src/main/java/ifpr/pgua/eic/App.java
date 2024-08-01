package ifpr.pgua.eic;

import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();

        Text enunciado = new Text ("Pergunta 1 \nQual a Capital do Paraná?");
        root.getChildren().add(enunciado);

        Button alternativa1 = new Button("Curitiba ");
        root.getChildren().add(alternativa1);

        alternativa1.setOnAction(this::respondeQuestao);
        //root.setStyle("-fx-background-color: green");
       
        Button alternativa2 = new Button("Londrina");
        root.getChildren().add(alternativa2);

        alternativa2.setOnAction(this::respondeQuestao);

        Button alternativa3 = new Button("Paranaguá");
        root.getChildren().add(alternativa3);

        alternativa3.setOnAction(this::respondeQuestao);

        Button alternativa4 = new Button("Matinhos");
        root.getChildren().add(alternativa4);
        
        alternativa4.setOnAction(this::respondeQuestao);
        
        Text enunciado2 = new Text ("Acertou!");
        root.getChildren().add(enunciado2);

        Button proxima = new Button("Próxima");
        root.getChildren().add(proxima);

        Scene scene = new Scene(root,600,800);
        stage.setScene(scene);
        stage.show();
    }
    public void respondeQuestao(Event event){
        System.out.println("clicou!");
    }

    public static void main(String[] args) {
        launch();
    }

}