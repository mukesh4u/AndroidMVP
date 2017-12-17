package android.developer.solutions.androidmvp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Create by: Mukesh Yadav
 * www.androiddevelopersolutions.com
 */
public class Result {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("alpha2_code")
    @Expose
    private String alpha2Code;
    @SerializedName("alpha3_code")
    @Expose
    private String alpha3Code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

}