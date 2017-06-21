
package apacheHttpComponents.jsonfiles;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Node {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("comments_disabled")
    @Expose
    private Boolean commentsDisabled;
    @SerializedName("dimensions")
    @Expose
    private Dimensions dimensions;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("thumbnail_src")
    @Expose
    private String thumbnailSrc;
    @SerializedName("is_video")
    @Expose
    private Boolean isVideo;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("date")
    @Expose
    private Integer date;
    @SerializedName("display_src")
    @Expose
    private String displaySrc;
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("comments")
    @Expose
    private Comments comments;
    @SerializedName("likes")
    @Expose
    private Likes likes;
    @SerializedName("video_views")
    @Expose
    private Integer videoViews;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getCommentsDisabled() {
        return commentsDisabled;
    }

    public void setCommentsDisabled(Boolean commentsDisabled) {
        this.commentsDisabled = commentsDisabled;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getThumbnailSrc() {
        return thumbnailSrc;
    }

    public void setThumbnailSrc(String thumbnailSrc) {
        this.thumbnailSrc = thumbnailSrc;
    }

    public Boolean getIsVideo() {
        return isVideo;
    }

    public void setIsVideo(Boolean isVideo) {
        this.isVideo = isVideo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getDisplaySrc() {
        return displaySrc;
    }

    public void setDisplaySrc(String displaySrc) {
        this.displaySrc = displaySrc;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    public Integer getVideoViews() {
        return videoViews;
    }

    public void setVideoViews(Integer videoViews) {
        this.videoViews = videoViews;
    }

}
