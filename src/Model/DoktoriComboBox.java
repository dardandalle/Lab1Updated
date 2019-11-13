/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import EJB.Doktori;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class DoktoriComboBox extends AbstractListModel<Doktori> implements ComboBoxModel<Doktori> {

    private List<Doktori> data;
    private Doktori selectedItem;

    public DoktoriComboBox(List<Doktori> data) {
        this.data = data;
    }

    public DoktoriComboBox() {
    }

    public void add(List<Doktori> data) {
        this.data = data;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Doktori getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem=(Doktori)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

}
