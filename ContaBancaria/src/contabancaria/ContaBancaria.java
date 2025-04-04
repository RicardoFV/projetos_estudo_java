/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variaveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // entrada de valores 
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número da conta !");
        numero = teclado.nextInt();
        // Aqui está o segredo: limpar o "Enter" que ficou no buffer
        teclado.nextLine();
        
        if (numero == 0) {
            System.out.println("Deve informar um número válido!");
            return;
        }

        System.out.println("Digite o número da Agência !");
        agencia = teclado.nextLine();

        System.out.println("Digite o nome do cliente !");
        nomeCliente = teclado.nextLine();
        
        if(nomeCliente.isEmpty()){
            System.out.println("Digite o nome do cliente");
        }

        System.out.println("Digite o saldo !");
        saldo = teclado.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero
                + " e seu saldo "
                + saldo + " já está disponível para saque");

        /*
        do {
                
           
            // recebe o valor digitado
            System.out.println("Bem Vindo ao Conta Bancario");
            System.out.println("***********************************");
            System.out.println("Selecione uma das opções abaixo");
            System.out.println("Digite 1 para adicionar saldo !");
            System.out.println("Digite 2 para consultar saldo !");
            System.out.println("Digite 3 para realizar saque !");
            System.out.println("Digite 0 para sair !");
        } while (numero != 0);
         */
    }

}
