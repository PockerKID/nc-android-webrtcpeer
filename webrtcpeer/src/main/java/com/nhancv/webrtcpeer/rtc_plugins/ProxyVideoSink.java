package com.nhancv.webrtcpeer.rtc_plugins;

import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

import timber.log.Timber;

/**
 * ProxyVideoSink
 * <p>
 * Date: 2020/9/2/0002 9:55
 * Description:
 *
 * @author z
 * @version 1.0.0
 */
public class ProxyVideoSink implements VideoSink {
    private VideoSink target;

    @Override
    synchronized public void onFrame(VideoFrame frame) {
        if (target == null) {
            Timber.tag("ProxyVideoSink").d("Dropping frame in proxy because target is null.");
            return;
        }
        target.onFrame(frame);
    }

    synchronized public void setTarget(VideoSink target) {
        this.target = target;
    }
}
