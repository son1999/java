/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Process;
import java.sql.*;
import javax.swing.*;
import Data.*;

/**
 *
 * @author son
 */
public class ChucNang {
    public static PreparedStatement pts=null;
    public static  ResultSet rs=null;
    public static Connection conn=Connect.KetNoi();
      
      public static void Update(String ID,String Name,String BirthDate,String DiemTB, String gioitinh){
          String sql="Update Students set Name=N'"+Name+"',BirthDate=N'"+BirthDate+"',DiemTB=N'"+DiemTB+"',gioitinh=N'"+gioitinh+"' where ID=N'"+ID+"' ";
          try{
               pts=conn.prepareStatement(sql);
              pts.execute();
             JOptionPane.showMessageDialog(null,"Sửa sinh viên thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
          }catch(Exception ex){
              JOptionPane.showMessageDialog(null,"Thất bại","Thông báo",JOptionPane.WARNING_MESSAGE);
          }
         
      }
      
      public static void Delete(String ID){
             String sql="Delete from Students  where ID=N'"+ID+"' ";
              try{
               pts=conn.prepareStatement(sql);
              pts.execute();
             JOptionPane.showMessageDialog(null,"Xóa sinh viên thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
          }catch(Exception ex){
              JOptionPane.showMessageDialog(null,"Thất bại","Thông báo",JOptionPane.WARNING_MESSAGE);
          }
         
      }
}
