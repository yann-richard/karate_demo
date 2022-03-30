Feature:

  Background:
    * configure driver = { type: 'chrome', showDriverLog: true }
#    * configure driver = { type: 'chrome' }
    # * configure driverTarget = { docker: 'ptrthomas/karate-chrome', showDriverLog: true }
  # * configure driverTarget = { docker: 'justinribeiro/chrome-headless', showDriverLog: true }
  # * configure driverTarget = { docker: 'ptrthomas/karate-chrome', showDriverLog: true }
  # * configure driver = { type: 'chromedriver', showDriverLog: true }
  # * configure driver = { type: 'geckodriver', showDriverLog: true }
  # * configure driver = { type: 'safaridriver', showDriverLog: true }
  # * configure driver = { type: 'iedriver', showDriverLog: true, httpConfig: { readTimeout: 120000 } }

  Scenario: try to login to github and then do a google search

    Given driver 'https://github.com/login'
    And input('#login_field', 'dummy')
    And input('#password', 'world')
    When submit().click("input[name=commit]")
    Then match html('.flash-error') contains 'Incorrect username or password.'

    Given driver 'https://google.com'
    And input("input[name=q]", 'karate dsl')
    When submit().click("input[name=btnI]")
    Then waitForUrl('https://github.com/intuit/karate')




  Scenario: google search, land on the karate github page, and search for a file

    Given driver 'https://google.com'
    And input('input[name=q]', 'karate dsl')
    When click('input[name=btnI]')
    Then waitForUrl('https://github.com/intuit/karate')

    When click('{a}Go to file')
    And def searchField = waitFor('input[name=query]')
    Then match driver.url == 'https://github.com/intuit/karate/find/master'

    When searchField.input('karate-logo.png')
    And def innerText = function(locator){ return scriptAll(locator, '_.innerText') }
#    And def searchFunction = function() { var results = innerText('.js-tree-browser-result-path'); return results.size() == 2 ? results : null;}

    And def searchResults = waitUntil(searchFunction)
    Then match searchResults contains 'karate-core/src/main/resources/karate-logo.png'