/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Process;
import Data.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author son
 */
public class Uptable {
    public static PreparedStatement pts=null;
    public static  ResultSet rs=null;
    public static Connection conn=Connect.KetNoi();

    public static void LoadData(String sql,JTable tb){
        try{
            DefaultTableModel table=(DefaultTableModel) tb.getModel();
            table.setRowCount(0);
            Statement stm;
             stm=conn.createStatement();
             rs = stm.executeQuery(sql);            
            String row[]=new String[6];
            while(rs.next()){
                row[0]=rs.getString("ID");
                  row[1]=rs.getString("Name");
                    row[2]=rs.getString("BirthDate");
                    row[3]=rs.getString("gioitinh");
                    row[4]=rs.getString("DiemTB");
                    row[5]=rs.getString("Khoa");
                    table.addRow(row);
            }
           
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public static ResultSet  ShowText(String sql){
        try{
            pts=conn.prepareStatement(sql);
            return pts.executeQuery();
          
        }catch(Exception ex){
           
             JOptionPane.showMessageDialog(null, ex);
              return null;
        }
    }
}
