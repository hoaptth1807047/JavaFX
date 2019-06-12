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
import model.AccountModel;

public class TransferStage extends Stage {

    private static final int TRANSFER_STAGE_WIDTH = 320;
    private static final int TRANSFER_STAGE_HEIGHT = 250;
    private VBox vBox;
    private HBox hBox;
    private GridPane gridPane;
    private HBox btnBox;

    private Label lblTitle;
    private Label lblReceiveID;
    private Label lblAmount;
    private Label lblReceiver;
    private Label lblAddress;
    private TextField txtReceiveID;
    private TextField txtAmountValue;
    private Label lblReceiverName;
    private Label lblAddressValue;
    private Button btnReceive;
    private Button btnCancel;

    private Scene scene;
    private Stage stage;
    private MyApplication myApplication;
    private AccountModel model;

    public TransferStage(MyApplication myApplication) {
        this.model = new AccountModel();
        this.myApplication = myApplication;
        this.initComponent();
        this.scene = new Scene(this.vBox, TRANSFER_STAGE_WIDTH, TRANSFER_STAGE_HEIGHT);
        this.stage = this;
        this.stage.setScene(this.scene);
    }

    public TransferStage() {

    }

    public void initComponent() {
        this.initModality(Modality.APPLICATION_MODAL);

        this.hBox = new HBox();
        this.lblTitle = new Label("Transfer");
        this.hBox.setAlignment(Pos.TOP_LEFT);
        this.hBox.setSpacing(10);
        this.hBox.getChildren().add(this.lblTitle);

        this.gridPane = new GridPane();
        this.gridPane.setAlignment(Pos.CENTER);
        this.gridPane.setPadding(new Insets(10));
        this.gridPane.setVgap(10);
        this.gridPane.setHgap(10);
        this.lblReceiveID = new Label("ReceiveID");
        this.txtReceiveID = new TextField();
        this.lblAmount = new Label("Amount");
        this.txtAmountValue = new TextField();
        this.lblReceiver = new Label("Receiver");
        this.lblReceiverName = new Label();
        this.lblAddress = new Label("Address: ");
        this.lblAddressValue = new Label();
        this.btnReceive = new Button("Receive");
        this.btnCancel = new Button("Cancel");

        this.btnReceive.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        this.btnCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
            }
        });

        this.btnBox = new HBox();
        this.btnBox.setPadding(new Insets(10));
        this.btnBox.setSpacing(10);
        this.btnBox.setAlignment(Pos.TOP_LEFT);
        this.btnBox.getChildren().addAll(this.btnReceive, this.btnCancel);
        this.gridPane.add(this.lblReceiveID, 0, 0);
        this.gridPane.add(this.txtReceiveID, 1, 0);
        this.gridPane.add(this.lblAmount, 0, 1);
        this.gridPane.add(this.txtAmountValue, 1, 1);
        this.gridPane.add(this.lblReceiver, 0, 2);
        this.gridPane.add(this.lblReceiverName, 1, 2);
        this.gridPane.add(this.lblAddress, 0, 3);
        this.gridPane.add(this.lblAddressValue, 1, 3);
        this.gridPane.add(this.btnBox, 1, 4);

        this.vBox = new VBox();
        this.vBox.setPadding(new Insets(10));
        this.vBox.setSpacing(10);
        this.vBox.setAlignment(Pos.CENTER);
        this.vBox.getChildren().addAll(this.hBox, this.gridPane);
    }
}
