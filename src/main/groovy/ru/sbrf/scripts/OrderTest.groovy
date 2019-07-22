package ru.sbrf.scripts

import ru.sbrf.shop.Order
import ru.sbrf.shop.OrderExpansion

ExpandoMetaClass.enableGlobally()

use(OrderExpansion) {

  def order1 = new Order(orderNum: 1213, orderSum: 1000000, orderItem: "Bread, Milk, Meat")
  def order2 = new Order(orderNum: 1013, orderSum: 5000000, orderItem: "Bread, Milk, Meat")
  def order3 = new Order(orderNum: 1113, orderSum: 6000000, orderItem: "Bread, Milk, Meat")
  def order4 = new Order(orderNum: 1214, orderSum: 70000, orderItem: "Bread, Milk, Meat")
  def order5 = new Order(orderNum: 1215, orderSum: 70500, orderItem: "Bread, Milk, Meat")
  def order6 = new Order(orderNum: 1216, orderSum: 80500, orderItem: "Bread, Milk, Meat")

  println order1 <=> order2
  println order1 <=> order6

  println order3 > order2
  println order4 > order5

  assert order1 != order3

  order1 += order3
  println order1

  order2 -= order4
  println order2

  println "order 4 = ${order4[1]}"

  def order20 = new Order(orderNum: 1, orderSum: 100, orderItem: 1)
  def order21 = new Order(orderNum: 2, orderSum: 200, orderItem: 2)

  order21.copy()
//    println order20.copy(order21)
}

/*
class Book {
    String title
}

Book.metaClass.upCase << { -> title.toUpperCase() }

def book = new Book(title: "The Stand")

assert  "THE STAND" == book.upCase()*/
