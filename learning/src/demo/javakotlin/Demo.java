package demo.javakotlin;

/**
 * Created by wenchaokong on 23/01/2017.
 */
public class Demo {
    public static void main (String... args){
        Person person = new Person("wenchao", 11);
        JVMPerson person2 = new JVMPerson("wenchao2", 12);
        System.out.println(person.getName() + "is" + person.getAge());
        System.out.println(person2.getName() + "is" + person2.age);

        Singleton.INSTANCE.printHello();

        KotlinMethod kotlinMethod = new KotlinMethod();
        kotlinMethod.printNumber(1,2,3);
        kotlinMethod.printJVMNumber(0);


        KotlinPackageMethodKt.kotlinPackageMethod();

        System.out.println(ExtensionMethodKt.notEmpty("hello"));
    }
}
