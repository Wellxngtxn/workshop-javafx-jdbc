module JavaFX1 {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	
	opens gui to javafx.fxml;
	opens model.entities to javafx.base;
	
	requires java.sql;
	
}