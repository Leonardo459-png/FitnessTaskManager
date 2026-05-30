public class Main {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        // CREATE
        manager.adicionarTarefa(new Task(1, "Treino de Peito"));
        manager.adicionarTarefa(new Task(2, "Treino de Costas"));

        System.out.println("=== LISTA INICIAL ===");
        manager.listarTarefas();

        // UPDATE
        manager.editarTarefa(1, "Treino de Peito e Tríceps");

        System.out.println("\n=== APÓS EDIÇÃO ===");
        manager.listarTarefas();

        // DELETE
        manager.excluirTarefa(2);

        System.out.println("\n=== APÓS EXCLUSÃO ===");
        manager.listarTarefas();
    }
}
