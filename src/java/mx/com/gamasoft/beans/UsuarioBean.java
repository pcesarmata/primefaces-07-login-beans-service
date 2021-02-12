package mx.com.gamasoft.beans;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Cesar
 */
@ManagedBean
public class UsuarioBean {
    private String usuario;
    String usuariobd = "cesar";
    private String password;
    String passwordbd = "1234";
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void validarAcceso(){
        if (usuario.isEmpty() || usuario==null) {
            System.out.println("El usuario es requerido");
        } else {
            if (usuario.equals(usuariobd)) {
                System.out.println("El usuario es correcto");
            } else {
                System.out.println("El usuario es incorrecto");
            }
        }
        
        if (password.isEmpty() || password== null) {
            System.out.println("El password es requerido");
        } else {
            if(password.equals(passwordbd)){
                System.out.println("El password es correcto");
            } else {
                System.out.println("El password es incorrecto");
            }
        }
        
        if(usuario.equals(usuariobd) && password.equals(passwordbd)){
            System.out.println("Acceso correcto");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}