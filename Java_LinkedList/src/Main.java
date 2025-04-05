public class Main {
    public static void main(String[] args) throws Exception {
        Linked_List list = new Linked_List();

        System.out.println(" "); // Para deixar bonito no terminal

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

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
