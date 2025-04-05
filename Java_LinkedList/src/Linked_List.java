

public class Linked_List {
    
    private Node start;
    private Node lastNode;
    private int lenght;

    public Linked_List() {}

    void add(int element){              //Aqui sempre insere no final da lista ou fila;
        Node cell = new Node(element);  // Instanciei o objeto Node aqui, para não precisar instanciar toda vez que quiser inserir um novo elemento no Main
        
        if (this.lenght == 0) {         // Se o tamanho é 0, a lista está vazia, logo
            this.start = cell;          // o início recebe o parâmetro cell(int)

        } else {                        // Se a lista tiver elementos,
            this.lastNode.setNext(cell);// o ponteiro do próximo passa a referenciar o novo nó(cell), e esse apontará para null
        }
        this.lastNode = cell;           // Aqui o ponteiro do último nó aponta para o elemento inserido
        this.lenght++;          //Acrescenta 1 no tamanho da lista  
    }

    int getLenght() { // Retorna o tamanho da lista
        return lenght;
    }

    void clear(){ // Função que limpa a lista

        //2. Porém por questões de Garbage Collector, gerenciamento de memória essa parte é importante
        // for (Node current = this.start; current != null;) { // Para o atual = inicial e diferente de nulo
        //     Node next = current.getNext(); // faça o próximo elemento se tornar o atual
        //     current.setElement(null); // Aqui não vai funcionar pois a lista é de inteiros; Mas faz o atual ser nulo
        //     current.setNext(null); // e aqui o próximo fica nulo também
        //     current = next; // Aqui o atual aponta para o próximo
        // }

        //1. Essa parte já limpa a lista toda sozinha
        this.start = null;
        this.lastNode = null;
        this.lenght = 0;
    }

    void removeSpecificElement(int removeElementInPosition){
        Node currentNode = this.start;
        int position = 0;

        if (removeElementInPosition == 0) {                      // Se o usuário remover o primeiro elemento,
            this.start = this.start.getNext();                   // apenas faz o início se tornar o próximo(aponta para o próximo)
        } else {    // É necessário inserir toda a lógica dentro do else caso o usuário desejar remover em uma outra posição

        while (currentNode != null) {                   // Enquanto o ponteiro do nó atual for diferente de nulo,
            if (position == removeElementInPosition - 1) {  // Se a posição for igual a posição que eu inseri,
                break;                                      // paro o loop while.
            }
            currentNode = currentNode.getNext();            // eu atualizo o nó atual para apontar para o próximo e
            position++;                                     // acrescento 1 na posição.
        }
        Node toRemove = currentNode.getNext();              // Aqui eu crio um nó (toRemove) apontando a posição do nó a ser removido (current.getNext)
        currentNode.setNext(toRemove.getNext());            // toRemove.getNext retorna o próximo nó do qual quero remover, e o current.setNext faz o nó atual apontar para o próximo nó do toRemove
        }

    lenght--; // Decrementa o tamanho
    }

    void insertByPosition(int insertPosition, int newElement){ // Insere um elemento de acordo com a posição desejada
        
        if (insertPosition == 0) {
            Node newNode = new Node(newElement);
            
            newNode.setNext(this.start);    // Novo nó aponta para o antigo início
            this.start = newNode;           // Novo início se torna o elemento do nó

            if (this.lenght == 0) {
                this.lastNode = newNode;    // Caso a lista esteja vazia, o último nó recebe o novo
            }

        } else {

            Node currentNode = this.start;
            int position = 0;

        while (currentNode != null) {               // Enquanto o nó atual for diferente de nulo, eu percorro a lista
            if (position == insertPosition -1) {    // Se a posição foi igual a penúltima posição do input,
                break;                              // o loop é encerrado e
            }
            currentNode = currentNode.getNext();
            position++;
        }
        Node saveLastNext = currentNode.getNext();  // é criado um "save" do próximo ponteiro da lista antiga,
        Node newNext = new Node(newElement);        // é criado um novo nó contendo o elemento passado por parâmetro
        currentNode.setNext(newNext);               // e o ponteiro do próximo nó aponta para o novo elemento.
        currentNode = currentNode.getNext();        // Aqui o novo nó pede o ponteiro do próximo nó
        currentNode.setNext(saveLastNext);          // e aqui insere o próximo com o "save" da lista antiga.
        
        }
        lenght++;
    }

    Node searchElement(int position){ // Busca por posição, retornando o elemento em si (no caso é o número inteiro)
        Node currentNode = this.start;
        int currentElement = 0;
        
        while (currentNode != null) {
            if (currentElement == position) {
                return currentNode;
            }
            currentElement++;
            currentNode = currentNode.getNext();
        }

        return null;
    }

    int searchIfExists(int element){ // Pesquisa se um elemento existe ou não na lista e retorna a posição
        Node currentNode = this.start; // O atual vira o início
        int position = 0;

        while (currentNode != null) {                   // Enquanto o Nodo atual for diferente de nulo(final da lista)
            if (currentNode.getElement() == element) {  // Se o elemento do Nodo atual for igual ao elemento(int) pesquisado
                return position;                        // retorna a posição
            }
            position++;                                 // Se não achou, acrescenta 1 na posição
            currentNode = currentNode.getNext();        // O Nodo atual aponta para o Nodo segunte, se tornando o atual
        }
        return -1; // Retorna -1 se não for encontrado
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista Encadeada [");

        Node current = start;                           // Criei um nó atual que aponta para o início
            while (current != null) {                           // Enquanto o nó atual for diferente de nulo,
                sb.append(current.getElement()).append(" -> "); // coloco o elemento atual e insiro essa seta, e
                current = current.getNext();                    // aqui eu indico o atual nó para receber o valor do próximo.
            }

        sb.append("null");

        sb.append("] [Tamanho = ").append(lenght); // Aqui mostra o tamanho da lista
        sb.append("]");
        return sb.toString();
    }


}
