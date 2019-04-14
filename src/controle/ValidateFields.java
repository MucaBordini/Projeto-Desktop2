/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class ValidateFields {
   
    
    public boolean emptyFields(String nome, String sobrenomeDes, String emailProd, String senhaData, String csenhaGenero){
        if(nome.isEmpty() || sobrenomeDes.isEmpty() || emailProd.isEmpty() || senhaData.isEmpty() || csenhaGenero.isEmpty()){
            JOptionPane.showMessageDialog(null, "<html> Preencher todos os campos com <b>*</b></html>\n");
            return false;
        }
        
        return true;
    }
}
