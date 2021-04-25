package Televisi;

public class UserTvModern {
    
    public static void main(String[] args){
        
        TelevisiModern tv = new TelevisiModern("Xiaomi TV, 30 inches", 60);
        String[] SemuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV", 
            "METRO TV", "TRANS TV", "TPI", "TV 7",
            "TVRI", "TV G"};
        
        System.out.println("Anda membeli Televisi : " + tv.getDeskripsi());
        
        tv.getChannels();
        tv.setChannel(SemuaChannel);
        tv.setChannelAktif(3);
        tv.setVolume(40);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
        tv.setModusTampilan(TelevisiModern.teletex);
        tv.setHalamanTeletext(250);
        tv.setModusTampilan(TelevisiModern.televisi);
        tv.getModusTampilan();
        tv.playCD();
        tv.setDiscTray("91 Days");
        tv.playCD();
        
    }
    
}
