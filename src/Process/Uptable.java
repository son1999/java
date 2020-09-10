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
            String row[]=new String[5];
            while(rs.next()){
                row[0]=rs.getString(1);
                  row[1]=rs.getString(2);
                    row[2]=rs.getString(3);
                    row[3]=rs.getString(4);
                    row[4]=rs.getString(5);
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
