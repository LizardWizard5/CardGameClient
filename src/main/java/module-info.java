module ca.lizardwizard.unoclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.lizardwizard.CardGame to javafx.fxml;
    exports ca.lizardwizard.CardGame;
}