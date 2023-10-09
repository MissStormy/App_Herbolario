module com.appherbolario.appherbolario {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                            
    opens com.appherbolario.appherbolario to javafx.fxml;
    exports com.appherbolario.appherbolario;


}