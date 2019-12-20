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
public class ManageRegistrasi {
    private String nama;
    private String ttl;
    private String alamat;
    public String id;
    public String password;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setTTL(String ttl){
        this.ttl = ttl;
    }
    
    public String getTTL(){
        return ttl;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public String getID(){
        return id;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
}
