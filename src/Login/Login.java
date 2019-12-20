/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import javax.swing.*;
import Registrasi.*;
import TAPenjualan.GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author M Yusuf Ariesandy
 */

public class Login extends JFrame{
    
    JTextField id = new JTextField();
    JPasswordField password = new JPasswordField();
    JButton ok = new JButton ("OK");
    Admin admin = new Admin ();
    
    public Login () {
        setTitle ("Login");
        setSize (275, 300);
        setLayout (null);
        setLocationRelativeTo (null);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        id.setBounds (10, 10, 100, 25);
        password.setBounds (10, 50, 100, 25);
        ok.setBounds (10, 90, 50, 25);
        ok.addActionListener(new ActionListener (){
            public void actionPerformed (ActionEvent e) {
                //for (int i = 0; i < admin.index; i++)
                    if (id.getText().equals (admin.manage[0].getID()) && password.getText().equals(admin.manage[0].getPassword())) {
                        JOptionPane.showMessageDialog (null, "Login Berhasil");
                        new GUI().setVisible(true);
                        
                    }else {
                        JOptionPane.showMessageDialog (null, "Login Gagal");
                    }
            }
        });
        add (id);
        add (password);
        add(ok);
        setVisible(true);
        
    }
}
