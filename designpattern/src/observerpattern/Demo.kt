package observerpattern

/**
 * Created by wenchaokong on 13/01/2017.
 */
fun main (args : Array<String>){
    val subject = Subject()
    val o1 = BinaryObserver(subject)
    val o2 = HexObserver(subject)
    val o3 = OctObserver(subject)

    System.out.println("First state change: 15");
    subject.setState(15);
    System.out.println("Second state change: 10");
    subject.setState(10);
}