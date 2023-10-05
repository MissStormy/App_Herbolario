module com.appherbolario.appherbolario {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                            
    opens com.appherbolario.appherbolario to javafx.fxml;
    exports com.appherbolario.appherbolario;
    exports com.appherbolario.appherbolario.util;
    opens com.appherbolario.appherbolario.util to javafx.fxml;
}