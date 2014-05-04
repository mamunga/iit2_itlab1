package hu.bme.iit.itlab1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.ToolTipManager;

/**
 * A főosztály. Felépíti a grafikus felületet.
 * 
 * @author mamunga
 * 
 */
public class TreeTest implements ActionListener {

	public static void main(String[] args) {
		// setup frame
		JFrame mainFrame = new JFrame("JTree");
		mainFrame.setMinimumSize(new Dimension(180, 300));

		JTree fileTree = new JTree();
		FileTreeModel model = new FileTreeModel();
		FileTreeRenderer renderer = new FileTreeRenderer();

		fileTree.setModel(model);

		ToolTipManager.sharedInstance().registerComponent(fileTree); 
		fileTree.setCellRenderer(renderer);
		
		JScrollPane jsp = new JScrollPane(fileTree);
		mainFrame.add(jsp);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mainFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
