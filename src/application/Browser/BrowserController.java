package application.Browser;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * Version 0.1
 * @author htha9587
 * 6-5-16
 */


public class BrowserController implements Initializable 
{
	@FXML private WebView webView;
	private WebEngine engine;
	@FXML private Button button1;
	@FXML private Button button2;
	@FXML private Button button3;
	@FXML private Button button4;
	@FXML private TextField searcher;
	@FXML private Button go;
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		engine = webView.getEngine();
		engine.setJavaScriptEnabled(true);
		searcher.setText("https://github.com/htha9587");
		
	}

	
	public void button1(ActionEvent event)
	{
		engine.load("https://github.com/htha9587");
	}
	
	public void button2(ActionEvent event)
	{
		engine.executeScript("window.location = \"http://www.ibm.com/design///\";");
	}
	
	public void button3(ActionEvent event)
	{
		engine.loadContent("<html><body><h1>BrowserFX</h1><body></html>");
	}
	
	public void button4(ActionEvent event)
	{
		engine.reload();
	}
	
	public void go(ActionEvent event)
	{
		engine.load(searcher.getText());
	}
}
