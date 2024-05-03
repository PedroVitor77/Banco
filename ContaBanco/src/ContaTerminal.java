
/*
 * @author Pedro Vitor
 * @version 0.1
 */

 import java.util.Scanner;

 public class ContaTerminal {
     public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
 
         System.out.print("Por Favor Digite o numero da Conta: ");
         int numero = sc.nextInt();
         sc.nextLine();
         System.out.print("Digite o numero Agencia: ");
         String agencia = sc.nextLine();
 
         System.out.print("Digite seu nome: ");
         String nomeCliente = sc.nextLine();
 
         System.out.print("Digite seu saldo inicial R$: ");
         double saldo = sc.nextDouble();
 
         System.out.println("Olá " + nomeCliente + ",Origado por criar uma conta em nosso banco, sua agencia é " + agencia + ",conta "+ numero
         + ", e seu saldo é R$: " + saldo);
 
     }
 }
 