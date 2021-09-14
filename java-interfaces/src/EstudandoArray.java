public class EstudandoArray {
    public static void main(String[] args) {
        String [] alunos = new String [8] ;
        alunos[1] = "MARCOS ANTONIO";
        alunos[2] = "FELIPE MOREIRA";
        alunos[3] = "JONAS FARIAS";
        alunos[7] = "ANTONIO JOSE";

        System.out.println(alunos.length);;

        //eu quero o elemento 1  - INDICE =0 = ??
        System.out.println(alunos[0]);
        //quero ver todos os alunos já informados
        //controle de fluxo (if / else) (for / while)

        //while
        //java forEach
        for (String abacaxi:alunos){
            //imprimir cada aluno conforme array
            System.out.println(abacaxi);
        }
        //quero um codigo que me retorno o indice e nome do aluno
        //java for
        for(int i=1;i<alunos.length;i=i+1){
            System.out.println("O índice " + (i) + " - " + alunos[i-1]);
        }
        System.out.println(alunos[8]);
    }

}
