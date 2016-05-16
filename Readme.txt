
1. When you run your app and rotate the device/emulator are the method displayed in the
TextView consistent with methods called in the log? If not explain why?


When I  run my app and rotate the device/emulator  the methods displayed in the textView is not consistent with methods called in the log.

****Reason for the inconsistent methods***
———————————————————————————————————————————————————————————————————————————=

This is because, in Android application, when I rotate the device then my Activity is destroyed and a new activity will be start (onCreate() is called).

To display a different layout,  but it has to create a new activity from scratch to do it.

Thus, Android destroys the current LogActivity on rotation and starts fresh to ensure that it has the resources that best match the new configuration.

***Example:*** Consider the case of launching this app.

The methods called on  on Portrait view are : onCreate, onStart ,onResume.

The methods called on Landscape  view(and is displayed on textview) are :onCreate, onStart ,onResume ,onRestoreInstanceState.

The methods called on Landscape  view(and is displayed on catLog) are :onPause, onSaveInstance,onStop,onDestroy,onCreate, onStart ,onRestoreInstanceState,onResume.

***Explanation for the methods call:***
—————————————————————————————————————————————————————————————————————————————————————
LogActivity needs to know the old value . You need a way to save this data across a runtime configuration change, like rotation.

*To save additional data about the activity state, you must override the onSaveInstanceState() callback method. 

The system calls this method when the user is leaving your activity and passes it the Bundle object that will be saved in the event that your activity is destroyed unexpectedly.
 
If the system must recreate the activity instance later, it passes the same Bundle object to both the onRestoreInstanceState() and onCreate() methods.

onSaveInstanceState() method is normally called by the system before onPause(), onStop(), and onDestroy().

*onPause,onStop,onDestroy are the methods called When the activity goes from foreground to doesn't exit stage.

*Restarting the app will call the methods: onCreate, onStart ,onResume
———————————————————————————————————————————————————————————————


