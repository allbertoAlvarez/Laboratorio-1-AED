
package graphicsInterface;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import model.Test;

public class MainWindow extends JFrame {

	private Test test;
	private PanelButtons panelButtons;

	public MainWindow() {
		this.setVisible(true);
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
	}

	public static void main(String[] args) {
		MainWindow v = new MainWindow();

	}

}
