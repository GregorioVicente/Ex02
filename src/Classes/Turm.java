package Classes;

import java.util.ArrayList;
import java.util.List;

public class Turm{
    private String name;
    private String cod;
    private List<Aluno> alunos;


    public Turm(String name, String cod, List<Aluno> alunos) {
        this.name = name;
        this.cod = cod;
        this.alunos = new ArrayList<>();
    }

    public Turm(String string, int i) {
        //TODO Auto-generated constructor stub
    }

    public void addAluno(Aluno alunos, Aluno a2) {
        this.alunos.add(alunos);
    }

    public void ListaAlunos(){
        System.out.println("Alunos da :" + name + cod + ":");
        for (Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }
}