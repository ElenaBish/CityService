/**
 * Created by elena on 11.05.2017.
 */
public class Street {
    private int HeigthSt;
    private  int WidthSt;
    private String nameSt;

    public Street(int heigthSt, int widthSt, String nameSt) {
        HeigthSt = heigthSt;
        WidthSt = widthSt;
        this.nameSt = nameSt;
    }

    public int getHeigthSt() {
        return HeigthSt;
    }

    public int getWidthSt() {
        return WidthSt;
    }

    public String getNameSt() {
        return nameSt;
    }

    @Override
    public String toString() {
        return "Street{" +
                "'" + nameSt + '\'' +
                '}';
    }
    public int calcVal(){
        return HeigthSt*WidthSt;
    }
}
