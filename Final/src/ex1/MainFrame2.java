package ex1;


import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MainFrame2 extends JFrame{

	JPanel contentPane;
	JLabel imageLabel = new JLabel();
	JLabel headerLabel = new JLabel();
	
	
	public MainFrame2() {
		
		try {
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			contentPane = (JPanel)getContentPane();
			contentPane.setLayout(new BorderLayout());
			setSize(new Dimension(400,300));
			setTitle("카즈야 나락 쓸기 !!! ");
			
			ImageIcon ii = new ImageIcon(this.getClass().getResource("나락쓸기.gif"));
			imageLabel.setIcon(ii);
			contentPane.add(imageLabel,java.awt.BorderLayout.CENTER);
			
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			//윈도우 종료시 프로세스 종료 
		}catch (Exception exception){
			exception.printStackTrace();
			//에러출
		}
	}
}
