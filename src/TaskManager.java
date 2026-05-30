import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tarefas = new ArrayList<>();

    // CREATE
    public void adicionarTarefa(Task tarefa) {
        tarefas.add(tarefa);
    }

    // READ
    public void listarTarefas() {
        for (Task tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    // UPDATE
    public void editarTarefa(int id, String novoNome) {
        for (Task tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.setNome(novoNome);
            }
        }
    }

    // DELETE
    public void excluirTarefa(int id) {
        tarefas.removeIf(tarefa -> tarefa.getId() == id);
    }
}