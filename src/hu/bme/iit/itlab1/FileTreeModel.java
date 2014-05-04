package hu.bme.iit.itlab1;

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

public class FileTreeModel {

}
