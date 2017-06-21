
package apacheHttpComponents.jsonfiles;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("biography")
    @Expose
    private String biography;
    @SerializedName("blocked_by_viewer")
    @Expose
    private Boolean blockedByViewer;
    @SerializedName("country_block")
    @Expose
    private Boolean countryBlock;
    @SerializedName("external_url")
    @Expose
    private String externalUrl;
    @SerializedName("external_url_linkshimmed")
    @Expose
    private String externalUrlLinkshimmed;
    @SerializedName("followed_by")
    @Expose
    private FollowedBy followedBy;
    @SerializedName("followed_by_viewer")
    @Expose
    private Boolean followedByViewer;
    @SerializedName("follows")
    @Expose
    private Follows follows;
    @SerializedName("follows_viewer")
    @Expose
    private Boolean followsViewer;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("has_blocked_viewer")
    @Expose
    private Boolean hasBlockedViewer;
    @SerializedName("has_requested_viewer")
    @Expose
    private Boolean hasRequestedViewer;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("is_private")
    @Expose
    private Boolean isPrivate;
    @SerializedName("is_verified")
    @Expose
    private Boolean isVerified;
    @SerializedName("profile_pic_url")
    @Expose
    private String profilePicUrl;
    @SerializedName("profile_pic_url_hd")
    @Expose
    private String profilePicUrlHd;
    @SerializedName("requested_by_viewer")
    @Expose
    private Boolean requestedByViewer;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("connected_fb_page")
    @Expose
    private Object connectedFbPage;
    @SerializedName("media")
    @Expose
    private Media media;

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public Boolean getBlockedByViewer() {
        return blockedByViewer;
    }

    public void setBlockedByViewer(Boolean blockedByViewer) {
        this.blockedByViewer = blockedByViewer;
    }

    public Boolean getCountryBlock() {
        return countryBlock;
    }

    public void setCountryBlock(Boolean countryBlock) {
        this.countryBlock = countryBlock;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public String getExternalUrlLinkshimmed() {
        return externalUrlLinkshimmed;
    }

    public void setExternalUrlLinkshimmed(String externalUrlLinkshimmed) {
        this.externalUrlLinkshimmed = externalUrlLinkshimmed;
    }

    public FollowedBy getFollowedBy() {
        return followedBy;
    }

    public void setFollowedBy(FollowedBy followedBy) {
        this.followedBy = followedBy;
    }

    public Boolean getFollowedByViewer() {
        return followedByViewer;
    }

    public void setFollowedByViewer(Boolean followedByViewer) {
        this.followedByViewer = followedByViewer;
    }

    public Follows getFollows() {
        return follows;
    }

    public void setFollows(Follows follows) {
        this.follows = follows;
    }

    public Boolean getFollowsViewer() {
        return followsViewer;
    }

    public void setFollowsViewer(Boolean followsViewer) {
        this.followsViewer = followsViewer;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getHasBlockedViewer() {
        return hasBlockedViewer;
    }

    public void setHasBlockedViewer(Boolean hasBlockedViewer) {
        this.hasBlockedViewer = hasBlockedViewer;
    }

    public Boolean getHasRequestedViewer() {
        return hasRequestedViewer;
    }

    public void setHasRequestedViewer(Boolean hasRequestedViewer) {
        this.hasRequestedViewer = hasRequestedViewer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getProfilePicUrlHd() {
        return profilePicUrlHd;
    }

    public void setProfilePicUrlHd(String profilePicUrlHd) {
        this.profilePicUrlHd = profilePicUrlHd;
    }

    public Boolean getRequestedByViewer() {
        return requestedByViewer;
    }

    public void setRequestedByViewer(Boolean requestedByViewer) {
        this.requestedByViewer = requestedByViewer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getConnectedFbPage() {
        return connectedFbPage;
    }

    public void setConnectedFbPage(Object connectedFbPage) {
        this.connectedFbPage = connectedFbPage;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

}
