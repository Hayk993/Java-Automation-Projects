package homework.task24;

public class City implements Comparable<City> {
    String country;
    String region;
    private String name;

    public City(String country, String region, String name) {
        this.country = country;
        this.region = region;
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public int compareTo(City o) {
        int countryCompare = this.country.compareTo(o.country);

        if (countryCompare != 0) {
            return countryCompare;
        }
        int regionCompare = this.region.compareTo(o.region);

        if (regionCompare != 0) {
            return regionCompare;
        }
        return this.name.compareTo(o.name);
    }
}
