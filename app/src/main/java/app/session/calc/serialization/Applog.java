package app.session.calc.serialization;


import com.google.gson.annotations.SerializedName;

public class Applog {


    private long eventid;
    private String timestamp;
    private String guid;
    private String user;
    private String pooluser;
    public Applog() {
    }
    public long getEventid() {
        return eventid;
    }
    public void setEventid(long eventid) {
        this.eventid = eventid;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public String getGuid() {
        return guid;
    }
    public void setGuid(String guid) {
        this.guid = guid;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPooluser() {
        return pooluser;
    }
    public void setPooluser(String pooluser) {
        this.pooluser = pooluser;
    }

    
}
