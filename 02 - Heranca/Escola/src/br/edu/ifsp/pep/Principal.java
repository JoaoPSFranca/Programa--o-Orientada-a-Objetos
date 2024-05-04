package br.edu.ifsp.pep;
import br.edu.ifsp.pep.modelo.*;
import br.edu.ifsp.pep.controller.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static Scanner ler = new Scanner(System.in);
    
    public static int menu(){
        int opt;
        
        System.out.println("\nMenu: ");
        System.out.println("1 - Cadastrar. ");
        System.out.println("2 - Listar todos. ");
        System.out.println("3 - Listar professores. ");
        System.out.println("4 - Listar alunos. ");
        System.out.println("5 - Listar técnicos administrativos. ");
        System.out.println("6 - Apresentar a quantidade de pessoas (Aluno, Professor e Técnico Administrativo). ");
        System.out.println("0 - Sair. ");
        
        System.out.print("\nOpcao desejada: ");
        opt = ler.nextInt();
        ler.nextLine();
        
        return opt;
    }
    
    public static int menuCadastrar(){
        int opt;
        
        System.out.println("\nMenu: ");
        System.out.println("1. Cadastrar Aluno. ");
        System.out.println("2. Cadastrar Professor. ");
        System.out.println("3. Cadastrar Tecnico Administrativo. ");
        System.out.println("0. Voltar. ");
        
        System.out.print("\nOpcao desejada: ");
        opt = ler.nextInt();
        ler.nextLine();
        
        return opt;
    }
    
    public static String lerNome(){
        System.out.print("Informe o nome: ");
        return ler.nextLine();
    }
    
    public static String lerProntuario(){
        System.out.print("Informe o prontuario: ");
        return ler.nextLine();
    }
    
    public static String lerTelefone(){
        System.out.print("Informe o telefone: ");
        return ler.nextLine();
    }
    
    public static String lerCurso(){
        System.out.print("Informe o curso: ");
        return ler.nextLine();
    }
    
    public static int lerSemestre(){
        System.out.print("Informe o semestre: ");
        int semestre = ler.nextInt();
        ler.nextLine();
        return semestre;
    }
    
    public static String lerCargo(){
        System.out.print("Informe o cargo: ");
        return ler.nextLine();
    }
    
    public static String lerSetor(){
        System.out.print("Informe o setor: ");
        return ler.nextLine();
    }
    
    public static String lerAreaAtuante(){
        System.out.print("Informe a area em que atua: ");
        return ler.nextLine();
    }
    
    public static String lerTipoContato(){
        System.out.print("Informe o tipo de contato: ");
        return ler.nextLine();
    }
    
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();
    
    public static void main(String[] args) {
        int opt = 1, semestre;
        String nome, prontuario, telefone, curso, cargo, setor, area, tipo;
        
        Gerenciador gg = new Gerenciador();
        
        while(opt != 0){
            opt = menu();
            
            switch(opt){
                case 0:
                    break;
                
                case 1:
                    int opt2 = menuCadastrar();
                    
                    if(opt2 < 4 && opt2 > 0){
                        nome = lerNome();
                        prontuario = lerProntuario();
                        telefone = lerTelefone();
                        
                        switch(opt2){
                            case 0:
                                break;

                            case 1:
                                curso = lerCurso();
                                semestre = lerSemestre();
                                pessoas.add(gg.cadastrarAluno(nome, prontuario, telefone, curso, semestre));
                                break;

                            case 2:
                                area = lerAreaAtuante();
                                tipo = lerTipoContato();
                                pessoas.add(gg.cadastrarProfessor(nome, prontuario, telefone, area, tipo));
                                break;

                            case 3:
                                cargo = lerCargo();
                                setor = lerSetor();
                                pessoas.add(gg.cadastrarTecnicoAdministrativo(nome, prontuario, telefone, setor, cargo));
                                break;
                        }
                    }
                    else
                        System.out.println("Opção Inválida. ");
                    break;
                
                case 2:
                    if(pessoas.isEmpty())
                        System.out.println("Nenhuma pessoa cadastrada. ");
                    else
                        gg.apresentarGeral(pessoas);
                    break;
                
                case 3:
                    gg.apresentarProfessores(pessoas);
                    break;
                
                case 4:
                    gg.apresentarAlunos(pessoas);
                    break;
                
                case 5:
                    gg.apresentarTecnicos(pessoas);
                    break;
                
                case 6:
                    gg.contarPessoas(pessoas);
                    break;
                
                default:
                    System.out.println("Opção inválida. Tente novamente!");
                    break;
            }
        }
    }
}
