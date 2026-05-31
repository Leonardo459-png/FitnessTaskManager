public class TaskTest {

    public static void main(String[] args) {

        Task tarefa = new Task(1, "Treino de Peito");

        if (tarefa.getId() == 1 &&
            tarefa.getNome().equals("Treino de Peito")) {

            System.out.println("TESTE APROVADO");
        } else {
            System.out.println("TESTE REPROVADO");
        }
    }
}