
package controller;

import java.util.ArrayList;
import model.Cliente;

public class ClienteControl {
    
    public static boolean salvarCliente(String nome, String cpf, String email, String telefone){
        Cliente c = new Cliente(nome, cpf, email, telefone);
        return c.persistir();
    }
    
    public static ArrayList<String[]> getClientes(){
        ArrayList<String[]> clientes = new ArrayList<String[]>(); 
        ArrayList<Cliente> listC = clientes.getCliente();
        
        if(){
            
        }
    }
    
    
    
    
}
