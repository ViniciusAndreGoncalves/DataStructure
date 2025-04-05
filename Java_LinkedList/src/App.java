public class App {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();

        System.out.println(" "); // Para deixar bonito no terminal

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("  LISTA CRIADA  ");
        System.out.println(list);

        System.out.println(" ");        

        list.insertByPosition(0, 10);   // Inserir elemento em posição específica
        System.out.println("  ELEMENTO ADICIONADO  ");
        System.out.println(list);

        System.out.println(" "); // Para deixar bonito no terminal

        list.removeSpecificElement(3);    // Remover elemento em posição específica
        System.out.println("  ELEMENTO REMOVIDO  ");
        System.out.println(list);

        System.out.println(" "); // Para deixar bonito no terminal
    }
}
