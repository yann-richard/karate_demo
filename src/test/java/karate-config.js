function fn() {
  var env = karate.env; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);

  if (!env) {
    env = 'test';
  }

   var config = {
      web: {
//        navigateur: {type: 'chrome'},
//        zenityIntranetUrl: 'https://intranet-test.zenity-test.fr',
//        identifiant: 'tgalarneau@zenity.fr',
//        motdepasse: 'Motdepasse1',
//        nom: 'Galarneau'
      },
      mobile: {
//        driverCaps: {
//          "platformName": "Android",
//          "platformVersion": "9.0",
//          "deviceName": "emulator-5554",
//          "browserName": "Chrome",
//          "connectHardwareKeyboard": true
//        }
      }
    }
// var result = karate.callSingle('classpath:com/ztrain_api/user/login.feature@TEST_OF-704', config);
//  config.authInfo = { token: result.resp.token, user: result.resp.user._id };

//  if (env == 'dev') {
//    // customize
//    // e.g. config.foo = 'bar';
//  } else if (env == 'e2e') {
//    // customize
//  }
  return config;
}