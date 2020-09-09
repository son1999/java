/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Data;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author son
 */
public class Connect {
    public static Connection KetNoi(){
        try{
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","");
            return conn;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Kết nối thất bại","Thông báo",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
