class Voetbalclub {

    private String naam;
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;
    private int aantalGespeeld;
    private int aantalPunten;
    
    public Voetbalclub(String clubnaam){
        this.naam = clubnaam;
        this.aantalGewonnen = 0;
        this.aantalVerloren = 0;
        this.aantalGelijk = 0;
        this.aantalGespeeld = 0;
        this.aantalPunten = 0;
    }

    public void verwerkResultaat(char ch) {

        this.aantalGespeeld = this.aantalGespeeld + 1;

        if (ch == 'w')
          this.aantalGewonnen = this.aantalGewonnen + 1;
        if (ch == 'g')
          this.aantalGelijk = this.aantalGelijk + 1;
        if (ch == 'v')
          this.aantalVerloren = this.aantalVerloren + 1;

    }

    // GET FUNCTIONS
    public int aantalGespeeld(){
        return this.aantalGespeeld;
    }

    public int aantalPunten(){
        this.aantalPunten = this.aantalGewonnen * 3 + this.aantalGelijk * 1;
        return this.aantalPunten;
    }

    public String toString() {
        return this.naam + " "  + this.aantalGespeeld + " " + this.aantalGewonnen + " " + this.aantalGelijk + " " + this.aantalVerloren + " " + this.aantalPunten;
    }
      
}