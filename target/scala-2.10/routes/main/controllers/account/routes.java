
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/workspace/BASECentral/conf/routes
// @DATE:Fri Feb 10 14:19:19 MST 2017

package controllers.account;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.account.ReverseSignup Signup = new controllers.account.ReverseSignup(RoutesPrefix.byNamePrefix());
  public static final controllers.account.ReverseReset Reset = new controllers.account.ReverseReset(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.account.javascript.ReverseSignup Signup = new controllers.account.javascript.ReverseSignup(RoutesPrefix.byNamePrefix());
    public static final controllers.account.javascript.ReverseReset Reset = new controllers.account.javascript.ReverseReset(RoutesPrefix.byNamePrefix());
  }

}
