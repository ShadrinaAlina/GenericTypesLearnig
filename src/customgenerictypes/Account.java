package customgenerictypes;

public class Account {
    private Object id;
    private int sum;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Account(Object id, int sum){
        this.id = id;
        this.sum = sum;
    }
}
