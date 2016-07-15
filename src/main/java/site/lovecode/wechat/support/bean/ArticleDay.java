package site.lovecode.wechat.support.bean;


import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Date;


public class ArticleDay implements  Serializable {

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 微信公众账号基本信息id
	 */
	private Long officialAccountId;

	/**
	 * 数据的日期
	 */

	private Date refDate;

	/**
	 * 图文页（点击群发图文卡片进入的页面）的阅读人数
	 */

	private Integer intPageReadUser;

	/**
	 * 图文页的阅读次数
	 */

	private Integer intPageReadCount;

	/**
	 * 原文页（点击图文页“阅读原文”进入的页面）的阅读人数，无原文页时此处数据为0
	 */

	private Integer oriPageReadUser;

	/**
	 * 原文页的阅读次数
	 */
	private Integer oriPageReadCount;

	/**
	 * 分享的人数
	 */

	private Integer shareUser;

	/**
	 * 分享的次数
	        
	 */

	private Integer shareCount;

	/**
	 * 收藏的人数
	 */

	private Integer addToFavUser;

	/**
	 * 收藏的次数
	 */

	private Integer addToFavCount;

	private static final long serialVersionUID = 1L;


	/**
	 * 获取主键
	 *
	 * @return id - 主键
	 */

	public Long getId() {
		return id;
	}


	/**
	 * 设置主键
	 *
	 * @param id 主键
	 */
	public void setId( Long id ) {
		this.id = id;
	}


	/**
	 * 获取微信公众账号基本信息id
	 *
	 * @return officialAccountId - 微信公众账号基本信息id
	 */
	public Long getOfficialAccountId() {
		return officialAccountId;
	}


	/**
	 * 设置微信公众账号基本信息id
	 *
	 * @param officialAccountId 微信公众账号基本信息id
	 */
	public void setOfficialAccountId( Long officialAccountId ) {
		this.officialAccountId = officialAccountId;
	}


	/**
	 * 获取数据的日期
	 *
	 * @return refDate - 数据的日期
	 */
	public Date getRefDate() {
		return refDate;
	}


	/**
	 * 设置数据的日期
	 *
	 * @param refDate 数据的日期
	 */
	@JSONField( name = "ref_date" )
	public void setRefDate( Date refDate ) {
		this.refDate = refDate;
	}


	/**
	 * 获取图文页（点击群发图文卡片进入的页面）的阅读人数
	 *
	 * @return intPageReadUser - 图文页（点击群发图文卡片进入的页面）的阅读人数
	 */
	public Integer getIntPageReadUser() {
		return intPageReadUser;
	}


	/**
	 * 设置图文页（点击群发图文卡片进入的页面）的阅读人数
	 *
	 * @param intPageReadUser 图文页（点击群发图文卡片进入的页面）的阅读人数
	 */

	@JSONField( name = "int_page_read_user" )
	public void setIntPageReadUser( Integer intPageReadUser ) {
		this.intPageReadUser = intPageReadUser;
	}


	/**
	 * 获取图文页的阅读次数
	 *
	 * @return intPageReadCount - 图文页的阅读次数
	 */
	public Integer getIntPageReadCount() {
		return intPageReadCount;
	}


	/**
	 * 设置图文页的阅读次数
	 *
	 * @param intPageReadCount 图文页的阅读次数
	 */
	@JSONField( name = "int_page_read_count" )
	public void setIntPageReadCount( Integer intPageReadCount ) {
		this.intPageReadCount = intPageReadCount;
	}


	/**
	 * 获取原文页（点击图文页“阅读原文”进入的页面）的阅读人数，无原文页时此处数据为0
	 *
	 * @return oriPageReadUser - 原文页（点击图文页“阅读原文”进入的页面）的阅读人数，无原文页时此处数据为0
	 */
	public Integer getOriPageReadUser() {
		return oriPageReadUser;
	}


	/**
	 * 设置原文页（点击图文页“阅读原文”进入的页面）的阅读人数，无原文页时此处数据为0
	 *
	 * @param oriPageReadUser 原文页（点击图文页“阅读原文”进入的页面）的阅读人数，无原文页时此处数据为0
	 */
	@JSONField( name = "ori_page_read_user" )
	public void setOriPageReadUser( Integer oriPageReadUser ) {
		this.oriPageReadUser = oriPageReadUser;
	}


	/**
	 * 获取原文页的阅读次数
	 *
	 * @return oriPageReadCount - 原文页的阅读次数
	 */
	public Integer getOriPageReadCount() {
		return oriPageReadCount;
	}


	/**
	 * 设置原文页的阅读次数
	 *
	 * @param oriPageReadCount 原文页的阅读次数
	 */

	@JSONField( name = "ori_page_read_count" )
	public void setOriPageReadCount( Integer oriPageReadCount ) {
		this.oriPageReadCount = oriPageReadCount;
	}


	/**
	 * 获取分享的人数
	 *
	 * @return shareUser - 分享的人数
	 */
	public Integer getShareUser() {
		return shareUser;
	}


	/**
	 * 设置分享的人数
	 *
	 * @param shareUser 分享的人数
	 */
	@JSONField( name = "share_user" )
	public void setShareUser( Integer shareUser ) {
		this.shareUser = shareUser;
	}


	/**
	 * 获取分享的次数
	        
	 *
	 * @return shareCount - 分享的次数
	        
	 */
	public Integer getShareCount() {
		return shareCount;
	}


	/**
	 * 设置分享的次数
	        
	 *
	 * @param shareCount 分享的次数
	        
	 */
	@JSONField( name = "share_count" )
	public void setShareCount( Integer shareCount ) {
		this.shareCount = shareCount;
	}


	/**
	 * 获取收藏的人数
	 *
	 * @return addToFavUser - 收藏的人数
	 */
	public Integer getAddToFavUser() {
		return addToFavUser;
	}


	/**
	 * 设置收藏的人数
	 *
	 * @param addToFavUser 收藏的人数
	 */

	@JSONField( name = "add_to_fav_user" )
	public void setAddToFavUser( Integer addToFavUser ) {
		this.addToFavUser = addToFavUser;
	}


	/**
	 * 获取收藏的次数
	 *
	 * @return addToFavCount - 收藏的次数
	 */
	public Integer getAddToFavCount() {
		return addToFavCount;
	}


	/**
	 * 设置收藏的次数
	 *
	 * @param addToFavCount 收藏的次数
	 */
	@JSONField( name = "add_to_fav_count" )
	public void setAddToFavCount( Integer addToFavCount ) {
		this.addToFavCount = addToFavCount;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", officialAccountId=").append(officialAccountId);
		sb.append(", refDate=").append(refDate);
		sb.append(", intPageReadUser=").append(intPageReadUser);
		sb.append(", intPageReadCount=").append(intPageReadCount);
		sb.append(", oriPageReadUser=").append(oriPageReadUser);
		sb.append(", oriPageReadCount=").append(oriPageReadCount);
		sb.append(", shareUser=").append(shareUser);
		sb.append(", shareCount=").append(shareCount);
		sb.append(", addToFavUser=").append(addToFavUser);
		sb.append(", addToFavCount=").append(addToFavCount);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}
