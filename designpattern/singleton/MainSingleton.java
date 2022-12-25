package designpattern.singleton;

public class MainSingleton {
    public static void main(String[] args) {

    SingletonClass singletonObject = SingletonClass.getInstance();
    singletonObject.sayHi();

    }
}
