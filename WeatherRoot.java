package jdbcdemo.Accuweather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherRoot {
    private String dateTime;

    private long epochDateTime;

    private long weatherIcon;

    private String iconPhrase;

    private boolean hasPrecipitation;

    private String precipitationType;

    private String precipitationIntensity;

    private boolean isDaylight;

    private Temperature temperature;

    private long precipitationProbability;

    private String mobileLink;

    private String link;

    public WeatherRoot(String dateTime, long epochDateTime, long weatherIcon, String iconPhrase, boolean hasPrecipitation, String precipitationType, String precipitationIntensity, boolean isDaylight, Temperature temperature, long precipitationProbability, String mobileLink, String link) {
        this.dateTime = dateTime;
        this.epochDateTime = epochDateTime;
        this.weatherIcon = weatherIcon;
        this.iconPhrase = iconPhrase;
        this.hasPrecipitation = hasPrecipitation;
        this.precipitationType = precipitationType;
        this.precipitationIntensity = precipitationIntensity;
        this.isDaylight = isDaylight;
        this.temperature = temperature;
        this.precipitationProbability = precipitationProbability;
        this.mobileLink = mobileLink;
        this.link = link;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public long getEpochDateTime() {
        return epochDateTime;
    }

    public void setEpochDateTime(long epochDateTime) {
        this.epochDateTime = epochDateTime;
    }

    public long getWeatherIcon() {
        return weatherIcon;
    }

    public void setWeatherIcon(long weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    public String getIconPhrase() {
        return iconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }

    public boolean isHasPrecipitation() {
        return hasPrecipitation;
    }

    public void setHasPrecipitation(boolean hasPrecipitation) {
        this.hasPrecipitation = hasPrecipitation;
    }


    public void setPrecipitationIntensity(String precipitationIntensity) {
        this.precipitationIntensity = precipitationIntensity;
    }

    public boolean isIsDaylight() {
        return isDaylight;
    }

    public void setIsDaylight(boolean isDaylight) {
        this.isDaylight = isDaylight;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public long getPrecipitationProbability() {
        return precipitationProbability;
    }

    public void setPrecipitationProbability(long precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }

    public String getMobileLink() {
        return mobileLink;
    }

    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    public String getPrecipitationType() {

        return precipitationType;
    }

    public void setPrecipitationType(String precipitationType) {
        this.precipitationType = precipitationType;
    }

    public String getPrecipitationIntensity(){
        this.precipitationIntensity = precipitationType;

        return null;
    }

    public String getPrecipitationIntensity(String precipitationIntensity){
        return precipitationIntensity;
    }

    public static String convertTime(String inputTime) throws ParseException {
        SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date = null;
        date = inFormat.parse(inputTime);

        SimpleDateFormat outFormat = new SimpleDateFormat();
        String goal = outFormat.format(date);
        return goal;
    }
    public  static void main(String []args) throws ParseException {
        System.out.println(convertTime("2022-05-15T17:00:00+07:00"));
    }


}
