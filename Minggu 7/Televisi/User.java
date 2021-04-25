package Televisi;

public class User {
    
    public static void main(String[] args){
        
        Televisi tv = new Televisi("TV Tempoe Doeloe, 14 inches", 10);
        String[] SemuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV", 
            "METRO TV", "TRANS TV", "TPI", "TV 7",
            "TVRI", "TV G"};
        
        System.out.println("Anda membeli Televisi : " + tv.getDeskripsi());
        
        tv.getChannels();
        tv.setChannel(SemuaChannel);
        tv.setChannelAktif(4);
        tv.setVolume(40);
        tv.setChannelAktif(39);
        tv.setChannelAktif(1);
        
    }
    
}
