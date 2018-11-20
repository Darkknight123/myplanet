package org.ole.planet.myplanet.Data;

import com.github.kittinunf.fuel.android.core.Json;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.ole.planet.myplanet.utilities.JsonUtils;
import org.ole.planet.myplanet.utilities.Utilities;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class realm_courseProgress extends RealmObject {
    @PrimaryKey
    private String id;
    private String _id;
    private long createdOn;

    private String _rev;

    private int stepNum;

    private boolean passed;

    private String userId;

    private String courseId;

    private String parentCode;

    public static JsonObject serializeProgress( realm_courseProgress progress) {
        JsonObject object = new JsonObject();
        object.addProperty("userId", progress.getUserId());
        object.addProperty("parentCode", progress.getParentCode());
        object.addProperty("courseId", progress.getCourseId());
        object.addProperty("passed", progress.getPassed());
        object.addProperty("stepNum", progress.getStepNum());
        object.addProperty("createdOn", progress.getCreatedOn());
        return object;
    }

    public long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(long createdOn) {
        this.createdOn = createdOn;
    }

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
    }

    public int getStepNum() {
        return stepNum;
    }

    public void setStepNum(int stepNum) {
        this.stepNum = stepNum;
    }

    public boolean getPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
//
//    public static void insertCourseProgress(Realm mRealm, JsonObject act) {
//        realm_courseProgress courseProgress = mRealm.where(realm_courseProgress.class).equalTo("_id", JsonUtils.getString("_id", act)).findFirst();
//        if (courseProgress == null)
//            courseProgress = mRealm.createObject(realm_courseProgress.class, JsonUtils.getString("_id", act));
//        courseProgress.set_rev(JsonUtils.getString("_rev", act));
//        courseProgress.set_id(JsonUtils.getString("_id", act));
//        courseProgress.setPassed(JsonUtils.getString("passed", act));
//        courseProgress.setStepNum(JsonUtils.getString("stepNum", act));
//        courseProgress.setUserId(JsonUtils.getString("userId", act));
//        courseProgress.setParentCode(JsonUtils.getString("parentCode", act));
//        courseProgress.setCreatedOn(JsonUtils.getString("createdOn", act));
//    }

}