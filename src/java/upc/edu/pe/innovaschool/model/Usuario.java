/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upc.edu.pe.innovaschool.model;

/**
 *
 * @author PhILiPp
 */
public class Usuario {
    private int idUsuario;
    private String usuario;
    private String uPassword;

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the uPassword
     */
    public String getuPassword() {
        return uPassword;
    }

    /**
     * @param uPassword the uPassword to set
     */
    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
 
}
