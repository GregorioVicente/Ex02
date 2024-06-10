import Classes.Aluno;
import Classes.Turm;

public class App {
    
    public static void main(String[] args) throws Exception {
       Aluno a1 = new Aluno ("Pedro", 0001 , 12);

       Aluno a2 = new Aluno ("Joaquina", 0010 , 12);

       Aluno a3 = new Aluno ("Maria", 0011 , 12);

       Aluno a4 = new Aluno ("Joao", 0012 , 12);

       Aluno a5 = new Aluno ("Jose", 0013 , 12);

       Aluno a6 = new Aluno ("Maria", 0014 , 12);

       Aluno a7 = new Aluno ("Joao", 0015 , 12);

       Aluno a8 = new Aluno ("Jose", 0016 , 12);

       Aluno a9 = new Aluno ("Maria", 0017 , 12);

       Aluno a10 = new Aluno ("Joao", 0101 , 12);

       Turm T1 = new Turm ("Turma matutina", 001);
       Turm T2 = new Turm ("Turma vespertina", 002);

       T1.addAluno(a10, a2);
       T2.addAluno(a8, a2);

       System.out.println("Lista de aulo das turmas :");
       T1.ListaAlunos();
       System.out.println();
       T2.ListaAlunos();
       
    }
}
