package m_mehdi;
import java.util.*;

public class Information {
    Scanner scanner = new Scanner(System.in);
    String singerName;
    int publishYear;



    public Information() {
        singerName = new String();
        publishYear = 0;

    }
    public void setSingerName(String singer) {
        singerName = singer;

    }
    public String  getSingerName() {
        return singerName;
    }
    public void setPublishYear(int num) {
        publishYear = num;
    }
    public Integer getPublishYear() {
        return publishYear;
    }
    public void print() {
        System.out.println(getSingerName());
        System.out.println(getPublishYear());
    }













}
