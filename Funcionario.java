/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionarios;

/**
 *
 * @author carla
 */
public class Funcionario {
 private String nome;
 private String setor;
 private float salariobruto;
 private String data_adimissao;
 private String data_demissao="";
 public float desconto;
 public float desconto1;
 public float desconto2;
 public float desconto3;
 
public String getSituacao(){
    
    if (data_demissao.length()==0){
        
        return "Ativo";
       
        } else{ 
        
        return "Demitido"; 
    }
}
public double calcularSalarioLiquido(){
    
if (salariobruto <= 1900.00 ){ 
    
     return 0; 
     
}

 if (salariobruto >= 1900.00 && salariobruto <= 2800.00){  

      return ( desconto1 - salariobruto * 0.075)/100;

    } 
 
 if (salariobruto >= 2800.00 && salariobruto <= 3750.00){
    
    return ( desconto1 - salariobruto * 0.15)/100;
     
}

if (salariobruto >= 3750.00 && salariobruto <= 4660.00){
    
    return ( desconto2 - salariobruto * 0.225)/100;
}

if  (salariobruto > 4660.00){
    
   }
      return ( desconto3 - salariobruto * 0.275)/100;
                   }

                          }
