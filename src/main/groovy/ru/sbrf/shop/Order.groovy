package ru.sbrf.shop


import jdk.nashorn.internal.objects.annotations.Property
import org.apache.commons.lang3.builder.CompareToBuilder


class Order implements Comparable {

  static {
    /*Order.metaClass.invokeMethod = {String name, args ->
        def method = Order.metaClass.getMetaMethod(name, args)
        println "invoke methods: ${method?.name}"
        if (method) {
            method.invoke(delegate, args)
        } else {
            delegate."${name}"(args)
//                Order.superclass.metaClass.invokeMethod(name, args)
        }
    }*/

    Order.metaClass.copy << { ->
      println "copyTo: ${delegate}"
    }
  }

  @Property
    orderNum
  @Property
    orderSum
  @Property
    orderItem

  Order plus(Order newOrder) {
    orderSum += newOrder.orderSum
    orderItem += ", ${newOrder.orderItem}"
    return this
  }

  Order minus(Order newOrder) {
    orderSum -= newOrder.orderSum
    return this
  }

  String getAt(int pos) {
    (orderItem as String).split(',')[pos]
  }

  @Override
  int compareTo(Object o) {
    return new CompareToBuilder().append((o as Order).orderNum, orderNum)
      .toComparison()
  }

  boolean equals(o) {
    if (this.is(o)) return true
    if (getClass() != o.class) return false

    Order order = (Order) o

    if (orderItem != order.orderItem) return false
    if (orderNum != order.orderNum) return false
    if (orderSum != order.orderSum) return false

    return true
  }

  int hashCode() {
    int result
    result = (orderNum != null ? orderNum.hashCode() : 0)
    result = 31 * result + (orderSum != null ? orderSum.hashCode() : 0)
    result = 31 * result + (orderItem != null ? orderItem.hashCode() : 0)
    return result
  }

  @Override
  public String toString() {
    return "Order{" +
      "orderNum=" + orderNum +
      ", orderSum=" + orderSum +
      ", orderItem=" + orderItem +
      '}';
  }

  /*def copy(Order order) {
      orderItem = order.orderItem
      orderSum = order.orderSum
      orderNum = order.orderNum
      return this
  }*/

  /*def copy() {
      println "original"
  }*/
}
