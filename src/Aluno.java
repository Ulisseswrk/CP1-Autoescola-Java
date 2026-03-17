public class Aluno{

    // Começamos definindo os atributos da classe:
    String nome;
    int idade;
    String tipoVeiculo;
    int aulasTeoricas;
    int aulasPraticas;
    Boolean aprovado;

    // Definição dos Metodos:

    // Adiciona 1 registro a variável aulasTeoricas
    public void agendarAulaTeorica() {
        aulasTeoricas = aulasTeoricas + 1;
        System.out.println("Aula teorica de " + nome + " agendada com sucesso");
    }

    // Adiciona 1 registro a variável aulasPraticas
    public void agendarAulaPratica() {
        aulasPraticas = aulasPraticas + 1;
        System.out.println("Aula prática de " + nome + " agendada com sucesso");
    }

    // Remove um registro de Aula Teórica (se ele tiver pelo menos uma agendada)
    public void cancelarAulaTeorica() {
        if (aulasTeoricas > 0){
            aulasTeoricas = aulasTeoricas - 1;
            System.out.println("Aula Teorica cancelada com sucesso");
        } else {
            System.out.println("Você ainda não tem nenhuma aula teórica agendada");
        }
    }

    // Remove um registro de Aula Prática (se ele tiver pelo menos uma agendada)
    public void cancelarAulaPratica() {
        if (aulasPraticas > 0){
            aulasPraticas = aulasPraticas - 1;
            System.out.println("Aula Prática cancelada com sucesso");
        } else {
            System.out.println("Você ainda não tem nenhuma aula prática agendada");
        }
    }

    // Realiza o exame com a aprovação aleatoria (Se ele tiver no mínimo 5 aulas de cada)
    public void realizarExame() {

        if (aulasTeoricas >= 5 && aulasPraticas >= 5) {

            if (Math.random() > 0.5){ // O random gera um número aleatório. Se der mais que 0.5 (50%) ele aprova
                aprovado = true;
                System.out.println("O aluno " + nome + " foi aprovado!!!");
            } else {
                aprovado = false;
                System.out.println("O aluno " + nome + " foi reprovado");
            }

        } else {
            System.out.println("Você não tem o mínimo de aulas necessárias para fazer o teste");
        }
    }

}

