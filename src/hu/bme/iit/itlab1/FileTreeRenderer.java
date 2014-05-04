package hu.bme.iit.itlab1;

import java.awt.Component;

import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 * A tooltipek előállításáért felelős. A BinTreeRenderer-rel szemben a
 * FileWrap-ben levő File-tól veszi át a méretet (length() metódus).
 * 
 * @author mamunga
 * 
 */
public class FileTreeRenderer extends DefaultTreeCellRenderer {

    public Component getTreeCellRendererComponent(
                        JTree tree,
                        Object value,
                        boolean sel,
                        boolean expanded,
                        boolean leaf,
                        int row,
                        boolean hasFocus) {

        super.getTreeCellRendererComponent(
                        tree, value, sel,
                        expanded, leaf, row,
                        hasFocus);
	FileTreeModel bt = (FileTreeModel)value;
	//TODO
	setToolTipText("("+12+")");
        return this;
    }
}
