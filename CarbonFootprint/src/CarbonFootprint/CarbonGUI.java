//Amtul Maryam
//Graphic User Interface

package CarbonFootprint;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;

public class CarbonGUI {

	public static void main(String[] args) {
		private JFrame f;
		
		//Type in name of CarbonFootprint
		String cName, allString;
		cName = JOptionPane.showInputDialog( "Name of CarbonFootprint:" );
		allString = "";
		allString = "This is the " + cName + "\n";
		allString = allString + "CarbonFootprint emissions is complete" + "\n";
		
		//Message
		JOptionPane.showMessageDialog(null, allString, "Display Message",
		JOptionPane.INFORMATION_MESSAGE );
		
		JFrame f = new CarbonFootprint();
		 f.setVisible(true);
		 
		 public CarbonFootprint() {
			 setTitle("CarbonFootprint");
			 Container pane = getContentPane();
			 pane.setLayout(new CarbonFootprint());
			 setBounds(30,30,10,30);
			 pane.add(b1); pane.add(b2); pane.add(b3);
			 }
		 //Type of Button
		 JButton b1=new JButton("Bicycle")
				 b2=new JButton("Car");
				 b3=new JButton("Building");
		}
}


