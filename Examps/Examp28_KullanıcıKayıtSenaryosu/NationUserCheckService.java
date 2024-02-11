package Examps.Examp28_KullanıcıKayıtSenaryosu;

public class NationUserCheckService implements IUserCheckService{
    @Override
    public boolean userCheck(User user) {
        if (user.isTurk()){
            return true;
        }
        return false;
    }
}
