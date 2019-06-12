package mainThread;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import views.LoginStage;
import views.TransferStage;
import views.TransactionStage;

public class MyApplication extends Application {

    private String accountName = "";
    private int accountBalance;

    private VBox vBox;
    private HBox titleBox;
    private GridPane gridPaneContent;
    private HBox btnBox;

    private Label lblTitle;
    private Label lblAccount;
    private Label lblBalance;
    private Label lblAccountName;
    private Label lblBalanceValue;
    private Button btnWithdraw;
    private Button btnDeposit;
    private Button btnTransfer;

    private Scene scene;
    private Stage mainStage;
    private MyApplication myApplication;
    private TransactionStage transactionStage;
    private LoginStage loginStage;
    private TransferStage transferStage;

    private static boolean isLoggedIn = false;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.myApplication = this;
        this.mainStage = primaryStage;
        initComponent();
        if (isLoggedIn) {
            this.mainStage.show();
        } else {
            this.loginStage = new LoginStage(this);
            this.loginStage.show();
        }
    }

    private void initComponent() {
        this.vBox = new VBox();

        this.titleBox = new HBox();
        this.lblTitle = new Label("Spring Hero Bank");
        this.lblTitle.setFont(Font.font(17));
        this.lblTitle.setTextFill(Color.web("pink"));
        this.titleBox.getChildren().add(lblTitle);
        this.titleBox.setAlignment(Pos.TOP_LEFT);
        this.titleBox.setSpacing(10);

        this.gridPaneContent = new GridPane();
        this.lblAccount = new Label("Account:");
        this.lblBalance = new Label("Balance:");
        this.lblAccountName = new Label(this.accountName);
        this.lblBalanceValue = new Label(String.valueOf(this.accountBalance));
        this.gridPaneContent.add(this.lblAccount, 0, 0);
        this.gridPaneContent.add(this.lblAccountName, 1, 0);
        this.gridPaneContent.add(this.lblBalance, 0, 1);
        this.gridPaneContent.add(this.lblBalanceValue, 1, 1);
        this.gridPaneContent.setAlignment(Pos.CENTER);
        this.gridPaneContent.setPadding(new Insets(10, 10, 10, 10));
        this.gridPaneContent.setVgap(10);
        this.gridPaneContent.setHgap(10);

        this.btnBox = new HBox();
        this.btnWithdraw = new Button("Withdraw");
        this.btnDeposit = new Button("Deposit");
        this.btnTransfer = new Button("Transfer");
        this.btnWithdraw.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                transactionStage = new TransactionStage(1, myApplication);
                transactionStage.showAndWait();
            }
        });
        this.btnDeposit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                transactionStage = new TransactionStage(2, myApplication);
                transactionStage.showAndWait();
            }
        });
        this.btnTransfer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                transferStage = new TransferStage(myApplication);
                transferStage.showAndWait();
            }
        });
        this.btnBox.getChildren().addAll(this.btnWithdraw, this.btnDeposit, this.btnTransfer);
        this.btnBox.setAlignment(Pos.CENTER);
        this.btnBox.setSpacing(10);

        this.vBox.getChildren().addAll(this.titleBox, this.gridPaneContent, this.btnBox);
        this.vBox.setAlignment(Pos.CENTER);
        this.vBox.setSpacing(30);
        this.vBox.setPadding(new Insets(10, 10, 10, 10));

        this.scene = new Scene(this.vBox, 300, 200);
        this.mainStage.setScene(this.scene);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public Label getLblBalanceValue() {
        return lblBalanceValue;
    }

    public Button getBtnTransfer() {
        return btnTransfer;
    }

    public void setBtnTransfer(Button btnTransfer) {
        this.btnTransfer = btnTransfer;
    }

    public MyApplication getMyApplication() {
        return myApplication;
    }

    public void setMyApplication(MyApplication myApplication) {
        this.myApplication = myApplication;
    }

    public TransferStage getTransferStage() {
        return transferStage;
    }

    public void setTransferStage(TransferStage transferStage) {
        this.transferStage = transferStage;
    }

    public void setLblBalanceValue(Label lblBalanceValue) {
        this.lblBalanceValue = lblBalanceValue;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public VBox getvBox() {
        return vBox;
    }

    public void setvBox(VBox vBox) {
        this.vBox = vBox;
    }

    public HBox getTitleBox() {
        return titleBox;
    }

    public void setTitleBox(HBox titleBox) {
        this.titleBox = titleBox;
    }

    public HBox getBtnBox() {
        return btnBox;
    }

    public void setBtnBox(HBox btnBox) {
        this.btnBox = btnBox;
    }

    public GridPane getGridPaneContent() {
        return gridPaneContent;
    }

    public void setGridPaneContent(GridPane gridPaneContent) {
        this.gridPaneContent = gridPaneContent;
    }

    public Label getLblTitle() {
        return lblTitle;
    }

    public void setLblTitle(Label lblTitle) {
        this.lblTitle = lblTitle;
    }

    public Label getLblAccount() {
        return lblAccount;
    }

    public void setLblAccount(Label lblAccount) {
        this.lblAccount = lblAccount;
    }

    public Label getLblBalance() {
        return lblBalance;
    }

    public void setLblBalance(Label lblBalance) {
        this.lblBalance = lblBalance;
    }

    public Label getLblAccountName() {
        return lblAccountName;
    }

    public void setLblAccountName(Label lblAccountName) {
        this.lblAccountName = lblAccountName;
    }

    public Button getBtnWithdraw() {
        return btnWithdraw;
    }

    public void setBtnWithdraw(Button btnWithdraw) {
        this.btnWithdraw = btnWithdraw;
    }

    public Button getBtnDeposit() {
        return btnDeposit;
    }

    public void setBtnDeposit(Button btnDeposit) {
        this.btnDeposit = btnDeposit;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Stage getMainStage() {
        return mainStage;
    }

    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;
    }

    public MyApplication getMainApplication() {
        return myApplication;
    }

    public void setMainApplication(MyApplication mainApplication) {
        this.myApplication = mainApplication;
    }

    public TransactionStage getTransactionStage() {
        return transactionStage;
    }

    public void setTransactionStage(TransactionStage transactionStage) {
        this.transactionStage = transactionStage;
    }

    public LoginStage getLoginStage() {
        return loginStage;
    }

    public void setLoginStage(LoginStage loginStage) {
        this.loginStage = loginStage;
    }

    public static boolean isIsLoggedIn() {
        return isLoggedIn;
    }

    public static void setIsLoggedIn(boolean isLoggedIn) {
        MyApplication.isLoggedIn = isLoggedIn;
    }
}
