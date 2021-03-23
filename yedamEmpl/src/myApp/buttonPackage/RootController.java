package myApp.buttonPackage;

import java.awt.Desktop.Action;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable{

	@FXML private CheckBox chk1, chk2;
	@FXML private ImageView checkImageView, radioImageView;
	@FXML private ToggleGroup group;
	@FXML private Button btnExit;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				
				System.out.println(newValue.getUserData());
				Image image = new Image(getClass().getResource("../../images/" + newValue.getUserData().toString()
						+ ".png").toString());
				radioImageView.setImage(image);
				
			}
		
		
		});
		
	}
	
	public void handleChkAction(ActionEvent e) {
		
		if(chk1.isSelected() && chk2.isSelected()) {
			checkImageView.setImage(new Image(
					getClass().getResource("../../images/geek-glasses-hair.gif").toString()));
		}else if(chk1.isSelected()) {
			checkImageView.setImage(new Image(
					getClass().getResource("../../images/geek-glasses.gif").toString()));
		}else if(chk2.isSelected()) {
			checkImageView.setImage(new Image(
					getClass().getResource("../../images/geek-hair.gif").toString()));
		}else {
			checkImageView.setImage(new Image(
					getClass().getResource("../../images/geek.gif").toString()));
		}
		
	}
	
	public void handleBtnExitAction(ActionEvent e) {
		Platform.exit();
	}
	

}
