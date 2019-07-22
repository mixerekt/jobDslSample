package ru.sbrf.shop

class OrderExpansion {
  static {
    Order.metaClass.copy << {
      ->
      println "owner: $owner"
      println "delegate $delegate";
      owner += delegate
    }

    Order.metaClass.invokeMethod = { String name, args ->
      def method = Order.metaClass.getMetaMethod(name, args)
      println "invoke methods: ${method.name}"
      if (method) {
        method.invoke(delegate, args)
      } else {
        println "missing method"
      }
    }
  }
}
