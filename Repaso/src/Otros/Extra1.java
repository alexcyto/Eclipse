package Otros;

import java.io.File;
import java.io.RandomAccessFile;
import java.io.IOException;

public class Extra1{
public static void main(String[] args) throws IOException {
RandomAccessFile f;
f=new RandomAccessFile(new File("ActvExtra.txt"),"rw");
f.write("1".getBytes());
f.write("2".getBytes());
f.write("3".getBytes());
f.write("4".getBytes());
f.write("5".getBytes());
f.write("6".getBytes());
f.write("7".getBytes());
f.write("8".getBytes());
f.write("9".getBytes());
f.write("10".getBytes());
f.write("11".getBytes());
f.write("12".getBytes());
f.write("13".getBytes());
f.write("14".getBytes());
f.write("15".getBytes());
f.write("16".getBytes());
f.write("17".getBytes());
f.write("18".getBytes());
f.write("19".getBytes());
f.write("20".getBytes());
byte[] bytes = new byte[8];
f.read(bytes); // Read
f.close();
}
}