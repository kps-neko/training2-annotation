package exam;

import exam.annotations.Controller;
import exam.annotations.RequestMapping;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by s-wada on 2015/11/27.
 */
public class Bootstrap {
    private static String getRoot() {
        String r = ClassLoader.getSystemClassLoader().getResource("").getPath();
        boolean isWindows = System.getProperty("os.name").toLowerCase().contains("windows");
        return isWindows ? r.substring(1) : r;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // gradlew run -Parg="引数" とする事で引数を渡して実行できます。

        // コマンドライン引数一覧を出力します。
        System.out.println("コマンドライン引数:");
        System.out.println(String.join(", ", args));
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        String root = getRoot();
        String controllerPkgPath = root + "exam/controller/";
        //コントローラパッケージのパスを出力します。
        System.out.println("controllerパッケージのパス = " + controllerPkgPath);


        // 問題１ クラスのロード
        // controllerパッケージ以下に、任意のクラスをいくつか作成してください。
        // クラスファイル一覧を取得し、その一覧を使用して
        // Classオブジェクトの一覧（リストでも配列でも良い）を作成してください。
        // クラスローダは上記で取得済みのものを使用してかまいません。
        // ロードしたクラスをprintlnで出力してみてください。
        System.out.println("=====================================================================");
        System.out.println("Answer1:");
        // ここに回答のコードを書く
        

        // 問題２ アノテーションによるクラス探索
        // annotationsパッケージに、@Controllerアノテーションを定義して、
        // 1で作ったクラスの一つにつけてください。
        // リフレクションとアノテーションについて調べ、@Controllerのついたクラスだけを
        // 選択し、出力してみてください。
        System.out.println("=====================================================================");
        System.out.println("Answer2:");
        // ここに回答のコードを書く


        // 問題３ アノテーションによるメソッド呼び出し
        // @Controllerの付与されたクラスに、引数を取らないメソッドを複数定義してください。
        // メソッドの内容はprintlnでメソッド名を出力するように実装してください。
        // annotationsパッケージ内に@RequestMappingアノテーションを定義し、コントローラクラスの
        // メソッドすべてに付与してください。その際、@RequestMapping("/url")のように、値を設定してください。
        // コマンドラインからgradlew run -Pargs="/url" のように指定して、
        // マップされたメソッドが呼ばれるような処理を記述してください。

        if (args.length == 1) {
            System.out.println("=====================================================================");
            System.out.println("Answer3:");
            // ここに回答のコードを書く


        }
    }
}
