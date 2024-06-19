public interface WhatsappCalls {
    void calls();
    void mute();
    void disconnect();
}

class AudioCall implements WhatsappCalls{
    public void calls(){
        System.out.println("whatsApp Audio Call...!");
    }

    public void mute() {
        System.out.println("Audio call Muted...!");
    }

    public void disconnect() {
        System.out.println("Audio Call Disconected..!");
    }
}

class Vediocall implements WhatsappCalls{
    public void calls(){
        System.out.println("whatsApp Vedio Call...!");
    }

    public void mute() {
        System.out.println("Vedio call Muted...!");
    }

    public void disconnect() {
        System.out.println("Vediocall Disconected..!");
    }
}
