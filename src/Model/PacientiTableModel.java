package Model;
import DAL.MedException;
import DAL.PacientiRepository;
import EJB.Pacienti;
import java.util.List;
import javax.swing.table.AbstractTableModel;



public class PacientiTableModel extends AbstractTableModel {
    List<Pacienti> list;
    PacientiRepository pr = new PacientiRepository();
    String[] cols = {"Nr.", "Emri","Mbiemri","Nr. telefonit"};
    public PacientiTableModel() {
    }
    public PacientiTableModel(List<Pacienti> list) {
        this.list = list;
    }
    public void addList(List<Pacienti> list) {
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
    public Pacienti getPacienti(int index) {
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
        Pacienti p=list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getPId();
            case 1:
                return p.getPName();
            case 2:
                return p.getPLast();
            case 3:
                return p.getPNumber().toString();
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
        Pacienti row = list.get(rowIndex);
        if(0 == columnIndex) {
            try{
            row.setPId((Integer) aValue);
            pr.edit(row);
            }catch(MedException ex){
                
            }
        }
        else if(1 == columnIndex) {
            try{
                row.setPName((String) aValue);
                pr.edit(row);
            }catch(MedException ex){
                 
                 
            }
           
        }
        else if(2 == columnIndex) {
            try{
            row.setPLast((String) aValue);
            pr.edit(row);
        }catch(MedException ex){
            
        }
            
        }
        else if(3 == columnIndex) {
            try{
              row.setPNumber((Integer) aValue);
              pr.edit(row);
            }catch(MedException ex){
                
            }
            
        }
    }
 
    
    
}
