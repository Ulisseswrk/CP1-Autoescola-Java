public class AutoEscola {

    // Definição dos atributos da classe:
    Aluno aluno1;
    Aluno aluno2;
    Aluno aluno3;
    Aluno aluno4;

    Instrutor instrutor;
    Veiculo veiculo;

    // Mostra as informações dos alunos cadastrados (com o nome, aulas feitas e aprovação)
    public void exibirResumo() {

        System.out.println("----- RESUMO DOS ALUNOS -----");

        if (aluno1 != null) {
            System.out.println("Nome: " + aluno1.nome);
            System.out.println("Aulas Teóricas: " + aluno1.aulasTeoricas);
            System.out.println("Aulas Práticas: " + aluno1.aulasPraticas);
            System.out.println("Status de Aprovação: " + aluno1.aprovado);
            System.out.println("---------------------------------------");
        }
        if (aluno2 != null) {
            System.out.println("Nome: " + aluno2.nome);
            System.out.println("Aulas Teóricas: " + aluno2.aulasTeoricas);
            System.out.println("Aulas Práticas: " + aluno2.aulasPraticas);
            System.out.println("Status de Aprovação: " + aluno2.aprovado);
            System.out.println("---------------------------------------");
        }
        if (aluno3 != null) {
            System.out.println("Nome: " + aluno3.nome);
            System.out.println("Aulas Teóricas: " + aluno3.aulasTeoricas);
            System.out.println("Aulas Práticas: " + aluno3.aulasPraticas);
            System.out.println("Status de Aprovação: " + aluno3.aprovado);
            System.out.println("---------------------------------------");
        }
        if (aluno4 != null) {
            System.out.println("Nome: " + aluno4.nome);
            System.out.println("Aulas Teóricas: " + aluno4.aulasTeoricas);
            System.out.println("Aulas Práticas: " + aluno4.aulasPraticas);
            System.out.println("Status de Aprovação: " + aluno4.aprovado);
        }
    }
}
