/**
 * Created by elena on 11.05.2017.
 */
public class Park {
    private  int HeigthPk;
    private  int WidthPk;
    private  String namePk;

    public Park(int heigthPk, int widthPk, String namePk) {
        HeigthPk = heigthPk;
        WidthPk = widthPk;
        this.namePk = namePk;
    }

    public int getHeigthPk() {
        return HeigthPk;
    }

    public int getWidthPk() {
        return WidthPk;
    }

    public String getNamePk() {
        return namePk;
    }

    @Override
    public String toString() {
        return "Park{" +
                "'" + namePk + '\'' +
                '}';
    }
    public int calcVal(){
        return HeigthPk*WidthPk;
    }
}
