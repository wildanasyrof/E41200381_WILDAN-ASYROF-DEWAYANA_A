package Televisi;

public class Televisi {

    private String names;
    private int channelLength, channelAktif;
    String[] Channels = new String[channelLength];
    
    Televisi(final String names, final int channelLength){
        this.names = names;
        this.channelLength = channelLength;
    }

    String getDeskripsi() {
        return names;
    }
    
    public void getChannels(){
        if(Channels.length == 0)
            System.out.println("Belum ada channel yang diset!");
    }
    
    public void setChannel(String[] SemuaChannel){
        if (SemuaChannel.length > channelLength)
            System.out.println("Maaf, TV ini hanya dapat menyimpan " + channelLength + " Channel");
        else 
            Channels = SemuaChannel;
            System.out.println("Informasi channel berhasil diupdate!");
    }
    
    public void setChannelAktif(int currentChannel){
        if (Channels.length == 0){
            System.out.println("Belum ada channel yang diset!");
        } else if (currentChannel >= Channels.length){
            System.out.println("Channel yang anda inginkan belum diset!");
        } else {
            channelAktif = currentChannel;
            int temp = currentChannel - 1;
            System.out.println("Pindah ke Channel : " + Channels[temp]);
        }
    }
    
    public void setVolume(int volume){
        System.out.println("Intensitas volume sekarang : " + volume + "%");
    }
}