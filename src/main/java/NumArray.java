/**
 * @Author: Zhongming Yuan
 * @Date: 2021/3/31 6:11 下午
 */
public class NumArray {

    private SegmentTreeNode root;

    public NumArray(int[] nums) {
        root = build(nums);
    }

    public void update(int index, int val) {
        modify(root, index, val);
    }

    public int sumRange(int left, int right) {
        return sumRange(root, left, right);
    }

    public class SegmentTreeNode {
        public int start, end, sum;
        public SegmentTreeNode left, right;
        public SegmentTreeNode(int start, int end, int sum) {
            this.start = start;
            this.end = end;
            this.sum = sum;
            this.left = this.right = null;
        }
    }

    // 构造的代码及注释
    public SegmentTreeNode build(int[] A) {
        // write your code here
        return buildhelper(0, A.length - 1, A);
    }
    public SegmentTreeNode buildhelper(int left, int right, int[] A){
        if(left > right){
            return null;
        }
        SegmentTreeNode root = new SegmentTreeNode(left, right, A[left]); // 根据节点区间的左边界的序列值为节点赋初值
        if(left == right){
            return root; // 如果左边界和右边界相等,节点左边界的序列值就是线段树节点的接节点值
        }
        int mid = (left + right) / 2; // 划分当前区间的左右区间
        root.left = buildhelper(left, mid, A);
        root.right = buildhelper(mid + 1, right, A);
        root.sum = root.left.sum + root.right.sum; // 根据节点区间的左右区间的节点值得到当前节点的节点值
        return root;
    }

    // 单点更新的代码及注释©G©
    public void modify(SegmentTreeNode root, int index, int value) {
        // write your code here
        if(root.start == root.end && root.start == index) { // 找到被改动的叶子节点
            root.sum = value; // 改变value值
            return ;
        }
        int mid = (root.start + root.end) / 2; // 将当前节点区间分割为2个区间的分割线
        if(index <= mid){ // 如果index在当前节点的左边
            modify(root.left, index, value); // 递归操作
            root.sum = root.right.sum + root.left.sum; // 可能对当前节点的影响
        }
        else {            // 如果index在当前节点的右边
            modify(root.right, index, value); // 递归操作
            root.sum = root.left.sum + root.right.sum; // 可能对当前节点的影响
        }
        return ;
    }

    public int sumRange(SegmentTreeNode root, int start, int end) {
        if (start <= root.start && root.end <= end) {
            // 如果查询区间在当前节点的区间之内,直接输出结果
            return root.sum;
        }
        int sum = 0;
        int mid = (root.start + root.end) / 2;
        if (mid >= start) {
            sum += sumRange(root.left, start, end);
        }
        if (mid + 1 <= end) {
            sum += sumRange(root.right, start, end);
        }

        return sum;
    }
}
