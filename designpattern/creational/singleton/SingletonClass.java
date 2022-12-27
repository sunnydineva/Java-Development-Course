package designpattern.creational.singleton;

public class SingletonClass {

    private static SingletonClass instance = new SingletonClass(); //creation of static instance

    private SingletonClass() {
        //empty on purpose
    }

    public static SingletonClass getInstance(){ //static method
        return instance;
    }

    public void sayHi(){
        System.out.println("Hello Singleton");
    }
}
