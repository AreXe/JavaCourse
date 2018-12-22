package lesson19strumienie;

public class Mieszkanie {
    private String miasto;
    private String dzielnica;
    private String ulica;
    private Integer pokoje;
    private Float powierzchnia;
    private Boolean piwnica;
    private Integer cena;

    public Mieszkanie(String miasto, String dzielnica, String ulica, Integer pokoje, Float powierzchnia, Boolean piwnica, Integer cena) {
        this.miasto = miasto;
        this.dzielnica = dzielnica;
        this.ulica = ulica;
        this.pokoje = pokoje;
        this.powierzchnia = powierzchnia;
        this.piwnica = piwnica;
        this.cena = cena;
    }

    public String getMiasto() {
        return miasto;
    }

    public String getDzielnica() {
        return dzielnica;
    }

    public String getUlica() {
        return ulica;
    }

    public Integer getPokoje() {
        return pokoje;
    }

    public Float getPowierzchnia() {
        return powierzchnia;
    }

    public Boolean getPiwnica() {
        return piwnica;
    }

    public Integer getCena() {
        return cena;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public void setDzielnica(String dzielnica) {
        this.dzielnica = dzielnica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setPokoje(Integer pokoje) {
        this.pokoje = pokoje;
    }

    public void setPowierzchnia(Float powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public void setPiwnica(Boolean piwnica) {
        this.piwnica = piwnica;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Mieszkanie{" +
                "miasto='" + miasto + '\'' +
                ", dzielnica='" + dzielnica + '\'' +
                ", ulica='" + ulica + '\'' +
                ", pokoje=" + pokoje +
                ", powierzchnia=" + powierzchnia +
                ", piwnica=" + piwnica +
                ", cena=" + cena +
                '}';
    }
}
