import javax.swing.DefaultBoundedRangeModel;

public class Queue {
    
    public static void main(String[] args) throws Exception{

        int[] elements;

        int size;

        int DEFAULT_CAPACITY = 8;

        int i;

        Queue array = new Queue();

        for (i = 0; i < 21; i++){
            array.add(i);
        }

        while(!array.empty())
            System.out.print(array.remove() + " ");
            elements.length - 1;



    }
        
        public Queue() {
            
        }

        public void add (int v){
            if (size >= .length){
                int[] temp = new int[.length * 2];
                System.arraycopy(elements, 0, temp, 0, elements.length);
                }
        
            elements[size++] = v;

        }
    

        public int remove(int[] elements, int size){
            return elements[--size];
        }

        public boolean empty(int size){
            return size == 0;
        }

        public int getSize(int size){
            return size;
        }
}
