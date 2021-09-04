public class SingletonClass {
    private String s = "Hello Phat";
    private static SingletonClass singletonClass = null;

    private SingletonClass(){
        System.out.println(s);
    }

    public static SingletonClass getInstance(){
        if(singletonClass == null){
            return new SingletonClass();
        }
        return singletonClass;
    }
}
