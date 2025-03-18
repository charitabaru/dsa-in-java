package KunalKushwaha.Queues;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super(); //this will call CustomStack();
    }
    public DynamicQueue(int size){
        super(size);//this will call CustomStack(int size)
    }

    @Override
    public boolean insert(int item) {
        if (this.isFull()){
            //double the size of an array
            int[] temp = new int[data.length *2];

            //copy all previous data elements to new array
//            System.arraycopy(data, 0, temp, 0, data.length);
            //           or
            for (int i =0;i<data.length;i++){
                temp[i] = data[(front+i)%data.length];
            }

            front =0;
            end= data.length;
            data = temp;
        }
        // at this point array is not full
        //insert it normally
        return super.insert(item);


    }
}
