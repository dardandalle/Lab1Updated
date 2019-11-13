/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import DAL.MedException;
import DAL.TerminiRepository;
import EJB.Terminet;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dardan
 */
public class TerminetTableModel extends AbstractTableModel {
     List<Terminet> list;
    TerminiRepository tr = new TerminiRepository();
    String[] cols = {"Nr.", "Emri","Mbiemri","Nr. telefonit"};
    public TerminetTableModel() {
    }
    public TerminetTableModel(List<Terminet> list) {
        this.list = list;
    }
    public void addList(List<Terminet> list) {
        this.list = list;
    }
    @Override
    public String getColumnName(int col) {
        return cols[col];
    }
    @Override
    public int getRowCount() {
        return list.size();
    }
    public void remove(int row) {
        list.remove(row);
    }
    public Terminet getTerminet(int index) {
        return list.get(index);
    }
    @Override
    public int getColumnCount() {
        return cols.length;
    }
    
    /*  public String getDateToString(Date d) {
    DateFormat da = new SimpleDateFormat("dd-MM-yyyy");
    return da.format(d);
    }*/

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Terminet t=list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return t.getTId();
            case 1:
                return t.getTKoha();
            case 2:
                return t.getTData();
            case 3:
                return t.getTDhoma();
            default:
                return null;
        }
        
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        
        return columnIndex != 0;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex)
    {
        Terminet row = list.get(rowIndex);
        if(0 == columnIndex) {
            try{
            row.setTId((Integer) aValue);
            tr.edit(row);
            }catch(MedException ex){
                
            }
        }
        else if(1 == columnIndex) {
            try{
                row.setTKoha((String) aValue);
                tr.edit(row);
            }catch(MedException ex){
                 
                 
            }
           
        }
        else if(2 == columnIndex) {
            try{
            row.setTData((String) aValue);
            tr.edit(row);
        }catch(MedException ex){
            
        }
            
        }
        else if(3 == columnIndex) {
            try{
              row.setTDhoma((String) aValue);
              tr.edit(row);
            }catch(MedException ex){
                
            }
            
        }
    }
}
