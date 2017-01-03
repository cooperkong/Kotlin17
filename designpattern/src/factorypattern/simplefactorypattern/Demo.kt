package factorypattern.simplefactorypattern

/**
 * Created by wenchaokong on 4/01/2017.
 * 模式优点

工厂类含有必要的判断逻辑，可以决定在什么时候创建哪一个产品类的实例，客户端可以免除直接创建产品对象的责任，而仅仅“消费”产品；简单工厂模式通过这种做法实现了对责任的分割，它提供了专门的工厂类用于创建对象。
客户端无须知道所创建的具体产品类的类名，只需要知道具体产品类所对应的参数即可，对于一些复杂的类名，通过简单工厂模式可以减少使用者的记忆量。
通过引入配置文件，可以在不修改任何客户端代码的情况下更换和增加新的具体产品类，在一定程度上提高了系统的灵活性。
当需要引入新的产品是不需要修改客户端的代码，只需要添加相应的产品类并修改工厂类就可以了，所以说从产品的角度上简单工厂模式是符合“开-闭”原则的。

   模式缺点

由于工厂类集中了所有产品创建逻辑，工厂类一般被我们称作“全能类”或者“上帝类”，因为所有的产品创建他都能完成，这看似是好事，但仔细想想是有问题的。比如全国上下所有的事情都有国家主义一个人干会不会有问题，当然有！一旦不能正常工作，整个系统都要受到影响。
使用简单工厂模式将会增加系统中类的个数，在一定程序上增加了系统的复杂度和理解难度。
系统扩展困难，一旦添加新产品就不得不修改工厂逻辑，在产品类型较多时，有可能造成工厂逻辑过于复杂，不利于系统的扩展和维护。所以说从工厂的角度来说简单工厂模式是不符合“开-闭”原则的。
简单工厂模式由于使用了静态工厂方法，造成工厂角色无法形成基于继承的等级结构。

JDK类库中广泛使用了简单工厂模式，如工具类java.text.DateFormat，它用于格式化一个本地日期或者时间。

public final static DateFormat getDateInstance();
public final static DateFormat getDateInstance(int style);
public final static DateFormat getDateInstance(int style,Locale
locale);
 */
fun main(args:Array<String>){
    val benz = CarFactory().getCar("Benz")
    val bmw = CarFactory().getCar("Bmw")
    val audi = CarFactory().getCar("Audi")
    benz.drive()
    bmw.drive()
    audi.drive()
}