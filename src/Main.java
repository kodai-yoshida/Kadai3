import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        //サウナマップを登録する
        Map<String,String> TokyoStationRamenMap = new HashMap<>();
        TokyoStationRamenMap.put("煮干し","中華そば 福味");
        TokyoStationRamenMap.put("つけ麺","松戸富田麺絆");
        TokyoStationRamenMap.put("味噌","東京スタイルみそらーめん ど・みそ");
        TokyoStationRamenMap.put("担々麺","阿吽");
        TokyoStationRamenMap.put("豚骨"," 一幸舎");

        //標準入力で駅名を受け取る
        System.out.println("好きなラーメンの種類を入力してください。おすすめのラーメン店を紹介します。");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        //登録されていない種類を受け取った場合、エラーメッセージを表示する
        if(TokyoStationRamenMap.get(type) == null){
            throw new Exception(type + " その種類のラーメン店は登録されていません。");
        }
        //登録されている駅名を受け取った場合、対応するおすすめのサウナを表示する
        System.out.println("おすすめのラーメン店は" + TokyoStationRamenMap.get(type) + "です。");
    }
}