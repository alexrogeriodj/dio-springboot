import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EstudandoColecoes {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<String>();
        alunos.add("MARCOS ANTONIO");
        alunos.add("FELIPE MOREIRA");
        alunos.add("JONAS FARIAS");
        alunos.add("ANTONIO JOSE");
        alunos.add("MARCIA REGINA");

        if(alunos.contains("GLEYSON"))
            System.out.println("A Márcia já esta na lista");
        else
            System.out.println("Não existe gleyson na tabela");


        //saber quantos alunos tenho;
        System.out.println(alunos.size());
        alunos.add(0,"SEVERINO");
        //imprimir todos os alunos
        for (String aluno:alunos){
            //imprimir cada aluno conforme array
            System.out.println(aluno);
        }
        alunos.remove(2);
        //quero ordenar os alunos por nome antes de
        //serem impressos
        System.out.println(alunos.size());

        //imprimir todos os alunos
        for (String aluno:alunos){
            //imprimir cada aluno conforme array
            System.out.println(aluno);
        }

    }
}
