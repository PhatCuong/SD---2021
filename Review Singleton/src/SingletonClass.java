public class SingletonClass {
    private String s = "Hello Phat";
    private static final SingletonClass singletonClass = new SingletonClass();

    private SingletonClass(){}
    
    public void showMessage(){
        System.out.println(s); 
    }
    
    public static SingletonClass getInstance(){
        if(singletonClass == null){
            synchronized (SingletonClass.class) {
                if(singletonClass == null) {
                    return new SingletonClass();
                }
            }
        }
        return singletonClass;
    }
}
