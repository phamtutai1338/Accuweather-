package jdbcdemo.Accuweather;

public class Root {
    private Headline headline;

    public Root(Headline headline) {
        this.headline = headline;
    }

    public Headline getHeadline() {
        return headline;
    }

    public void setHeadline(Headline headline) {
        this.headline = headline;
    }
}
