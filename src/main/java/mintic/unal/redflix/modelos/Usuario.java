/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.unal.redflix.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @Column(name = "usuario_alias")
    String usuId;
    
    @Column(name = "usuario_nombre")
    String usuNombre;
    
    @Column(name = "usuario_apellido")
    String usuApellido;
    
    @Column(name = "usuario_email")
    String usuEmail;
    
    @Column(name = "usuario_celular")
    String usuCelular;
    
    @Column(name = "usuario_contrasena")
    String usuContrasena;
    
    @Column(name = "usuario_fecha_nacimiento")
    String usuNacimiento;

    public String getUsuId() {
        return usuId;
    }

    public void setUsuId(String usuId) {
        this.usuId = usuId;
    }

    public String getUsuNombre() {
        return usuNombre;
    }

    public void setUsuNombre(String usuNombre) {
        this.usuNombre = usuNombre;
    }

    public String getUsuApellido() {
        return usuApellido;
    }

    public void setUsuApellido(String usuApellido) {
        this.usuApellido = usuApellido;
    }

    public String getUsuEmail() {
        return usuEmail;
    }

    public void setUsuEmail(String usuEmail) {
        this.usuEmail = usuEmail;
    }

    public String getUsuCelular() {
        return usuCelular;
    }

    public void setUsuCelular(String usuCelular) {
        this.usuCelular = usuCelular;
    }

    public String getUsuContrasena() {
        return usuContrasena;
    }

    public void setUsuContrasena(String usuContrasena) {
        this.usuContrasena = usuContrasena;
    }

    public String getUsuNacimiento() {
        return usuNacimiento;
    }

    public void setUsuNacimiento(String usuNacimiento) {
        this.usuNacimiento = usuNacimiento;
    }

   

    @Override
    public String toString() {
        return "Usuario{" + "usuario_alias=" + usuId + ", usuario_nombre=" + usuNombre + ", usuario_apellido=" + usuApellido + ", usuario_email=" + usuEmail + ", usuario_celular=" + usuCelular + ", usuario_contrasena=" + usuContrasena + ", usuario_fecha_nacimiento=" + usuNacimiento + '}';
    }
}
