package examplelinkedhashset;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ExampleLinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> booksToBeRead = new LinkedHashSet<>();
        Scanner scan = new Scanner(System.in);
        int option;
        
        do{
            System.out.println("Lista de livros 'To Be Read'");
            System.out.println("-----Menu-----");
            System.out.println("1 - Adicionar livro na lista;");
            System.out.println("2 - Remover livro da lista;");
            System.out.println("3 - Remover primeiro livro da lista;");
            System.out.println("4 - Tamanho da lista;");
            System.out.println("5 - Limpar lista;");
            System.out.println("6 - Imprimir lista;");
            System.out.println("7 - Sair.\n");
            System.out.println("Escolha sua opcao:");
            
            option = scan.nextInt();
            scan.nextLine();
            switch (option){
                case 1:
                    System.out.println("--Adicionar livro--");
                    System.out.println("Digite o nome do livro:");
                    boolean added = booksToBeRead.add(scan.nextLine());
                    if (added) {
                        System.out.println("Livro incluido.\n");
                    } else {
                        System.out.println("Este livro ja esta na lista.\n");
                    }
                    break;
                case 2:
                    System.out.println("--Remover livro--");
                    System.out.println("Digite o nome do livro:");
                    String book = scan.nextLine();
                    if (booksToBeRead.remove(book)) {
                        System.out.println("Livro excluido.\n");
                    } else {
                        System.out.println("Livro nao encontrado.\n");
                    }
                    break;
                case 3:
                    System.out.println("--Remover primeiro livro--");
                    if (!booksToBeRead.isEmpty()) {
                        String firstBook = booksToBeRead.iterator().next();
                        booksToBeRead.remove(firstBook);
                        System.out.println("Livro removido: " + firstBook + "\n");
                    } else {
                        System.out.println("A lista esta vazia.\n");
                    }
                    break;
                case 4:
                    System.out.println("--Tamanho da lista--");
                    System.out.println("A lista contem " + booksToBeRead.size() + " livros.\n");
                    break;
                case 5:
                    System.out.println("--Limpar lista--");
                    booksToBeRead.clear();
                    System.out.println("Lista limpa.\n");
                    break;
                case 6:
                    System.out.println("--Imprimir lista--");
                    System.out.println("Livros 'To Be Read':");
                    if (booksToBeRead.isEmpty()) {
                        System.out.println("A lista esta vazia.\n");
                    } else {
                        int i = 1;
                        for (String currentBook : booksToBeRead) {
                            System.out.println(i + " - " + currentBook);
                            i++;
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    System.out.println("--Sair--\n");
                    scan.close();
                    break;
            }
            
        } while (option!=7); 
    }
}