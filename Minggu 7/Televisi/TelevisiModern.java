package Televisi;

public class TelevisiModern extends Televisi {
    
    static String teletex = "Teletex";
    static String televisi = "Televisi";
    String cd;
    
    public TelevisiModern(String names, int channelLength) {
        super(names, channelLength);
    }
    
    public void setModusTampilan(String tampilan){
        teletex = tampilan;
    }
    
    public void getModusTampilan(){
        System.out.println("Modus tampilan : " + teletex);
    }
    
    void setHalamanTeletext(int page) {
        System.out.println("Berpindah ke halaman Teletext "+ page);
    }
    
    void setDiscTray(String cd) {
        this.cd = cd;
    }
    
    public void playCD(){
        if (cd == null)
            System.out.println("Tidak ada CD di dalam disc tray!");
        else
            System.out.println("Memutar film " + cd);
    }
}
