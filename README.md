# Modified
Webrtcpeer-Android
=================
* Update webrtc library to [1.0.32006](https://bintray.com/beta/#/google/webrtc/google-webrtc?tab=overview)

# Reference
* [WebRTC Official Android Demo](https://webrtc.googlesource.com/src/+/master/examples/androidapp/)
# Some main api changes when upgrade
## VideoRender
* https://stackoverflow.com/questions/51981065/webrtc-cant-find-videorenderergui
* https://stackoverflow.com/questions/50291497/local-video-renderer-in-android-webrtc

## PeerConnectionFactory 
## MediaStreamTrack(VideoTrack and AudioTrack)
## ......
## You can find the useage of these main changes in [PeerConnectionClient.java](https://webrtc.googlesource.com/src/+/master/examples/androidapp/src/org/appspot/apprtc/PeerConnectionClient.java)


# Source Of This Repo
## webrtcpeer-android(https://github.com/nhancv/nc-android-webrtcpeer)
[![](https://jitpack.io/v/nhancv/nc-android-webrtcpeer.svg)](https://jitpack.io/#nhancv/nc-android-webrtcpeer)

This repository contains an Android library for creating WebRTC connections.

Support:

    1. AppRtc (https://appr.tc/): https://github.com/njovy/AppRTCDemo
    
    2. Kurento (tested with call, composite, recorder): https://www.kurento.org



