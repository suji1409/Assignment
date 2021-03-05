package assessments.day2;

public class College{
Engg eng;
Arts arts;

    public Engg getEng() {
        return eng;
    }

    public void setEng(Engg eng) {
        this.eng = eng;
    }

    public Arts getArts() {
        return arts;
    }

    public void setArts(Arts arts) {
        this.arts = arts;
    }
}

class Engg extends Library{
    private String lab;




    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }
}

class Arts extends Library{


    private String music;

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }
}