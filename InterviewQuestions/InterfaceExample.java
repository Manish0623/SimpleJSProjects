
interface Animal{
    void eat();
void sleep();
}

class dog implements Animal{
    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}

class cat implements Animal{
    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}

public class InterfaceExample{
    public static void main(String[] args) {
        Animal d = new dog();
        d.eat();
        d.sleep();


        Animal c = new cat();
        c.eat();
        c.sleep();
    }}
