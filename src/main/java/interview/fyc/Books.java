package interview.fyc;

import java.io.*;

public class Books {

    public void addBooks(String fileName) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName));
        dataOutputStream.writeInt(151);
        dataOutputStream.writeChars("张三");
        dataOutputStream.writeInt(21);
        dataOutputStream.writeDouble(80.5);
        dataOutputStream.writeInt(152);
        dataOutputStream.writeChars("李四");
        dataOutputStream.writeInt(0);
        dataOutputStream.writeDouble(83.0);
        dataOutputStream.close();
    }

    public void getBooks(String fileName) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName));
        while (dataInputStream.available() > 0) {
            int no = dataInputStream.readInt();
            String name = dataInputStream.readChar() + "" + dataInputStream.readChar();
            int a = dataInputStream.readInt();
            double score = dataInputStream.readDouble();
            System.out.println(no + " " + name + " " + (a > 0 ? a : "") + " " + score);
        }

        dataInputStream.close();
    }

    public static void main(String[] args) throws IOException {
        Books books = new Books();
        String f = "/Users/yuanzhongming/books.txt";
        books.addBooks(f);
        books.getBooks(f);
    }
}
