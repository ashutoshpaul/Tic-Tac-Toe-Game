//A tic tac toe game
import javafx.application.Application;

import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.collections.*;
import javafx.scene.effect.*;

import javafx.animation.FadeTransition;
import javafx.scene.shape.Circle;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import javafx.animation.Animation;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;

public class TIC_TAC_TOE_GAME extends Application
{
	int width = 360;
	int height = 400+50+20;
	int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,p1=0,p2=0;
	int turn = 1;
	int justplayed = 1;
	int x = 0;
	Label player1 = new Label();
	Label player2 = new Label();
	Label copyright = new Label();
	Label prompt = new Label(">                     <");
	Label message = new Label("Play Game!");
	Button btn1 = new Button();
	Button btn2 = new Button();
	Button btn3 = new Button();
	Button btn4 = new Button();
	Button btn5 = new Button();
	Button btn6 = new Button();
	Button btn7 = new Button();
	Button btn8 = new Button();
	Button btn9 = new Button();
	Label leb = new Label("Tic - Tac - Toe");
	Button newgame = new Button("Play Again");
	Button reset = new Button("Reset");
	Tooltip tp = new Tooltip("Reset Score");
	Button btn1p = new Button();
	Button btn2p = new Button();
	Button btn3p = new Button();
	Button btn4p = new Button();
	Button btn5p = new Button();
	Button btn6p = new Button();
	Button btn7p = new Button();
	Button btn8p = new Button();
	Button btn9p = new Button();
	
	Button btn1w = new Button();
	Button btn2w = new Button();
	Button btn3w = new Button();
	Button btn4w = new Button();
	Button btn5w = new Button();
	Button btn6w = new Button();
	Button btn7w = new Button();
	Button btn8w = new Button();
	Button btn9w = new Button();
	
	public TIC_TAC_TOE_GAME()
	{
		reset.setDisable(true);
		prompt.setVisible(false);
		btn1p.setDisable(true); 	btn1w.setDisable(true);
		btn2p.setDisable(true); 	btn2w.setDisable(true);
		btn3p.setDisable(true); 	btn3w.setDisable(true);
		btn4p.setDisable(true); 	btn4w.setDisable(true);
		btn5p.setDisable(true); 	btn5w.setDisable(true);
		btn6p.setDisable(true); 	btn6w.setDisable(true);
		btn7p.setDisable(true); 	btn7w.setDisable(true);
		btn8p.setDisable(true); 	btn8w.setDisable(true);
		btn9p.setDisable(true); 	btn9w.setDisable(true);
		
		btn1p.setOpacity(0.0);	 	btn1w.setOpacity(0.0);
		btn2p.setOpacity(0.0); 		btn2w.setOpacity(0.0);
		btn3p.setOpacity(0.0); 		btn3w.setOpacity(0.0);
		btn4p.setOpacity(0.0); 		btn4w.setOpacity(0.0);
		btn5p.setOpacity(0.0); 		btn5w.setOpacity(0.0);
		btn6p.setOpacity(0.0);	 	btn6w.setOpacity(0.0);
		btn7p.setOpacity(0.0); 		btn7w.setOpacity(0.0);
		btn8p.setOpacity(0.0); 		btn8w.setOpacity(0.0);
		btn9p.setOpacity(0.0); 		btn9w.setOpacity(0.0);
		
		tp.setStyle("-fx-background-color: yellow;"+"-fx-text-fill: black;"+"-fx-font-size: 12px;"+"-fx-font-weight: bold;"+"-fx-font-family: 'Calibri';");
		reset.setTooltip(tp);
		
		String tictacattr = "-fx-text-fill: brown;" + "-fx-background-color: lightyellow;" +
							"-fx-font-weight: bold;" +
							"-fx-font-family: 'Berlin Sans FB Demi';" +
							"-fx-font-size: 29px;";
		
		String tictacattrw = "-fx-text-fill: green;" + "-fx-background-color: lightgreen;" +
		              		"-fx-font-weight: bold;" +
		              		"-fx-font-family: 'Berlin Sans FB Demi';" +
		              		"-fx-font-size: 29px;";
		
		String lebattr = "-fx-text-fill: white;" +
						 "-fx-font-weight: bold;" +
						 "-fx-font-family: 'Berlin Sans FB Demi';" +
						 "-fx-font-size: 35px;";
		String newgameattr = "-fx-text-fill: white;" + "-fx-background-color: red;" +
							 "-fx-font-weight: bold;" +
							 "-fx-font-family: 'Berlin Sans FB Demi';" +
							 "-fx-font-size: 15px;";
		String resetattr = "-fx-text-fill: white;" + "-fx-background-color: green;" +
				 "-fx-font-weight: bold;" +
				 "-fx-font-family: 'Berlin Sans FB Demi';" +
				 "-fx-font-size: 15px;";
		
		reset.setStyle(resetattr);
		player1.setStyle("-fx-background-color: lime;"+"-fx-text-fill: white;"+"-fx-font-weight: bold;"+"-fx-font-size: 25px;");
		player2.setStyle("-fx-background-color: lime;"+"-fx-text-fill: white;"+"-fx-font-weight: bold;"+"-fx-font-size: 25px;");
		player1.setText("  0");
		player2.setText("0");
		
		newgame.setStyle(newgameattr);
		leb.setStyle(lebattr);
		btn1.setStyle(tictacattr);
		btn2.setStyle(tictacattr);
		btn3.setStyle(tictacattr);
		btn4.setStyle(tictacattr);
		btn5.setStyle(tictacattr);
		btn6.setStyle(tictacattr);
		btn7.setStyle(tictacattr);
		btn8.setStyle(tictacattr);
		btn9.setStyle(tictacattr);
		
		btn1p.setStyle(tictacattr);
		btn2p.setStyle(tictacattr);
		btn3p.setStyle(tictacattr);
		btn4p.setStyle(tictacattr);
		btn5p.setStyle(tictacattr);
		btn6p.setStyle(tictacattr);
		btn7p.setStyle(tictacattr);
		btn8p.setStyle(tictacattr);
		btn9p.setStyle(tictacattr);
		
		btn1w.setStyle(tictacattrw);
		btn2w.setStyle(tictacattrw);
		btn3w.setStyle(tictacattrw);
		btn4w.setStyle(tictacattrw);
		btn5w.setStyle(tictacattrw);
		btn6w.setStyle(tictacattrw);
		btn7w.setStyle(tictacattrw);
		btn8w.setStyle(tictacattrw);
		btn9w.setStyle(tictacattrw);
		
		prompt.setStyle("-fx-text-fill: darkred;"+"-fx-font-weight: bold;"+"-fx-font-family: 'Bahnschrift SemiBold Condensed';"+"-fx-font-size: 20;");
		copyright.setText((char)169 + " All Rights Reserved By Ashutosh Paul.");
		copyright.setStyle("-fx-text-fill: orangered;"+"-fx-font-size: 12px;");
	}
	public void Refresh()
	{
		prompt.setVisible(false);
		btn1p.setOpacity(0.0);	 	btn1w.setOpacity(0.0);
		btn2p.setOpacity(0.0); 		btn2w.setOpacity(0.0);
		btn3p.setOpacity(0.0); 		btn3w.setOpacity(0.0);
		btn4p.setOpacity(0.0); 		btn4w.setOpacity(0.0);
		btn5p.setOpacity(0.0); 		btn5w.setOpacity(0.0);
		btn6p.setOpacity(0.0);	 	btn6w.setOpacity(0.0);
		btn7p.setOpacity(0.0); 		btn7w.setOpacity(0.0);
		btn8p.setOpacity(0.0); 		btn8w.setOpacity(0.0);
		btn9p.setOpacity(0.0); 		btn9w.setOpacity(0.0);
		
		btn1p.setDisable(true); 	btn1w.setDisable(true);
		btn2p.setDisable(true); 	btn2w.setDisable(true);
		btn3p.setDisable(true); 	btn3w.setDisable(true);
		btn4p.setDisable(true); 	btn4w.setDisable(true);
		btn5p.setDisable(true); 	btn5w.setDisable(true);
		btn6p.setDisable(true); 	btn6w.setDisable(true);
		btn7p.setDisable(true); 	btn7w.setDisable(true);
		btn8p.setDisable(true); 	btn8w.setDisable(true);
		btn9p.setDisable(true); 	btn9w.setDisable(true);
		
		newgame.setDisable(true);
		message.setText("Play Game!");
		a=0; b=0; c=0; d=0; e=0; f=0; g=0; h=0; i=0;
		x = 0;
		turn = 1;
		justplayed = 1;
		btn1.setText("");
		btn2.setText("");
		btn3.setText("");
		btn4.setText("");
		btn5.setText("");
		btn6.setText("");
		btn7.setText("");
		btn8.setText("");
		btn9.setText("");
		btn1.setDisable(false);
		btn2.setDisable(false);
		btn3.setDisable(false);
		btn4.setDisable(false);
		btn5.setDisable(false);
		btn6.setDisable(false);
		btn7.setDisable(false);
		btn8.setDisable(false);
		btn9.setDisable(false);
		
		//member function ends
	}
	public void GameWon(int abc, int w , int y , int z)
	{
		x = 1;
		prompt.setVisible(true);
		reset.setDisable(false);
		if(abc == 1)
		{
			p1 = p1 + 1;
			player1.setText("+"+p1);
		}
		else if(abc == 2)
		{
			p2 = p2 + 1;
			player2.setText("+"+p2);
		}
		if(w == 1 || y == 1 || z == 1)
		{
			if(justplayed == 1)
				btn1w.setText("X");
			else
				btn1w.setText("O");
			btn1w.setOpacity(1.0);
		}
		if(w == 2 || y == 2 || z == 2)
		{
			if(justplayed == 1)
				btn2w.setText("X");
			else
				btn2w.setText("O");
			btn2w.setOpacity(1.0);
		}
		if(w == 3 || y == 3 || z == 3)
		{
			if(justplayed == 1)
				btn3w.setText("X");
			else
				btn3w.setText("O");
			btn3w.setOpacity(1.0);
		}
		if(w == 4 || y == 4 || z == 4)
		{
			if(justplayed == 1)
				btn4w.setText("X");
			else
				btn4w.setText("O");
			btn4w.setOpacity(1.0);
		}
		if(w == 5 || y == 5 || z == 5)
		{
			if(justplayed == 1)
				btn5w.setText("X");
			else
				btn5w.setText("O");
			btn5w.setOpacity(1.0);
		}
		if(w == 6 || y == 6 || z == 6)
		{
			if(justplayed == 1)
				btn6w.setText("X");
			else
				btn6w.setText("O");
			btn6w.setOpacity(1.0);
		}
		if(w == 7 || y == 7 || z == 7)
		{
			if(justplayed == 1)
				btn7w.setText("X");
			else
				btn7w.setText("O");
			btn7w.setOpacity(1.0);
		}
		if(w == 8 || y == 8 || z == 8)
		{
			if(justplayed == 1)
				btn8w.setText("X");
			else
				btn8w.setText("O");
			btn8w.setOpacity(1.0);
		}
		if(w == 9 || y == 9 || z == 9)
		{
			if(justplayed == 1)
				btn9w.setText("X");
			else
				btn9w.setText("O");
			btn9w.setOpacity(1.0);
		}
		
		btn1.setDisable(true);
		btn2.setDisable(true);
		btn3.setDisable(true);
		btn4.setDisable(true);
		btn5.setDisable(true);
		btn6.setDisable(true);
		btn7.setDisable(true);
		btn8.setDisable(true);
		btn9.setDisable(true);
		
		newgame.setDisable(false);	
		newgame.setOnAction(e-> Refresh());
		
		//member function ends
	}
	
	public void Clicked(Button btn , int pos)
	{
		newgame.setDisable(false);
		newgame.setOnAction(e-> Refresh());
		if(turn == 1)
		{
			message.setText("Player 2 turn");
			turn = 2;
		}
		else
		{
			message.setText("Player 1 turn");
			turn = 1;
		}
		
		if(turn != 1)	//player1 clicked 
		{	
			justplayed = 1;
			btn.setText("X");
		}
		if(turn != 2)	//player2 clicked
		{	
			justplayed = 2;
			btn.setText("O");
		}
		btn.setDisable(true);
		
		//assigning a,b,c.....
		if(justplayed == 1)	//positive
		{
			if(pos == 1)
				a = 1;
			if(pos == 2)
				b = 2;
			if(pos == 3)
				c = 3;
			if(pos == 4)
				d = 4;
			if(pos == 5)
				e = 5;
			if(pos == 6)
				f = 6;
			if(pos == 7)
				g = 7;
			if(pos == 8)
				h = 8;
			if(pos == 9)
				i = 9;
		}
		else	//negative
		{
			if(pos == 1)
				a = -1;
			if(pos == 2)
				b = -2;
			if(pos == 3)
				c = -3;
			if(pos == 4)
				d = -4;
			if(pos == 5)
				e = -5;
			if(pos == 6)
				f = -6;
			if(pos == 7)
				g = -7;
			if(pos == 8)
				h = -8;
			if(pos == 9)
				i = -9;
		}
		
		//matching
		if(a == 1 && b == 2 && c == 3)
		{
			message.setText("Player 1 Won");
			GameWon(1 , 1 , 2 , 3); x=1;
		}
		else if(d == 4 && e == 5 && f == 6)
		{
			message.setText("Player 1 Won");
			GameWon(1 , 4 , 5 , 6); x=1;
		}
		else if(g == 7 && h == 8 && i == 9)
		{
			message.setText("Player 1 Won");
			GameWon(1 , 7 , 8 , 9); x=1;
		}
		else if(a == 1 && d == 4 && g == 7)
		{
			message.setText("Player 1 Won");
			GameWon(1 , 1 , 4 , 7); x=1;
		}
		else if(b == 2 && e == 5 && h == 8)
		{
			message.setText("Player 1 Won");
			GameWon(1 , 2 , 5 , 8); x=1;
		}
		else if(c == 3 && f == 6 && i == 9)
		{
			message.setText("Player 1 Won");
			GameWon(1 , 3 , 6 , 9); x=1;
		}
		else if(a == 1 && e == 5 && i == 9)
		{
			message.setText("Player 1 Won");
			GameWon(1 , 1 , 5 , 9); x=1;
		}
		else if(g == 7 && e == 5 && c == 3)		//player 1 last match
		{
			message.setText("Player 1 Won");
			GameWon(1 , 7 , 5 , 3); x=1;
		}
		else if(a == -1 && b == -2 && c == -3)
		{
			message.setText("Player 2 Won");
			GameWon(2 , 1 , 2 , 3); x=1;
		}
		else if(d == -4 && e == -5 && f == -6)
		{
			message.setText("Player 2 Won");
			GameWon(2 , 4 , 5 , 6); x=1;
		}
		else if(g == -7 && h == -8 && i == -9)
		{
			message.setText("Player 2 Won");
			GameWon(2 , 7 , 8 , 9); x=1;
		}
		else if(a == -1 && d == -4 && g == -7)
		{
			message.setText("Player 2 Won");
			GameWon(2 , 1 , 4 , 7); x=1;
		}
		else if(b == -2 && e == -5 && h == -8)
		{
			message.setText("Player 2 Won");
			GameWon(2 , 2 , 5 , 8); x=1;
		}
		else if(c == -3 && f == -6 && i == -9)
		{
			message.setText("Player 2 Won");
			GameWon(2 , 3 , 6 , 9); x=1;
		}
		else if(a == -1 && e == -5 && i == -9)
		{
			message.setText("Player 2 Won");
			GameWon(2 , 1 , 5 , 9); x=1;
		}
		else if(g == -7 && e == -5 && c == -3)		//player 2 last match
		{
			message.setText("Player 2 Won");
			GameWon(2 , 7 , 5 , 3); x=1;
		}
		if((a != 0 && b != 0 && c != 0 && d != 0 && e != 0 && f != 0 && g != 0 &&  h != 0 && i != 0 && x == 0))	//checking if game is over or not
		{
			x = 0;
			prompt.setVisible(true);
			message.setText("       Oops!");
			newgame.setDisable(false);
			newgame.setOnAction(e-> Refresh());
		}
		
		
		
		
		//member function ends
	}
	public void EraseScore()
	{
		p1 = 0;
		p2 = 0;
		player1.setText("  0");
		player2.setText("0");
		reset.setDisable(true);
		//member function ends
	}
	
	public void start(Stage s)
	{
		newgame.setDisable(true);
		reset.setDisable(true);
		reset.setOnAction(e-> EraseScore());
		
		FadeTransition fd = new FadeTransition(Duration.seconds(0.8));
    	fd.setFromValue(1.0);
    	fd.setToValue(0.0);
    	fd.setCycleCount(Animation.INDEFINITE);
    	fd.setNode(prompt);
    	fd.play();
    	prompt.setVisible(false);
		
		String ngN = "-fx-text-fill: white;" + "-fx-background-color: red;" +
			             	 "-fx-font-weight: bold;" +	
			             	 "-fx-font-family: 'Berlin Sans FB Demi';" +
			             	 "-fx-font-size: 15px;";
		String ngH = "-fx-text-fill: white;" + "-fx-background-color: darkred;" +
                 	 "-fx-font-weight: bold;" +	
            	     "-fx-font-family: 'Berlin Sans FB Demi';" +
            	     "-fx-font-size: 15px;";
		String ngP = "-fx-text-fill: grey;" + "-fx-background-color: brown;" +
            	     "-fx-font-weight: bold;" +	
            	     "-fx-font-family: 'Berlin Sans FB Demi';" +
            	     "-fx-font-size: 15px;";
		
		String rN = "-fx-text-fill: white;" + "-fx-background-color: green;" +
			        "-fx-font-weight: bold;" +
			        "-fx-font-family: 'Berlin Sans FB Demi';" +
			        "-fx-font-size: 15px;";
		String rH = "-fx-text-fill: white;" + "-fx-background-color: darkgreen;" +
	           	    "-fx-font-weight: bold;" +
	           	    "-fx-font-family: 'Berlin Sans FB Demi';" +
	           	    "-fx-font-size: 15px;";
		String rP = "-fx-text-fill: grey;" + "-fx-background-color: darkgreen;" +
	           	    "-fx-font-weight: bold;" +
	           	    "-fx-font-family: 'Berlin Sans FB Demi';" +
	           	    "-fx-font-size: 15px;";
		
		
		newgame.setOnMouseMoved(e-> newgame.setStyle(ngH));	//hover
		newgame.setOnMouseReleased(e-> newgame.setStyle(ngN));	//normal
		newgame.setOnMousePressed(e-> newgame.setStyle(ngP));	//pressed
		newgame.setOnMouseExited(e-> newgame.setStyle(ngN));	//normal
		
		reset.setOnMouseMoved(e-> reset.setStyle(rH));	//hover
		reset.setOnMouseReleased(e-> reset.setStyle(rN));	//normal
		reset.setOnMousePressed(e-> reset.setStyle(rP));	//pressed
		reset.setOnMouseExited(e-> reset.setStyle(rN));	//normal
		
		Button btn0 = new Button();
		btn0.setStyle("-fx-background-color: orange;");
		Button behind = new Button();
		behind.setStyle("-fx-background-color: blue;"+"-fx-border-color: orange;"+"-fx-border-width: 3px;");
		
		Button partition = new Button("1st Player          	                      2nd Player");
		partition.setStyle("-fx-background-color: lime;"+"-fx-text-fill: darkgreen;"+"-fx-font-weight: bold;"+"-fx-font-size: 15px;");
		Button bar = new Button();
		bar.setStyle("-fx-background-color: darkgreen;");
		
		String mattr = "-fx-text-fill: blue;" + "-fx-font-size: 14px;" + "-fx-font-weight: bold;";
		message.setStyle(mattr);
		
		
		
		AnchorPane root = new AnchorPane();
		
		//logic part below
		btn1.setOnAction(e-> Clicked(btn1 , 1));
		btn2.setOnAction(e-> Clicked(btn2 , 2));
		btn3.setOnAction(e-> Clicked(btn3 , 3));
		btn4.setOnAction(e-> Clicked(btn4 , 4));
		btn5.setOnAction(e-> Clicked(btn5 , 5));
		btn6.setOnAction(e-> Clicked(btn6 , 6));
		btn7.setOnAction(e-> Clicked(btn7 , 7));
		btn8.setOnAction(e-> Clicked(btn8 , 8));
		btn9.setOnAction(e-> Clicked(btn9 , 9));
		
		
		//logic part above
		
		//Positioning leb
		AnchorPane.setTopAnchor(leb , 30.0);
		AnchorPane.setLeftAnchor(leb , 95.0);
		//Positioning behind
		AnchorPane.setTopAnchor(behind , 20.0);
		AnchorPane.setLeftAnchor(behind , 55.0);
		AnchorPane.setRightAnchor(behind , 55.0);
		AnchorPane.setBottomAnchor(behind , 400.0);
		//Positioning partition
		AnchorPane.setTopAnchor(partition , 100.0);
		AnchorPane.setLeftAnchor(partition , 25.0);
		AnchorPane.setRightAnchor(partition , 25.0);
		AnchorPane.setBottomAnchor(partition , 340.0);
		//Positioning bar
		AnchorPane.setTopAnchor(bar , 105.0);
		AnchorPane.setLeftAnchor(bar , 190.0);
		AnchorPane.setRightAnchor(bar , 180.0);
		AnchorPane.setBottomAnchor(bar , 345.0);
		//Positioning player1
		AnchorPane.setTopAnchor(player1 , 105.0);
		AnchorPane.setLeftAnchor(player1 , 150.0);
		//Positioning player2
		AnchorPane.setTopAnchor(player2 , 105.0);
		AnchorPane.setLeftAnchor(player2 , 200.0);
		//Positioning message
		AnchorPane.setTopAnchor(message , 147.0);
		AnchorPane.setLeftAnchor(message , 144.0);		
		
		//Positioning button 0
		AnchorPane.setTopAnchor(btn0 , 180.0);
		AnchorPane.setLeftAnchor(btn0 , 85.0);
		AnchorPane.setRightAnchor(btn0 , 85.0);
		AnchorPane.setBottomAnchor(btn0 , 100.0);
		
		//Positioning button 1
		AnchorPane.setTopAnchor(btn1 , 180.0);
		AnchorPane.setLeftAnchor(btn1 , 85.0);
		AnchorPane.setRightAnchor(btn1 , 225.0);
		AnchorPane.setBottomAnchor(btn1 , 240.0);
		//Positioning button 2
		AnchorPane.setTopAnchor(btn2 , 180.0);
		AnchorPane.setLeftAnchor(btn2 , 155.0);
		AnchorPane.setRightAnchor(btn2 , 155.0);
		AnchorPane.setBottomAnchor(btn2 , 240.0);
		//Positioning button 3
		AnchorPane.setTopAnchor(btn3 , 180.0);
		AnchorPane.setLeftAnchor(btn3 , 225.0);
		AnchorPane.setRightAnchor(btn3 , 85.0);
		AnchorPane.setBottomAnchor(btn3 , 240.0);
		
		//Positioning button 4
		AnchorPane.setTopAnchor(btn4 , 250.0);
		AnchorPane.setLeftAnchor(btn4 , 85.0);
		AnchorPane.setRightAnchor(btn4 , 225.0);
		AnchorPane.setBottomAnchor(btn4 , 170.0);
		//Positioning button 5
		AnchorPane.setTopAnchor(btn5 , 250.0);
		AnchorPane.setLeftAnchor(btn5 , 155.0);
		AnchorPane.setRightAnchor(btn5 , 155.0);
		AnchorPane.setBottomAnchor(btn5 , 170.0);
		//Positioning button 6
		AnchorPane.setTopAnchor(btn6 , 250.0);
		AnchorPane.setLeftAnchor(btn6 , 225.0);
		AnchorPane.setRightAnchor(btn6 , 85.0);
		AnchorPane.setBottomAnchor(btn6 , 170.0);
		
		//Positioning button 7
		AnchorPane.setTopAnchor(btn7 , 320.0);
		AnchorPane.setLeftAnchor(btn7 , 85.0);
		AnchorPane.setRightAnchor(btn7 , 225.0);
		AnchorPane.setBottomAnchor(btn7 , 100.0);
		//Positioning button 8
		AnchorPane.setTopAnchor(btn8 , 320.0);
		AnchorPane.setLeftAnchor(btn8 , 155.0);
		AnchorPane.setRightAnchor(btn8 , 155.0);
		AnchorPane.setBottomAnchor(btn8 , 100.0);
		//Positioning button 9
		AnchorPane.setTopAnchor(btn9 , 320.0);
		AnchorPane.setLeftAnchor(btn9 , 225.0);
		AnchorPane.setRightAnchor(btn9 , 85.0);
		AnchorPane.setBottomAnchor(btn9 , 100.0);
		//Positioning newgame
		AnchorPane.setTopAnchor(newgame , 410.0);
		AnchorPane.setLeftAnchor(newgame , 225.0);
		AnchorPane.setRightAnchor(newgame , 35.0);
		AnchorPane.setBottomAnchor(newgame , 40.0);
		//Positioning reset
		AnchorPane.setTopAnchor(reset , 410.0);
		AnchorPane.setLeftAnchor(reset , 35.0);
		AnchorPane.setRightAnchor(reset , 245.0);
		AnchorPane.setBottomAnchor(reset , 40.0);
		//Positioning prompt
		AnchorPane.setTopAnchor(prompt , 410.0);
		AnchorPane.setLeftAnchor(prompt , 208.5);
		
		
		//duplicate buttons down
		
		//Positioning btn1p 1
		AnchorPane.setTopAnchor(btn1p , 180.0);
		AnchorPane.setLeftAnchor(btn1p , 85.0);
		AnchorPane.setRightAnchor(btn1p , 225.0);
		AnchorPane.setBottomAnchor(btn1p , 240.0);
		//Positioning button 2
		AnchorPane.setTopAnchor(btn2p , 180.0);
		AnchorPane.setLeftAnchor(btn2p , 155.0);
		AnchorPane.setRightAnchor(btn2p , 155.0);
		AnchorPane.setBottomAnchor(btn2p , 240.0);
		//Positioning button 3
		AnchorPane.setTopAnchor(btn3p , 180.0);
		AnchorPane.setLeftAnchor(btn3p , 225.0);
		AnchorPane.setRightAnchor(btn3p , 85.0);
		AnchorPane.setBottomAnchor(btn3p , 240.0);
		
		//Positioning button 4
		AnchorPane.setTopAnchor(btn4p , 250.0);
		AnchorPane.setLeftAnchor(btn4p , 85.0);
		AnchorPane.setRightAnchor(btn4p , 225.0);
		AnchorPane.setBottomAnchor(btn4p , 170.0);
		//Positioning button 5
		AnchorPane.setTopAnchor(btn5p , 250.0);
		AnchorPane.setLeftAnchor(btn5p , 155.0);
		AnchorPane.setRightAnchor(btn5p , 155.0);
		AnchorPane.setBottomAnchor(btn5p , 170.0);
		//Positioning button 6
		AnchorPane.setTopAnchor(btn6p , 250.0);
		AnchorPane.setLeftAnchor(btn6p , 225.0);
		AnchorPane.setRightAnchor(btn6p , 85.0);
		AnchorPane.setBottomAnchor(btn6p , 170.0);
		
		//Positioning button 7
		AnchorPane.setTopAnchor(btn7p , 320.0);
		AnchorPane.setLeftAnchor(btn7p , 85.0);
		AnchorPane.setRightAnchor(btn7p , 225.0);
		AnchorPane.setBottomAnchor(btn7p , 100.0);
		//Positioning button 8
		AnchorPane.setTopAnchor(btn8p , 320.0);
		AnchorPane.setLeftAnchor(btn8p , 155.0);
		AnchorPane.setRightAnchor(btn8p , 155.0);
		AnchorPane.setBottomAnchor(btn8p , 100.0);
		//Positioning button 9
		AnchorPane.setTopAnchor(btn9p , 320.0);
		AnchorPane.setLeftAnchor(btn9p , 225.0);
		AnchorPane.setRightAnchor(btn9p , 85.0);
		AnchorPane.setBottomAnchor(btn9p , 100.0);
		
		//Positioning btn1w 1
		AnchorPane.setTopAnchor(btn1w , 180.0);
		AnchorPane.setLeftAnchor(btn1w , 85.0);
		AnchorPane.setRightAnchor(btn1w , 225.0);
		AnchorPane.setBottomAnchor(btn1w , 240.0);
		//Positioning button 2w
		AnchorPane.setTopAnchor(btn2w , 180.0);
		AnchorPane.setLeftAnchor(btn2w , 155.0);
		AnchorPane.setRightAnchor(btn2w , 155.0);
		AnchorPane.setBottomAnchor(btn2w , 240.0);
		//Positioning button 3w
		AnchorPane.setTopAnchor(btn3w , 180.0);
		AnchorPane.setLeftAnchor(btn3w , 225.0);
		AnchorPane.setRightAnchor(btn3w , 85.0);
		AnchorPane.setBottomAnchor(btn3w , 240.0);
		
		//Positioning button 4w
		AnchorPane.setTopAnchor(btn4w , 250.0);
		AnchorPane.setLeftAnchor(btn4w , 85.0);
		AnchorPane.setRightAnchor(btn4w , 225.0);
		AnchorPane.setBottomAnchor(btn4w , 170.0);
		//Positioning button 5w
		AnchorPane.setTopAnchor(btn5w , 250.0);
		AnchorPane.setLeftAnchor(btn5w , 155.0);
		AnchorPane.setRightAnchor(btn5w , 155.0);
		AnchorPane.setBottomAnchor(btn5w , 170.0);
		//Positioning button 6w
		AnchorPane.setTopAnchor(btn6w , 250.0);
		AnchorPane.setLeftAnchor(btn6w , 225.0);
		AnchorPane.setRightAnchor(btn6w , 85.0);
		AnchorPane.setBottomAnchor(btn6w , 170.0);
		
		//Positioning button 7w
		AnchorPane.setTopAnchor(btn7w , 320.0);
		AnchorPane.setLeftAnchor(btn7w , 85.0);
		AnchorPane.setRightAnchor(btn7w , 225.0);
		AnchorPane.setBottomAnchor(btn7w , 100.0);
		//Positioning button 8w
		AnchorPane.setTopAnchor(btn8w , 320.0);
		AnchorPane.setLeftAnchor(btn8w , 155.0);
		AnchorPane.setRightAnchor(btn8w , 155.0);
		AnchorPane.setBottomAnchor(btn8w , 100.0);
		//Positioning button 9w
		AnchorPane.setTopAnchor(btn9w , 320.0);
		AnchorPane.setLeftAnchor(btn9w , 225.0);
		AnchorPane.setRightAnchor(btn9w , 85.0);
		AnchorPane.setBottomAnchor(btn9w , 100.0);
		
		//Positioning button copyright
		AnchorPane.setLeftAnchor(copyright , 7.0);
		AnchorPane.setBottomAnchor(copyright , 5.0);
		
		root.getChildren().addAll(behind , leb , partition , bar ,player1 , player2 , message , btn0 , btn1 , btn2 , btn3 , btn4 , btn5 , btn6 , btn7 , btn8 , btn9 , prompt , reset , newgame , copyright);
		root.getChildren().addAll(btn1p , btn2p , btn3p , btn4p , btn5p , btn6p , btn7p , btn8p , btn9p);
		root.getChildren().addAll(btn1w , btn2w , btn3w , btn4w , btn5w , btn6w , btn7w , btn8w , btn9w);
		Scene scene = new Scene(root , width , height);
		root.setStyle("-fx-background-color: lightyellow;");
		s.setTitle("Tic-Tac-Toe Game");
		s.setResizable(false);
		s.setScene(scene);
		s.show();
		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}