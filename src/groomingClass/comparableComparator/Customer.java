package groomingClass.comparableComparator;

import java.util.Comparator;

public class Customer implements Comparable<Customer>{
    private int cid;
    private String cname;
    private int cage;
    private long cphone;
    private String cstate;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCage() {
        return cage;
    }

    public void setCage(int cage) {
        this.cage = cage;
    }

    public long getCphone() {
        return cphone;
    }

    public void setCphone(long cphone) {
        this.cphone = cphone;
    }

    public String getCstate() {
        return cstate;
    }

    public void setCstate(String cstate) {
        this.cstate = cstate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cage=" + cage +
                ", cphone=" + cphone +
                ", cstate='" + cstate + '\'' +
                '}';
    }

    public Customer(int cid, String cname, int cage, long cphone, String cstate) {
        this.cid = cid;
        this.cname = cname;
        this.cage = cage;
        this.cphone = cphone;
        this.cstate = cstate;
    }

    @Override
    public int compareTo(Customer o) {
        if(this.cid > o.cid)
            return 1;
        else if(this.cid < o.cid)
            return -1;
        return 0;
    }
}
class CustomerBasedOnName implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getCname().compareTo(o2.getCname());
    }
}
class CustomerBasedOnState implements Comparator<Customer>{

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getCstate().compareTo(o2.getCstate());
    }
}
class CustomerBasedOnAge implements Comparator<Customer>{

    @Override
    public int compare(Customer o1, Customer o2) {
        if(o1.getCage() > o2.getCage())
            return 1;
        else if(o1.getCage() < o2.getCage())
            return -1;
        else{
            return o1.getCname().compareTo(o2.getCname());
        }
    }
}
