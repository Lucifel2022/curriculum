package study;


// ① TaskクラスにCalculatorクラスを継承させなさい。
public class Task extends Calculator {
    
    
    
    
    /**
     * タスクの実行
     */
    public void doTask() {

        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
             plus(6);
             plus(2+8);
             plus(5+3+7);
        System.out.println("plusメソッドの引数が一の場合:"+plus(6));
        System.out.println("plusメソッドの引数が二の場合:"+plus(2+8));
        System.out.println("plusメソッドの引数が三の場合:"+plus(5+3+7));
        
    }
    }

