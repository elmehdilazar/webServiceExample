import proxy.BangueWs;
import proxy.BanqueService;
import proxy.Compte;

public class ClientWs {
    public static void main(String[] args) {
        BanqueService stub=new BangueWs().getBanqueServicePort();
        System.out.println(stub.convert(7600));
        Compte cp=stub.getCompte(1);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
