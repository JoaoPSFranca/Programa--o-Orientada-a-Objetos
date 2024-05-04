package br.edu.ifsp.pep.controller;
import br.edu.ifsp.pep.modelo.Aluno;
import br.edu.ifsp.pep.modelo.Professor;
import br.edu.ifsp.pep.modelo.TecnicoAdministrativo;
import br.edu.ifsp.pep.modelo.Pessoa;
import java.util.ArrayList;

public class Gerenciador {
    public Aluno cadastrarAluno(String nome, String prontuario, String telefone, String curso, int semestre){
        return new Aluno(curso, semestre, prontuario, nome, telefone);
    }
    
    public Professor cadastrarProfessor(String nome, String prontuario, String telefone, String area, String tipo){
        Professor p = new Professor(area, tipo, prontuario, nome, telefone);
        return p;
    }
    
    public TecnicoAdministrativo cadastrarTecnicoAdministrativo(String nome, String prontuario, String telefone, String setor, String cargo){
        return new TecnicoAdministrativo(setor, cargo, prontuario, nome, telefone);
    }
    
    public void apresentarPessoa(Pessoa p){
        System.out.println("Nome: " + p.getNome() + ". ");
        System.out.println("Prontuario: " + p.getProntuario() + ". ");
        System.out.println("Telefone: " + p.getTelefone() + ". ");
    }
    
    public void apresentarAluno(Aluno a, Pessoa p){
        apresentarPessoa(p);
        System.out.println("Curso: " + a.getCurso() + ". ");
        System.out.println("Semestre: " + a.getSemestre() + ". ");
    }
    
    public void apresentarProfessor (Professor pr, Pessoa p){
        apresentarPessoa(p);
        System.out.println("Area de atuação: " + pr.getArea_atuante() + ". ");
        System.out.println("Tipo de contato: " + pr.getTipo_contato() + ". ");
    }
    
    public void apresentarTecnico (TecnicoAdministrativo ta, Pessoa p){
        apresentarPessoa(p);
        System.out.println("Setor: " + ta.getSetor() + ". ");
        System.out.println("Cargo: " + ta.getCargo() + ". ");
    }
    
    public void apresentarGeral(ArrayList<Pessoa> pessoas){
        System.out.println("----------------------------");
        
        for (Pessoa p : pessoas){
            if(p instanceof Aluno a){
                apresentarAluno(a, p);
            } else if(p instanceof Professor pr){
                apresentarProfessor(pr, p);
            } else if(p instanceof TecnicoAdministrativo ta){
                apresentarTecnico(ta, p);
            }
            
            System.out.println("----------------------------");
        }
    }
    
    public void apresentarAlunos(ArrayList<Pessoa> pessoas){
        int contador = 0;
        
        for (Pessoa p : pessoas){
            if(p instanceof Aluno a){
                if (contador == 0)
                    System.out.println("----------------------------");
                
                apresentarAluno(a, p);
                System.out.println("----------------------------");
                contador++;
            }             
        }
        
        if(contador == 0)
            System.out.println("Nenhum aluno cadastrado. ");
    }
    
    public void apresentarProfessores(ArrayList<Pessoa> pessoas){
        int contador = 0;
        
        for (Pessoa p : pessoas){
            if(p instanceof Professor pr){
                if (contador == 0)
                    System.out.println("----------------------------");
                
                apresentarProfessor(pr, p);
                System.out.println("----------------------------");
                contador++;
            }             
        }
        
        if(contador == 0)
            System.out.println("Nenhum professor cadastrado. ");
    }
    
    public void apresentarTecnicos(ArrayList<Pessoa> pessoas){
        int contador = 0;
        
        for (Pessoa p : pessoas){
            if(p instanceof TecnicoAdministrativo ta){
                if (contador == 0)
                    System.out.println("----------------------------");
                
                apresentarTecnico(ta, p);
                System.out.println("----------------------------");
                contador++;
            }             
        }
        
        if(contador == 0)
            System.out.println("Nenhum tecnico administrativo cadastrado. ");
    }
    
    public void contarPessoas(ArrayList<Pessoa> pessoas){
        int contador = 0, 
            contAluno = 0, 
            contProf = 0,
            contTecnico = 0;
        
        for (Pessoa p : pessoas){
            if(p instanceof Aluno){
                contAluno++;
            } else if(p instanceof Professor){
                contProf++;
            } else if(p instanceof TecnicoAdministrativo){
                contTecnico++;
            }
            
            contador++;
        }
        
        if(contador == 0)
            System.out.println("Nenhuma pessoa cadastrada. ");
        else{
            System.out.println("Total de alunos cadastrados: " + contAluno + ". ");
            System.out.println("Total de professores cadastrados: " + contProf + ". ");
            System.out.println("Total de tecnicos administrativos cadastrados: " + contTecnico + ". ");
            System.out.println("Total de pessoas cadastradas: " + contador + ". ");
        }
    }
}
