package cz.wmp.cordovaunity;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cz.wmp.geofun.UnityPlayerActivity;
/**
 * This class echoes a string called from JavaScript.
 */
public class CordovaUnity extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("launchUnity")) {
            String message = args.getString(0);
            this.launchUnity(message, callbackContext);
            return true;
        }
        return false;
    }

    private void launchUnity(String message, CallbackContext callbackContext) {
        Context context=this.cordova.getActivity().getApplicationContext();
        Intent i = new Intent(context, UnityPlayerActivity.class);
        this.cordova.getActivity().startActivity(i);
    }
}
