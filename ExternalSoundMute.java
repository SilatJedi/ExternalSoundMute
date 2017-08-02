/*I was able to disable the hardware default back button sound with this solution.*/

@override
public void onResume(){
    super.onResume();
    AudioManager mgr = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
    mgr.setStreamMute(AudioManager.STREAM_SYSTEM, true);
}


@override
public void onPause(){
    super.onPause();
    AudioManager mgr = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
    mgr.setStreamMute(AudioManager.STREAM_SYSTEM, false);
}
