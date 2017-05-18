package com.attackt.music;


/**
 * 定义音乐回放时一系列状态变化时的回调接口
 *
 * @author mh
 */
public interface OnPlaybackStateChangeListener {
    /**
     * 音乐开始播放时调用此方法
     */
    public abstract void onMusicPlayed();

    /**
     * 音乐播放停止时调用此方法
     */
    public abstract void onMusicPaused();

    /**
     * 音乐播放暂停时调用此方法
     */
    public abstract void onMusicStopped();

    /**
     * 播放新的歌曲时调用此方法
     *
     * @param playingSong 新的歌曲信息
     */
    public abstract void onPlayNewSong(MusicData playingSong);

    /**
     * 播放的音乐进度改变时调用此方法
     *
     * @param currentMillis 当前播放进度 （已播放的毫秒数）
     */
    public abstract void onPlayProgressUpdate(int currentMillis);
}
