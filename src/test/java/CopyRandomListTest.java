import list.CopyRandomList;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/24 6:15 下午
 */
public class CopyRandomListTest {

    @Test
    public void copyRandomList() {
        CopyRandomList.Node n1 = new CopyRandomList.Node(7);
        CopyRandomList.Node n2 = new CopyRandomList.Node(13);
        CopyRandomList.Node n3 = new CopyRandomList.Node(11);
        CopyRandomList.Node n4 = new CopyRandomList.Node(10);
        CopyRandomList.Node n5 = new CopyRandomList.Node(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n1.random = n5;
        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        CopyRandomList cr = new CopyRandomList();
        cr.copyRandomList(n1);
    }
}