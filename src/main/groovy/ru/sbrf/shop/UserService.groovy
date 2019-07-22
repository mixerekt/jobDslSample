package ru.sbrf.shop

class UserService {

  User getRandomUser() {
    return new User(userName: 'Artem', userAge: 19, userSex: true)
  }
}
