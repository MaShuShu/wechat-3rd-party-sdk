package site.lovecode.wechat.support.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/25.
 */
public enum MessageTypeEnum {

	text(1, "text"),

	img(2, "img"),

	voice(3, "voice"),

	video(4, "video"),

	news(5, "news");

	private final int key;

	// 枚举描述
	private final String desc;

	private static Map<String, Integer> map = new HashMap<>();

	static {
		for ( MessageTypeEnum messageTypeEnum : EnumSet.allOf(MessageTypeEnum.class) ) {
			map.put(messageTypeEnum.getDesc(), messageTypeEnum.getKey());
		}
	}


	MessageTypeEnum( final int key, final String desc ) {
		this.key = key;
		this.desc = desc;
	}


	public static MessageTypeEnum valueOf(int value ) {
		switch ( value ) {
			case 1 :
				return text;
			case 2 :
				return img;
			case 3 :
				return voice;
			case 4 :
				return video;
			case 5 :
				return news;
			default:
				return null;
		}
	}


	public int getKey() {
		return key;
	}


	public String getDesc() {
		return desc;
	}


	public static Integer getValue( String str ) {
		return map.get(str);
	}
}
