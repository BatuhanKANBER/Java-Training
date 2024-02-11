package Examps.Examp28_KullanıcıKayıtSenaryosu;

public class AgeUserCheckService implements IUserCheckService{
    @Override
    public boolean userCheck(User user) {
        if (user.getAge() >= 18){
            return true;
        }
        return false;
    }
}
