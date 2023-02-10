package interview;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ExpenseAnalysis {

    private static HashMap<String, HashSet<String>> catagory = new LinkedHashMap<>();

    static {
        catagory.put("分期还款", Sets.newHashSet("分期还款"));
        catagory.put("饮食", Sets.newHashSet("料理", "wagon", "星巴克", "肯德基", "超市", "烟酒", "烧鹅", "快餐", "羊肉",
                "食品", "烧仙草", "常青麦香园", "食堂", "海底捞", "有家实业", "乐一佳", "牛骨头", "每日果仓", "祖厨", "茶百道", "鸡汤饭",
                "小碗菜", "煲仔饭", "老乡鸡", "饺子", "生煎", "支付宝-red", "胡雪峰新", "马香远", "三出山", "火锅", "咖啡", "盛香亭",
                "粉面", "餐饮", "牛肉面", "饮品", "都可"));
        catagory.put("外卖", Sets.newHashSet("北京三快在线", "美团"));
        catagory.put("交通", Sets.newHashSet("花小猪", "高德", "武汉地铁", "哈啰", "骑安"));
        catagory.put("服装", Sets.newHashSet("迅销"));
        catagory.put("生活杂项", Sets.newHashSet("曼巴", "云视听极光", "支付宝-张伟", "NewTV系列产品", "木本", "移动",
                "图书", "YEMA", "净衣邦", "货拉拉", "商务印书馆"));
        catagory.put("猫粮", Sets.newHashSet("皇家"));
        catagory.put("年度杂项以及健康", Sets.newHashSet("体检", "医院", "医药", "中医"));
        catagory.put("物业", Sets.newHashSet("物业"));
        catagory.put("订阅付款", Sets.newHashSet("支付宝-App"));
        catagory.put("京东", Sets.newHashSet("京东支付"));
    }

    public static void main(String[] args) throws IOException {
        List<Expense> expenses = read();

        Collections.sort(expenses, new Comparator<Expense>() {
            @Override
            public int compare(Expense o1, Expense o2) {
                return o2.getAmount() - o1.getAmount() > 0 ? 1 : -1;
            }
        });

        double t = 0.0;
        for (Expense expens : expenses) {
            t += expens.getAmount();
        }
        System.out.println("original total " + format(t));

        HashMap<String, List<Expense>> group = groupBy(expenses);

        HashMap<String, Double> groupSum = groupSum(group);

        double total = 0.0;
        for (Map.Entry<String, Double> e : groupSum.entrySet()) {
            System.out.println(e.getKey() + " " + format(e.getValue()));
            total += e.getValue();
        }
        System.out.println("group by total " + format(total));


        for (Expense expens : expenses) {
            if (expens.marked) {
                continue;
            }
            System.out.println("unmarked expense " + expens.getDescription() + " " + format(expens.getAmount()));
        }

        List<Expense> tmp = group.get("外卖");
        double tt = 0;
        for (Expense expense : tmp) {
            System.out.println(expense.getDescription() + format(expense.getAmount()));
            tt += expense.getAmount();
        }
        System.out.println(format(tt));
    }

    private static double format(double d) {
        return (double) Math.round(d * 100) / 100;
    }

    private static HashMap<String, Double> groupSum(HashMap<String, List<Expense>> group) {
        HashMap<String, Double> groupSum = new HashMap<>();
        for (Map.Entry<String, List<Expense>> e : group.entrySet()) {
            double k = 0;
            for (Expense expense : e.getValue()) {
                k += expense.getAmount();
            }
            groupSum.put(e.getKey(), k);
        }
        return groupSum;
    }

    private static HashMap<String, List<Expense>> groupBy(List<Expense> expenses) {
        HashMap<String, List<Expense>> group = new HashMap<>();
        for (Map.Entry<String, HashSet<String>> e : catagory.entrySet()) {
            String key = e.getKey();
            HashSet<String> values = e.getValue();
            for (Expense expens : expenses) {
                if (expens.marked) {
                    continue;
                }
                for (String v : values) {
                    if (expens.getDescription().contains(v)) {
                        List<Expense> ex = null;
                        if (group.containsKey(key)) {
                            ex = group.get(key);
                        } else {
                            ex = Lists.newArrayList();
                        }
                        ex.add(expens);
                        group.put(key, ex);
                        expens.setMarked(true);
                        if (v.equals("饮食")) {
                            System.out.println();
                        }
                    }
                }
            }
        }
        return group;
    }

    private static List<Expense> read() throws IOException {
        List<String> lines = FileUtils.readLines(new File("/Users/yuanzhongming/Documents/analysis_1.txt"), "utf-8");
        List<Expense> expenses = Lists.newArrayList();
        for (String line : lines) {
            line = line.trim();
            String[] arr = line.split("\\s+");
            Expense e = null;
            int len = arr.length;
            e = new Expense(arr[0], arr[1], arr[2], Double.parseDouble(arr[len - 3].replace(",", "")), arr[len - 2], arr[len - 1]);
            expenses.add(e);
        }
        return expenses;
    }

    private static final class Expense {

        private String sold;

        private String posted;

        private String description;

        private double amount;

        private String cardNo;

        private String originalAmount;

        private boolean marked;

        public Expense(String sold, String posted, String description, double amount, String cardNo, String originalAmount) {
            this.sold = sold;
            this.posted = posted;
            this.description = description;
            this.amount = amount;
            this.cardNo = cardNo;
            this.originalAmount = originalAmount;
        }

        @Override
        public String toString() {
            return sold + ' ' + description + ' ' + +amount;
        }

        public String getSold() {
            return sold;
        }

        public void setSold(String sold) {
            this.sold = sold;
        }

        public String getPosted() {
            return posted;
        }

        public void setPosted(String posted) {
            this.posted = posted;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public String getCardNo() {
            return cardNo;
        }

        public void setCardNo(String cardNo) {
            this.cardNo = cardNo;
        }

        public String getOriginalAmount() {
            return originalAmount;
        }

        public void setOriginalAmount(String originalAmount) {
            this.originalAmount = originalAmount;
        }

        public boolean isMarked() {
            return marked;
        }

        public void setMarked(boolean marked) {
            this.marked = marked;
        }
    }
}
