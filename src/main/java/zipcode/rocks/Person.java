package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String favoriteBeverage;
    private String favoriteColor;
    private String birthMonth;
    private boolean havePets;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }


    public String getFirstname() {
        return firstname;
    }

    public String setFirstname(String firstname) {
        this.firstname = firstname;
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String setLastname(String lastname) {
        this.lastname = lastname;
        return lastname;
    }

    public String toString() {
        return this.lastname + ", " + this.firstname;
    }

    public boolean getHavePets() {
        return havePets;
    }

    public void setHavePets(boolean havePets) {
        this.havePets = havePets;
    }

    public String getBirthMonth() {
        return birthMonth;
    }
    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }


    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public String getFavoriteBeverage() {
        return favoriteBeverage;
    }

    public void setFavoriteBeverage(String favoriteColor) {
        this.favoriteBeverage = favoriteBeverage;
    }
}
