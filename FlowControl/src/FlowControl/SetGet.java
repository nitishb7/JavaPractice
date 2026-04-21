package FlowControl;

public class SetGet {
    
    int sno;
    String sname;
    String sadd;

    public int getSno() {
        return sno;
    }
    
    public void setSno(int sno) {
        this.sno = sno;
    }
    
    public String getSname() {
        return sname;
    }
    
    public void setSname(String sname) {
        this.sname = sname;
    }
    
    public String getSadd() {
        return sadd;
    }
    
    public void setSadd(String sadd) {
        this.sadd = sadd;
    }

    public static void main(String[] args) {
        SetGet st = new SetGet();
        st.setSno(100);
        st.setSname("raja");
        st.setSadd("nepal");

        System.out.println(st.getSno() + "\t" + st.getSname() + "\t" + st.getSadd());
    }
}