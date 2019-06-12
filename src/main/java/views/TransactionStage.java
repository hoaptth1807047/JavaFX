package views;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import mainThread.MyApplication;

public class TransactionStage extends Stage {

    private int action;
    private Label lblAction;
    private HBox btnBox;

    private VBox vBox;
    private HBox hBox;
    private GridPane gridPane;
    private Label lblAmount;
    private TextField txtAmount;
    private Button btnSubmit;
    private Button btnCancel;

    private Scene scene;
    private Stage stage;
    private MyApplication myApplication;

    public TransactionStage(){

    }

    public TransactionStage(int action, MyApplication myApplication){
        this.action = action;
        this.stage = this;
        this.myApplication = myApplication;
        this.initComponent();
        this.scene = new Scene(this.vBox, 300, 200);
        this.setScene(this.scene);
        this.initModality(Modality.APPLICATION_MODAL);
    }

    private void initComponent() {
        if (this.action == 1){
            this.lblAction = new Label("WithDraw");
        } else {
            this.lblAction = new Label("Deposit");
        }

        this.hBox = new HBox();
        this.hBox.getChildren().add(lblAction);
        this.hBox.setAlignment(Pos.TOP_LEFT);
        this.hBox.setSpacing(10);

        this.gridPane = new GridPane();
        this.gridPane.setAlignment(Pos.CENTER);
        this.gridPane.setPadding(new Insets(10));
        this.gridPane.setHgap(10);
        this.gridPane.setVgap(10);
        this.lblAmount = new Label("Amount: ");
        this.txtAmount = new TextField();
        this.btnSubmit = new Button("Submit");
        this.btnCancel = new Button("Cancel");

        this.btnSubmit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int amount = 0;
                try {
                    amount = Integer.parseInt(txtAmount.getText());
                } catch (NumberFormatException ex){
                    ex.printStackTrace();
                }
                int currentBalance = action == 1 ? myApplication.getAccountBalance() - amount : myApplication.getAccountBalance() + amount;
                myApplication.getLblBalanceValue().setText(String.valueOf(currentBalance));
                myApplication.setAccountBalance(currentBalance);
                stage.close();
            }
        });
        this.btnCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
            }
        });

        this.gridPane.add(this.lblAmount, 0, 0);
        this.gridPane.add(this.txtAmount, 1, 0);

        this.btnBox = new HBox();
        this.btnBox.setPadding(new Insets(10));
        this.btnBox.setSpacing(10);
        this.btnBox.getChildren().addAll(this.btnSubmit, this.btnCancel);
        this.gridPane.add(this.btnBox, 1, 1);

        this.vBox = new VBox();
        this.vBox.setAlignment(Pos.CENTER);
        this.vBox.setSpacing(10);
        this.vBox.setPadding(new Insets(10));
        this.vBox.getChildren().addAll(this.hBox, this.gridPane);

    }
}
