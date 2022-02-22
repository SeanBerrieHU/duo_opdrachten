public class Zwembad{

    private double breedte;
    private double lengte;
    private double diepte;
    private double inhoud;

    public Zwembad(double br, double le, double di) {
        this.breedte = br;
        this.lengte = le;
        this.diepte = di;
        this.inhoud = br*le*di;
    }

    // IF ZWEMBAD HAS EMPTY PARAMETERS
    public Zwembad(){}


    // SET FUNCTIONS
    public void setBreedte(double breedte){
        this.breedte = breedte;
    }

    public void setLengte(double lengte){
        this.lengte = lengte;
    }

    public void setDiepte(double diepte){
        this.diepte = diepte;
    }


    // GET FUNCTIONS
    public double getBreedte(){
        return this.breedte;
    }

    public double getLengte(){
        return this.lengte;
    }

    public double getDiepte(){
        return this.diepte;
    }

    public double getInhoud(){
        return this.inhoud;
    }

}