package d34lambda;

import d31lambda.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class LambdaFile {
    public static void main(String[] args) {

        try {
            Files.lines(Paths.get("C:\\Users\\sefas\\OneDrive\\Masaüstü\\Batch_Java\\Java\\src\\main\\java\\d34lambda\\LambdaFile")).forEach(t-> System.out.println(t));
        } catch (IOException e) {
            System.out.println(e);
        }

        //Tüm karakterleri büyük harfe dönüştürün ve okuyun

        try {
            Files.lines(Paths.get("C:\\Users\\sefas\\OneDrive\\Masaüstü\\Batch_Java\\Java\\src\\main\\java\\d34lambda\\LambdaFile")).map(String::toUpperCase).forEach(t-> System.out.println(t));
        } catch (IOException e) {
            System.out.println(e);
        }

        //metindeki farklı kelimeleri yazdır
        try {
            Files.lines(Paths.get("C:\\Users\\sefas\\OneDrive\\Masaüstü\\Batch_Java\\Java\\src\\main\\java\\d34lambda\\LambdaFile")).map(t->t.split(" ")).flatMap(Arrays::stream).map(t->t.replaceAll("\\W","")).distinct().forEach(Utils::printInTheSameLineWithSpace);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
