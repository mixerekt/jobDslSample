package ru.sbrf.scripts

Scanner scanner = new Scanner(System.in)

def userName = scanner.nextLine()

def splitNames = { name -> name.toString().split('\\s') }

def filterNamesAndCapitalize = { names ->
  names.findAll { !it.isNumber() }.collect {
    it.replace(it[0], it[0].toUpperCase())
  }
}

def combo = { fun1, fun2, line -> fun2(fun1(line)) }

def finalCombo = combo.curry(splitNames, filterNamesAndCapitalize)

println "name = ${finalCombo(userName)}"
