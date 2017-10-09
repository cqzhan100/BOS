package com.itheima.test;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

/**  
 * ClassName:AppTest <br/>  
 * Function:  <br/>  
 * Date:     2017年9月20日 下午8:27:39 <br/>       
 */
public class AppTest {
  public static void main(String[] args) {
    MobileCodeWS ws = new MobileCodeWS();
    MobileCodeWSSoap soap = ws.getMobileCodeWSSoap();
 String mobileCodeInfo = soap.getMobileCodeInfo("1866666", "");
 System.out.println(mobileCodeInfo);
  }
}
  
