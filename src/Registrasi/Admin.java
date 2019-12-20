/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registrasi;

/**
 *
 * @author M Yusuf Ariesandy
 */
public class Admin {
    public static ManageRegistrasi []manage = new ManageRegistrasi[100];
    ManageRegistrasi reg = new ManageRegistrasi();
    public int index = 0;
    
    public void input(String id, String password){
        reg.setID(id);
        reg.setPassword(password);
        manage[index] = reg;
        index++;
    }
    
}
