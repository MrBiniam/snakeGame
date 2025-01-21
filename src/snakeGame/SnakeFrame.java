package snakeGame;

import javax.swing.*;
//import java.awt.*;
//import java.util.*;
//import java.awt.event.*;

public class SnakeFrame extends JFrame{
	
	SnakeFrame(){
		
		this.add(new SnakePanel());
		this.setTitle("Biniam Simple Snake Game Application");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
	}

}
