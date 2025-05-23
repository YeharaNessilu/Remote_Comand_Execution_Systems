module com.bhanuka.chatapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.yehara.chatapplication.client to javafx.fxml;
    opens com.yehara.chatapplication.server to javafx.fxml;
    exports com.yehara.chatapplication;
}