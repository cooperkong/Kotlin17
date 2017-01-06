package iteratorpattern

/**
 * Created by wenchaokong on 6/01/2017.
 *   优点
1、它支持以不同的方式遍历一个聚合对象。
2、迭代器简化了聚合类。
3、在同一个聚合上可以有多个遍历。
4、在迭代器模式中，增加新的聚合类和迭代器类都很方便，无须修改原有代码。
缺点
由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性。

五、模式使用场景
1、访问一个聚合对象的内容而无须暴露它的内部表示。
2、需要为聚合对象提供多种遍历方式。
3、为遍历不同的聚合结构提供一个统一的接口。

六、模式总结
1、迭代器模式提供一种方法来访问聚合对象，而不用暴露这个对象的内部表示。
2、将遍历聚合对象中数据的行为提取出来，封装到一个迭代器中，通过专门的迭代器来遍历聚合对象的内部数据，这就是迭代器模式的本质。迭代器模式是“单一职责原则”的完美体现。
3、当使用迭代器的时候，我们依赖聚合提供遍历。
4、迭代器提供了一个通用的接口，让我们遍历聚合的项，放我们编码使用聚合项时，就可以使用多态机制。
 */
class MovieContainer : Container{

    val movies = arrayOf("a", "b", "c")
    val movieIterator = MovieIterator()
    override fun getIterator(): Iterator {
        return movieIterator
    }

    inner class MovieIterator : Iterator {
        var index : Int = 0
        override fun hasNext(): Boolean {
            return index < movies.size
        }

        override fun next(): Any {
            return movies[index++]
        }

    }

}

