package jtube;

public interface Constants {
	
	// تم تحويل الروابط لتعمل بدون تشفير لضمان التوافق مع نوكيا
	static final String invproxy = "http://nnp.nnchan.ru/invproxy.php";
	static final String iteroni = "http://yewtu.be/";
	static final String stream = "http://nnp.nnchan.ru/stream.php?url=";
	static final String glype = "http://nnp.nnchan.ru/glype/browse.php?u=";
	static final String updateurl = "http://nnp.nnchan.ru/jtubeupd.php";
	static final String vpb = "http://nnp.nnchan.ru/vpb.php";
	static final String vpb3 = "http://nnproject.cc/v.php?";
	static final String instancesurl = "http://nnp.nnchan.ru/jtubeinv.php";
	
	static final String CONFIG_RECORD_NAME = "ytconfig";
	
	static final int TRENDS_LIMIT = 20;
	static final int SEARCH_LIMIT = 25;
	static final int LATESTVIDEOS_LIMIT = 20;
	static final int PLAYLISTS_LIMIT = 30;
	static final int PLAYLIST_VIDEOS_LIMIT = 200;
	
	static final String NAME = "JTube";
	
	static final String userAgent = "Mozilla/5.0 (Windows NT 6.3; WOW64; rv:49.0) Gecko/20100101 Firefox/49.0";
	
	static final String VIDEO_EXTENDED_FIELDS = "title,videoId,author,authorId,description,videoCount,publishedText,lengthSeconds,likeCount,viewCount,subCount";
	static final String CHANNEL_EXTENDED_FIELDS = "subCount,author,authorId,totalViews";
	static final String PLAYLIST_EXTENDED_FIELDS = "videos(author,title,videoId,lengthSeconds)";
}
