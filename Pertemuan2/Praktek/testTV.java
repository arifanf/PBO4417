public class testTV {
    public static void main(String[] args) {
        // PRAKTIK 1 : Class TV
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
        
        // PRAKTIK 2 : Class Manusia
        Manusia man1 = new Manusia("Erik");
        System.out.println(man1.namaSaya()); // Erik

        TV tvku = new TV();
        man1.beliTV(tvku);
        man1.cekTV();
        System.out.println(man1.punyaTV); // true

        man1.jualSemuaTV();
        man1.cekTV();
        System.out.println(man1.punyaTV); // false
    }
}

class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    TV() {
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if ( on && newChannel >= 1 && newChannel <= 120 ) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if ( on && newVolumeLevel >= 1 && newVolumeLevel <= 7 ) {
            volumeLevel = newVolumeLevel;
        }
    }

    public void channelUp() {
        if ( on && channel < 120) {
            channel = ++channel;
        }
    }

    public void channelDown() {
        if ( on && channel > 1) {
            channel = --channel;
        }
    }

    public void volumeUp() {
        if ( on && volumeLevel < 7) {
            volumeLevel = ++volumeLevel;
        }
    }

    public void volumeDown() {
        if ( on && volumeLevel > 1) {
            volumeLevel = --volumeLevel;
        }
    }
}

class Manusia {
    String nama;
    boolean punyaTV;

    Manusia () {
    }

    Manusia (String nama) {
        this.nama = nama;
    }

    String namaSaya() {
        return nama;
    }
    
    public void beliTV(TV tvku) {
        punyaTV = true;
    }

    public void jualSemuaTV() {
        punyaTV = false;
    }

    boolean cekTV() {
        return punyaTV;
    }
}

