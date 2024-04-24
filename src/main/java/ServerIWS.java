import jakarta.xml.ws.Endpoint;

public class ServerIWS {
    public static void main(String[] args){
        String url = "http://0.0.0.0:8085/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web Service publié sur l'url suivant : "+url);
    }
}
