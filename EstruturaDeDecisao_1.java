/* Escreva um programa (com variáveis booleanas) que avalie se o usuário pode receber empréstimos.
=> REGRAS:
   1- Histórico de Adimplência e Renda Comprovada;
   2- Cliente VIP;
   3- O empréstimo será negado sempre que houver restrição de crédito no nome do cliente;
=> PASSOS: 
   a) Criar variáveis;
   b) Avaliar critérios;
   c) Imprimir respostas;
*/
package com.mycompany.aula4_2;

public class EstruturaDeDecisao_1 {
    public static void main(String[] args) {
       
        boolean renda=true;
        boolean adimplencia=true;
        boolean vip=true;
        boolean restricao=false;
        
        String resultado=comprovacao(renda, adimplencia, vip, restricao);
        System.out.println("O empréstimo deve ser concedido ao cliente? "+resultado);

    }
    static String comprovacao(boolean renda, boolean adimplencia, boolean vip, boolean restricao){
        
        String resultado = "";
        if (((renda&&adimplencia) || vip)&&!restricao){
            resultado="Conceda o empréstimo!";
        }else{
            resultado="Não concenda o empréstimo.";
        }
          
        return resultado;
    }
    
}
