var exec = require('cordova/exec');

exports.launchUnity = function(arg0, success, error) {
    exec(success, error, "CordovaUnity", "launchUnity", [arg0]);
};
