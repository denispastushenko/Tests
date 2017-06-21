
package apacheHttpComponents.jsonfiles;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultData {

    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("logging_page_id")
    @Expose
    private String loggingPageId;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLoggingPageId() {
        return loggingPageId;
    }

    public void setLoggingPageId(String loggingPageId) {
        this.loggingPageId = loggingPageId;
    }

}
