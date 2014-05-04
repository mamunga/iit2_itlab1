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
        
        FileWrap fw = (FileWrap)value;
        setToolTipText(getFormattedTooltip(fw.value.length()));
        return this;
    }
    
    String getFormattedTooltip(long size){
    	if(size >= 1000000)
    	{
    		return String.format("%.2f Mb", size/1000000.f);
    	}
    	
    	if(size >= 1000)
    	{
    		return String.format("%.2f Kb", size/1000.f);
    	}
    	
    	return size + " b";
    }
}
