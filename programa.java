package Arvore;

import java.util.Scanner;

//criando hud programa que faça as todas os métodos do arquivo Arvore.java
public class programa {
    
        public static <interger> void main(String[] args) {
            //criando objeto para ler o teclado
            Scanner leitor = new Scanner(System.in);
            //criando objeto para a classe Arvore
            Arvore<interger> arvore = new Arvore<interger>();
            //criando variável para o menu
            int opcao = 0;
            arvore.inserir("10");
            arvore.inserir("8");
            arvore.inserir("18");

            //criando menu
            while (opcao != 6) {
                System.out.println("1 - Inserir");
                System.out.println("2 - Imprimir em ordem crescente");
                System.out.println("3 - Imprimir em pré ordem");
                System.out.println("4 - imprimir em pós ordem");
                System.out.println("5 - Imprimir em ordem");
                System.out.println("6 - Sair");
               
                System.out.print("Opção: ");
                opcao = leitor.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o valor: ");
                        String valor = leitor.next();
                        arvore.inserir(valor);
                        break;
                    case 2:
                        arvore.imprimirOrdemCrescente();
                        break;
                    case 3:
                        arvore.imprimirPreOrdem();
                        break;
                    case 4:
                        arvore.imprimirPosOrdem();
                        break;
                    case 5:
                        arvore.imprimirOrdem();
                        break;
                    case 6:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        }
    }