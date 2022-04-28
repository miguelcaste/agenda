module com.castelar.agenda {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.castelar.agenda to javafx.fxml;
    exports com.castelar.agenda;
}