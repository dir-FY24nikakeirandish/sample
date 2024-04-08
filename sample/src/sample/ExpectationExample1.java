package sample;

import javax.print.attribute.standard.PrinterLocation;

public class ExpectationExample1 {

    public static void main(String[] args) {
        System.out.println("処理開始");
        
        try {
            //ここに例外が発生する可能性のあるコードを書きます
            System.out.println("割り算開始");
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            //ArithmeticExceptionが発生した場合を書きます
            System.out.println("ArithmeticExceptionが発生：" + e.getMessage());
        }finally {
            //例外の有無に関わらず、実行されるコードを書きます
            System.out.println("割り算終了");
        }
           
         System.out.println("処理終了");
        }

    }

