public class Client implements ThirdMethodInterface {
    Service name;
    @Override
    public void setService(Service name) {
        this.name = name;
    }


    public static void main (String args[]){
        Service service = new Service("Phat");
        service.setService("Minh");
    }


}
