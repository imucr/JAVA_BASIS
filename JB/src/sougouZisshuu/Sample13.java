package sougouZisshuu;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
SUM ラジオボタンクリックすると異なる文字列表示
	①フィールド
	②実行
	③JFrame > ContentPane > JPanel > JRadioButton
	④SelectItemListenerクラス構造： itemが選択されたかを示すイベントを受け取って、条件ごとに結果を出す。
*/
public class Sample13 {
	
	private static final String window_title = "ラジオボタンクリックするとテキストフィールド表示";
	private static final int window_width = 640;
	private static final int window_height = 400;
	private static final String rb1_title = "abc";
	private static final String rb2_title = "xyz";
	private static final String data1 = "あああああ";
	private static final String data2 = "ははははは";
	private static final int tf_size = 20;
	JTextField tf = new JTextField(Sample13.data1, Sample13.tf_size); //QUESTION クラス名を前に付ける理由？
	
	public static void main(String[] args) {
		final Sample13 sample = new Sample13(); //MEMO これ書かないと実行X。
	}

	public Sample13() {
		final JFrame f = new JFrame(Sample13.window_title);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JRadioButton rb1 = new JRadioButton(Sample13.rb1_title, true);
		final JRadioButton rb2 = new JRadioButton(Sample13.rb2_title);
		
		final ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		rb1.addItemListener(new SelectItemListener()); //QUESTION JRadioButtonクラスには当該メソッドない。どこから？
		rb2.addItemListener(new SelectItemListener());
		
		final JPanel p = new JPanel();
		p.add(rb1);
		p.add(rb2);
		f.getContentPane().add(p, BorderLayout.NORTH);
		
		final JPanel p2 = new JPanel();
		p2.add(this.tf);
		f.getContentPane().add(p2, BorderLayout.CENTER);

		f.setSize(Sample13.window_width, Sample13.window_height);
		f.setVisible(true);
		
	}
	
	class SelectItemListener implements ItemListener { //MEMO Inner Class

		@Override
		public void itemStateChanged(final ItemEvent e) {
			final AbstractButton sel = (AbstractButton) e.getItemSelectable();
			
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (sel.getText().equals(Sample13.rb1_title)) {
					Sample13.this.tf.setText(Sample13.data1); //QUESTION「this = Sample13」なら、重複？
				}else if (sel.getText().equals(Sample13.rb2_title)) {
					Sample13.this.tf.setText(Sample13.data2);
				}
			}
		}
		
	}
}
