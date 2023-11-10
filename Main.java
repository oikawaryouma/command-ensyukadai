import java.util.Scanner;

public class  Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String message = "";
            String message2 = "";


            System.out.println("BMIを計算します。身長と体重を記入してください。");

            System.out.print("1人目の身長(m)を記入してください：");
            double height = sc.nextDouble();

            System.out.print("体重(kg)を記入してください：");
            double weight = sc.nextDouble();

            System.out.print("2人目の身長(m)を記入してください：");
            double height2 = sc.nextDouble();

            System.out.print("体重(kg)を記入してください：");
            double weight2 = sc.nextDouble();


            double bmi = weight / (height * height);

            double bmi2 = weight2 / (height2 * height2);



            if (bmi < 18.5) {
                message = "低体重（やせ型）毎日3食食べて、栄養をつけましょう！";
            } else if (bmi >= 18.5 && bmi < 25) {
                message = "普通体重 これからもこの体型を維持していきましょう！";
            } else if (bmi >= 25 && bmi < 30) {
                message = "肥満(level1)　毎日の食生活を見直しましょう！";
            } else if (bmi >= 30 && bmi < 35) {
                message = "肥満(level2)　毎日の食生活とともに、間食や食後の昼寝などをやめましょう。";
            } else if (bmi >= 35 && bmi < 40) {
                message = "肥満(level3)　毎日野菜を食べて、毎日ランニングなどの運動も行いましょう。";
            } else if (bmi >= 40) {
                message = "肥満(level4)　栄養科の医師の指示の下、健康な生活を送りましょう。非常に危険です。";
            }

            if (bmi2 < 18.4) {
                message2 = "低体重（やせ型）毎日3食食べて、栄養をつけましょう！";
            } else if (bmi2 >= 18.4 && bmi2 < 25) {
                message2 = "普通体重 これからもこの体型を維持していきましょう！";
            } else if (bmi2 >= 25 && bmi2 < 30) {
                message2 = "肥満(level1)　毎日の食生活を見直しましょう！";
            } else if (bmi2 >= 30 && bmi2 < 35) {
                message2 = "肥満(level2)　毎日の食生活とともに、間食や食後の昼寝などをやめましょう。";
            } else if (bmi2 >= 35 && bmi2 < 40) {
                message2 = "肥満(level3)　毎日野菜を食べて、毎日ランニングなどの運動も行いましょう。";
            } else if (bmi2 >= 40) {
                message2 = "肥満(level4)　栄養科の医師の指示の下、健康な生活を送りましょう。非常に危険です。";
            }
            System.out.println("1人目BMI:" + String.format("%.2f", bmi));
            System.out.println("あなたの肥満度は" + message);

            System.out.println("2人目のBMI:" + String.format("%.2f", bmi2));
            System.out.println("あなたの肥満度は" + message2);

        }
    }
