function fn() {
  var env = karate.env; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);


  if (!env) {
    env = 'test';
  }

   var config = {

//    api {
//          env: env,
//          api_base_url: 'https://ztrain-shop.herokuapp.com',
//          product: '61efb02b4e23dc71cab1331b'
//   }
//      web: {
//             navigateur: {type: 'chrome'},
//             webUrl:'https://github.com/login',
//             zenityIntranetUrl: 'https://intranet-test.zenity-test.fr',
//             identifiant: 'tgalarneau@zenity.fr',
//             motdepasse: 'Motdepasse1',
//             nom: 'Galarneau'
//             },

//     mobile: {
//        driverCaps: {
//          "platformName": "Android",
//         "platformVersion": "9.0",
//          "deviceName": "emulator-5554",
//          "browserName": "Chrome",
//          "connectHardwareKeyboard": true
//       }
//      }
    }

//  if (env == 'dev') {
//    // customize
//    // e.g. config.foo = 'bar';
//  } else if (env == 'e2e') {
//    // customize
//  }
//var result = karate.callSingle('classpath:com/ztrain_api/user/login.feature@TEST_OF-704', config);
//  config.authInfo = { token: result.resp.token, user: result.resp.user._id };

  karate.configure('report', { showLog: true, showAllSteps: false } );
  karate.log('environnement utilisé pour ce test :', env);

      var result = karate.callSingle('classpath:api/Ztrain/ZTrainFunctional.feature@login', config);
      config.authInfo = { token: result.response.token , user: result.response.user._id };
  return config;
}