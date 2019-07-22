package ru.sbrf.shop

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import jdk.nashorn.internal.objects.annotations.Property

@TupleConstructor
@ToString(includeFields = true, includeNames = true)
@EqualsAndHashCode(includeFields = true)
class User {
  @Property
    userName
  @Property
    userAge
  @Property
    userSex

}
