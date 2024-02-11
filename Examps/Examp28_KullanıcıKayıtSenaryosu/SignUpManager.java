package Examps.Examp28_KullanıcıKayıtSenaryosu;

public class SignUpManager {
    private IUserCheckService iUserCheckService;
    public SignUpManager(IUserCheckService iUserCheckService){
        this.iUserCheckService = iUserCheckService;
    }

    public void signUp(User user){
        if (iUserCheckService.userCheck(user)){
            System.out.println("Kullanıcı kayıt oldu: " + user.getName());
        }else {
            System.out.println("Kullanıcı kayıt olamadı.");
        }
    }
}
