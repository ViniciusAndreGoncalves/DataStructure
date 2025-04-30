public class PriorityQueue {
    private int lenght;
    private Node start;
    private Node lastNode;

    void clear(){
        this.start = null;
        this.lastNode = null;
        this.lenght = 0;
    }
        
    void enqueueNormal(int element) {
        char Normal = 'N';
        Node newNode = new Node(element, Normal);
    
        // Caso a fila esteja vazia
        if (this.start == null) {
            this.start = newNode;
            this.lastNode = newNode;
        } else {
            Node current = this.start;
    
            // Se todos os nós são urgentes, insere o primeiro N depois de todos os U
            if (current.getPriority() == 'U') {
                // Caminha até o último nó com prioridade U
                while (current.getNext() != null && current.getNext().getPriority() == 'U') {
                    current = current.getNext();
                }
    
                // Aqui insere o novo nó entre as fichas U e N
                // Se não há N ainda, apenas coloca o newNode após o último U
                if (current.getNext() == null) {
                    current.setNext(newNode);
                    this.lastNode = newNode;
                } else {
                    // Inserção ordenada entre os N
                    Node temp = current;
                    Node runner = current.getNext();
    
                    while (runner != null && runner.getPriority() == 'N' && runner.getElement() < element) {
                        temp = runner;
                        runner = runner.getNext();
                    }
    
                    newNode.setNext(runner);
                    temp.setNext(newNode);
    
                    if (newNode.getNext() == null) {
                        this.lastNode = newNode;
                    }
                }
            } else {
                // Nenhum U na fila, tudo é normal
                // Inserção ordenada entre os N
                Node prev = null;
                Node runner = this.start;
    
                while (runner != null && runner.getPriority() == 'N' && runner.getElement() < element) {
                    prev = runner;
                    runner = runner.getNext();
                }
    
                if (prev == null) {
                    newNode.setNext(this.start);
                    this.start = newNode;
                } else {
                    newNode.setNext(runner);
                    prev.setNext(newNode);
                }
    
                if (newNode.getNext() == null) {
                    this.lastNode = newNode;
                }
            }
        }
    
        this.lenght++;
    }
    
    
    void enqueueEmergency(int element) {
        char Emergency = 'U';
        Node newNode = new Node(element, Emergency);
    
        // Caso a fila esteja vazia OU o início é um N (normal)
        // OU o novo U tem número menor que o atual U na frente
        if (this.start == null || (this.start.getPriority() == 'N') || 
            (this.start.getPriority() == 'U' && element < this.start.getElement())) {
            newNode.setNext(this.start);
            this.start = newNode;
        } else {
            Node current = this.start;
    
            // Percorre[current = current.getNext] enquanto
            while (current.getNext() != null &&
                   current.getNext().getPriority() == 'U' &&    // o próximo for U
                   current.getNext().getElement() < element) {  // e o número da ficha for menor
                current = current.getNext();
            }
    
            // Inserção entre dois nós (ou no final dos U's)
            newNode.setNext(current.getNext());
            current.setNext(newNode);
    
            // Se o novo nó foi inserido no final, atualiza o lastNode
            // if (newNode.getNext() == null) {
            //     this.lastNode = newNode;
            // }
        }
    
        this.lenght++;
    }
    
    
    void dequeue(){
        this.start = this.start.getNext();
        lenght--;
    }
    
    public PriorityQueue() {
    }

    public int getLenght() {
        return lenght;
    }

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("         FILA \n| ");

        Node current = start;                           // Criei um nó atual que aponta para o início
            while (current != null) {                           // Enquanto o nó atual for diferente de nulo,
                sb.append(current.getElement()).append(" - ");  // coloco o elemento atual e insiro esse traço, e
                sb.append(current.getPriority()).append(" | ");
                current = current.getNext();                    // aqui percorre a lista
            }

        sb.append("");

        sb.append(" \nTamanho = ").append(lenght); // Aqui mostra o tamanho da lista
        sb.append("");
        return sb.toString();
    }

}
