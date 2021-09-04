public class Service {
    //There are 3 ways to pass the reference to the client
    String name;
    //1st: Constructor
    public Service(String name){
        this.name = name;
    }
    //2nd: Setter
    public void setService(String name){
        this.name = name;
    }

    public void print(){
        System.out.print("Name: " + name);
    }
}
