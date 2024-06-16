package model;



public class Counter implements AutoCloseable {
    private int count;
    public Counter(int count){
        this.count=count;
    }
    
    public int add() throws Exception{
        return this.count+1;
    }


    @Override
    public void close() throws Exception {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'close'");
    }

}
