package advertisementMessage;

public class AdvertisementMessage {
    private String laudatoryPhrase;
    private String event;
    private String author;
    private String city;

    public AdvertisementMessage(String laudatoryPhrase,String event,String author,String city){
        this.laudatoryPhrase = laudatoryPhrase;
        this.event = event;
        this.author = author;
        this.city = city;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getCity() {
        return this.city;
    }

    public String getEvent() {
        return this.event;
    }

    public String getLaudatoryPhrase() {
        return this.laudatoryPhrase;
    }
}
