public class Main {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        
        // fila.enqueueNormal(12);
        // fila.enqueueEmergency(1);
        // fila.enqueueNormal(11);
        // fila.enqueueNormal(1);
        // fila.enqueueNormal(3);
        // fila.enqueueNormal(4);
        // fila.enqueueEmergency(2);

        System.out.println(" ");

        System.out.println("        TESTE 1");
        queue.enqueueNormal(1);
        queue.enqueueNormal(2);
        queue.enqueueEmergency(1);
        queue.enqueueEmergency(2);
        queue.enqueueNormal(3);
        queue.enqueueNormal(4);

        System.out.println(queue.toString());
        queue.clear();


        System.out.println(" ");
        
        System.out.println("        TESTE 2");
        queue.enqueueEmergency(1);
        queue.enqueueEmergency(2);
        queue.enqueueEmergency(3);
        queue.enqueueNormal(1);
        queue.enqueueNormal(2);

        System.out.println(queue.toString());
        queue.clear();

        
        System.out.println(" ");

        System.out.println("        TESTE 3");
        queue.enqueueNormal(1);
        queue.enqueueNormal(2);
        queue.enqueueNormal(3);
        queue.enqueueNormal(4);
        queue.enqueueEmergency(1);

        System.out.println(queue.toString());
        queue.clear();


        System.out.println(" ");

        System.out.println("        TESTE 4");
        queue.enqueueEmergency(10);
        queue.enqueueEmergency(2);
        queue.enqueueEmergency(1);
        queue.enqueueEmergency(4);
        queue.enqueueEmergency(5);

        System.out.println(queue.toString());
        queue.clear();


        System.out.println(" ");

        System.out.println("        TESTE 5");
        queue.enqueueNormal(1);
        queue.enqueueEmergency(4);
        queue.enqueueEmergency(2);
        queue.enqueueNormal(2);
        queue.enqueueEmergency(1);
        queue.enqueueNormal(3);

        System.out.println(queue.toString());
        queue.clear();

        
    }
}
