package java8.ch15GUIProgramming;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//Swing：AWTの拡張版。OSごとに表示・動作が異なることはない。
	public class SwingButton10 {
	
	  public static void main(String[] args) {
		  JFrame frame = new JFrame("コンポーネント表示");
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setBounds(300, 200, 350, 250);
		  frame.add(new JButton("左のボタン"), BorderLayout.WEST);
		  frame.setSize(350, 200);
		  frame.setVisible(true);
	  }
	}
