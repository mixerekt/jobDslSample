package ru.sbrf.scripts

import ru.sbrf.shop.IntegerExpansion
import ru.sbrf.shop.Order
import ru.sbrf.shop.OrderExpansion

use(IntegerExpansion) {
  println 10.convertToUsd()
}
use(IntegerExpansion) {
  println 10.getTax()
}
