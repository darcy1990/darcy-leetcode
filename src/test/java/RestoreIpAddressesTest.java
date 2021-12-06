import org.junit.Test;

import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/12 5:43 下午
 */
public class RestoreIpAddressesTest {

    @Test
    public void restoreIpAddresses() {
        RestoreIpAddresses r = new RestoreIpAddresses();
        List<String> ret = r.restoreIpAddresses("25525511135");
        for (int i = 0; i < ret.size() ; i++) {
            System.out.println(ret.get(i));
        }
    }
}