// ابحث عن دالة showLink واستبدلها بهذا:
public void showLink() {
    TextBox t = new TextBox("Link", "", 200, 4); // 4 تعني URL
    t.setString("http://www.youtube.com/watch?v=" + video.videoId + (video.fromPlaylist ? "&list=" + video.playlistId : ""));
    t.addCommand(backCommand);
    t.setCommandListener(this);
    ui.display(t);
}
