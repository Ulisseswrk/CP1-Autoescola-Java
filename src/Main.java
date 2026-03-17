public class Main {
    public static void main(String[] args){
        // Definindo os atributos da classe e colocando eles nas gavetas definidas nos outros arquivos:

        AutoEscola unidadePaulista = new AutoEscola();
        Instrutor Leandro = new Instrutor();;
        Veiculo fiatArgo = new Veiculo();

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ulisses";
        aluno1.idade = 18;

        // Agregação do aluno na gaveta da autoescola
        unidadePaulista.aluno1 = aluno1;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Arthur";
        aluno2.idade = 18;

        unidadePaulista.aluno2 = aluno2;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Levi";
        aluno3.idade = 18;

        unidadePaulista.aluno3 = aluno3;

        Aluno aluno4 = new Aluno();
        aluno4.nome = "Luigi";
        aluno4.idade = 18;

        unidadePaulista.aluno4 = aluno4;

        // Simulação do uso dos métodos:
        System.out.println("SEJA BEM VINDO A AUTOESCOLA DA PAULISTA!!!");
        System.out.println("Que tal começar simulando nossos métodos? \n");

        System.out.println("Agendamento das aulas práticas:");
        unidadePaulista.aluno1.agendarAulaPratica();
        unidadePaulista.aluno1.agendarAulaPratica();
        unidadePaulista.aluno1.agendarAulaPratica();
        unidadePaulista.aluno1.agendarAulaPratica();
        unidadePaulista.aluno1.agendarAulaPratica();
        unidadePaulista.aluno1.agendarAulaPratica();

        System.out.println("\nCancelamento:");
        unidadePaulista.aluno1.cancelarAulaPratica();

        System.out.println("\nTentativa do exame sem as aulas necessárias:");
        unidadePaulista.aluno1.realizarExame();

        System.out.println("\nAgendamento das aulas teóricas:");
        unidadePaulista.aluno1.agendarAulaTeorica();
        unidadePaulista.aluno1.agendarAulaTeorica();
        unidadePaulista.aluno1.agendarAulaTeorica();
        unidadePaulista.aluno1.agendarAulaTeorica();
        unidadePaulista.aluno1.agendarAulaTeorica();

        System.out.println("\nTentativa do exame (Agora com as aulas):");
        unidadePaulista.aluno1.realizarExame();
        System.out.println("");

        unidadePaulista.exibirResumo();
    }
}
