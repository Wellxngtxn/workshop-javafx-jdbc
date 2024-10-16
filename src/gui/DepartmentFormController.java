package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DepartmentFormController implements Initializable {

	private Department entity;
	
	@FXML
	private TextField txtid;
	
	@FXML
	private TextField txtName;

	@FXML
	private Label labelErrorName;
	
	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;
	
	public void setDepartment(Department entity) {
		this.entity = entity;
	}
	
	@FXML
	public void onBtSaveAction() {
		System.out.println("onBtSaveActionnn");
	}
	
	@FXML
	public void onBtCancelAction() {
		System.out.println("onBtCancelActionnn");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		initializableNodes();
	}
	
	private void initializableNodes() {
		Constraints.setTextFieldInteger(txtid);
		Constraints.setTextFieldMaxLength(txtName, 30);
	}
	
	public void updateFormData() {
		if(entity == null) {
			throw new IllegalStateException("Entity was null");
		}
		txtid.setText(String.valueOf(entity.getId()));
		txtName.setText(entity.getName());
	}
	
	

	
}
