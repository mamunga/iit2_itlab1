package hu.bme.iit.itlab1;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.event.TreeModelListener;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 * A JTree modellje, a TreeModel interfészt valósítja meg. Képesnek kell lennie
 * arra, hogy a fájlrendszer gyökérobjektumát megváltoztathassuk (setRoot
 * metódus). A BinTreeModellel szemben nem BinTree-n operál, hanem FileWrap-be
 * csomagolt File osztályon (az Object paraméterek FileWrap-pé kasztolandók!).
 * Figyeljünk arra, hogy a File osztály listFiles() metódusa nem rendezi a
 * tartalmat, a visszatérési értéken érdemes lefuttatni az Arrays osztály sort()
 * metódusát!
 * 
 * A JTree.setModel metódusának csak egyszer szabad átadni, minden későbbi
 * módosítást a modellben kell lekezelni.
 * 
 * @author mamunga
 */

public class FileTreeModel implements TreeModel {

	private FileWrap root;
	ArrayList<TreeModelListener> listeners;

	public FileTreeModel() {
		listeners = new ArrayList<TreeModelListener>();
		root = new FileWrap(
				(FileSystemView.getFileSystemView()).getRoots()[0].getAbsolutePath());
	}

	@Override
	public Object getRoot() {
		return root;
	}

	@Override
	public Object getChild(Object parent, int index) {
		FileWrap nodeParent = (FileWrap) parent;

		if (nodeParent != null) {
			File[] list = nodeParent.value.listFiles();
			FileWrap child = new FileWrap("");
			Arrays.sort(list);
			ArrayList<File> childList = new ArrayList<>(Arrays.asList(list));
			child.value = childList.get(index);
			return child;
		}
		return null;
	}

	@Override
	public int getChildCount(Object parent) {
		FileWrap treeModel = (FileWrap) parent;
		if (treeModel != null && treeModel.value.isDirectory()) {
			return treeModel.value.list().length;
		} else {
			return 0;
		}
	}

	@Override
	public boolean isLeaf(Object node) {
		FileWrap treeNode = (FileWrap) node;
		if (treeNode != null && treeNode.value.list() != null && treeNode.value.list().length > 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void valueForPathChanged(TreePath path, Object newValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getIndexOfChild(Object parent, Object child) {
		FileWrap nodeParent = (FileWrap) parent;
		FileWrap nodeChild = (FileWrap) child;

		if (nodeParent != null) {
			String[] list = nodeParent.value.list();
			Arrays.sort(list);
			ArrayList<String> childList = new ArrayList<>(Arrays.asList(list));
			return childList.indexOf(nodeChild);
		}
		return 0;
	}

	@Override
	public void addTreeModelListener(TreeModelListener l) {
		listeners.add(l);
	}

	@Override
	public void removeTreeModelListener(TreeModelListener l) {
		listeners.remove(l);
	}

	public void insert(double d) {
		// TODO Auto-generated method stub

	}

}
