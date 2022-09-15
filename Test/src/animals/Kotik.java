package animals;

public class Kotik {

    private String name;
    private String voice;
    private int satiety;
    private int weight;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }
    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int count = 0;
    static final int METHODS = 5;

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        ++count;
    }
    public Kotik() {
        this.name = "Том";
        this.voice = "Мяу";
        this.satiety = 0;
        this.weight = 0;
        count++;
    }
    public boolean play () {
        if (this.satiety > 0){
            this.satiety--;
            return true;
        }
        else
            return false;
    }

    public boolean sleep () {
        if (this.satiety > 0){
            this.satiety--;
            return true;
        }
        else
            return false;
    }

    public boolean wash () {
        if (this.satiety > 0){
            this.satiety--;
            return true;
        }
        else
            return false;
    }

    public boolean walk () {
        if (this.satiety > 0){
            this.satiety--;
            return true;
        }
        else
            return false;
    }

    public boolean hunt () {
        if (this.satiety > 0){
            this.satiety--;
            return true;
        }
        else
            return false;
    }

    public void eat (int satiety) {
        this.satiety = + satiety;

    }
    public void eat (int satiety, String food) {
        this.satiety = + satiety;

    }

    public void eat () {
        this.eat((int) (Math.random() * METHODS) + 1, "Сухой корм ");

    }

    public String[] liveAnotherDay() {
        String[] result;
        result = new String[24];
        for (int i = 0; i < 24; i++) {
            int k = (int) (Math.random() * METHODS) + 1;
            switch (k) {
                case 1:
                    if (this.play()) {
                        result[i] = "Час " + i + ": Кот играл  ";
                    } else {
                        this.eat();
                        result[i] = "Час " + i + ": Кот голоден. Накормите его";
                    };
                    break;
                case 2:
                    if (this.sleep()) {
                        result[i] = "Час " + i + ": Кот спит ";
                    } else {
                        this.eat();
                        result[i] = "Час " + i + ": Кот голоден. Накормите его";
                    };
                    break;
                case 3:
                    if (this.wash()) {
                        result[i] = "Час " + i + ": Кот умывается  ";
                    } else {
                        this.eat();
                        result[i] = "Час " + i + ": Кот голоден. Накормите его";
                    };
                    break;
                case 4:
                    if (this.walk()) {
                        result[i] = "Час " + i + ": Кот гуляет  ";
                    } else {
                        this.eat();
                        result[i] = "Час " + i + ": Кот голоден. Накормите его";
                    };
                    break;
                case 5:
                    if (this.hunt()) {
                        result[i] = "Час " + i + ": Кот охотится   ";
                    } else {
                        this.eat();
                        result[i] = "Час " + i + ": Кот голоден. Накормите его";
                    };
                    break;
            }
        }
        return result;
    }

}


