import java.sql.Date;

import java.util.Date


 class DataSet{
    private String ID,name;
    private Date datetime;
    private double balance;
    public String getID(){return ID;}
    public void setID(String ID){this.ID=ID;}
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public Date getDatetime(){return datetime;}
    public void setDatetime(Date datetime){this.datetime=datetime;}
    public double getBalance(){return balance;}
    public void setBalance(double balance){this.balance=balance;}
    public DataSet(String ID,String name,double balance){
        this.ID=ID;
        this.name=name;
        this.balance=balance;
        

    }
    public DataSet(){
        this.ID=" ";
        this.name=" ";
        this.balance=0;
        this.datetime=new Date();
    } 
    public void save(double money){this.balance=this.balance+money;}
    public void draw(double money){this.balance=this.balance-money;}
    public void change(double money,DataSet other){
        this.balance=this.balance-money;
        other.balance=other.balance+money;
    }
}
public class Bank{
    public static void main(String args[]) {
        DataSet zhangSan=new DataSet("001","张三",1000);
        DataSet liSi=new DataSet("002","李四",1000);
        zhangSan.save(2000);
        liSi.draw(500);
        zhangSan.change(300,liSi);
        System.out.println("李四的余额是"+liSi.getBalance());
        System.out.println("张三的余额是"+zhangSan.getBalance());
    }
}

