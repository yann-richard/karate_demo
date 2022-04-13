Feature:


  Background:
    * url 'https://jsonplaceholder.typicode.com'

  Scenario: obtenir tous les utilisateurs puis le premier à l'aide de son id
    Given path 'users'
    When method get
    Then status 200
    * def first = response[0]
    Given path 'users', first.id
    When method get
    Then status 200

  Scenario: créer un utilisateur
    * def user =
      """
      {
        "name": "yann",
        "username": "yruser",
        "email": "yr@user.com",
        "address": {
          "street": "pk13",
          "suite": "Apt. 123",
          "city": "douala",
          "zipcode": "54621-8089"
        }
      }
      """
    Given url 'https://jsonplaceholder.typicode.com/users'
    And request user
    When method post
    Then status 201
    * print 'id crée : ', response.id
