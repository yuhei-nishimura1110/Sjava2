package main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import RPG.Hero;
import comment.zenhan;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		// 1-1
		System.out.println(
				"javaでプログラム開発をするためには、コンパイラとインタプリタというソフトウェアが必要です。コンパイラは私たちがjavaの文法に沿って記述したソースコードをバイトコードに変換してくれます。"
						+ "インタプリタは内部に持っているJVMのしくみを使ってこれを解釈し、マシン語に変換してCPUに送り、CPUは命令を実行します。");

		// 1-2
		int a12 = 3;
		int b12 = 5;
		int c12 = a12 * b12;
		System.out.println("縦幅" + a12 + "横幅" + b12 + "の長方形の面積は、" + c12);

		// 1-3
		boolean a13 = true;
		char b13 = '駆';
		double c13 = 3.14;
		long d13 = 314159265853979L;
		String e13 = "湊の攻撃！敵に15ポイントのダメージを与えた";

		// 2-1
		int x21 = 5;
		int y21 = 10;
		String ans = "x+yは" + (x21 + y21);// ()を追加
		System.out.println(ans);

		// 2-2
		// int x22= 3+5.0;//×
		double d22 = 2.0F;// 〇
		// int number="5";//×
		String s22 = 2 + "人目";// 〇
		byte b22 = 1;// 〇
		// d22 = ture;//×
		short s222 = (byte) 2;// 〇

		// 2-3
		System.out.println("ようこそ占いの館へ");
		System.out.println("貴方の名前を入力してください＞");
		String name23 = new java.util.Scanner(System.in).nextLine();
		System.out.println("貴方の年齢を入力してください＞");
		String ageString23 = new java.util.Scanner(System.in).nextLine();
		int age23 = Integer.parseInt(ageString23);
		int fortune23 = new java.util.Random().nextInt(4);
		fortune23++;
		String result23 = "";
		switch (fortune23) {
		case 1 -> {
			result23 = "大吉";
		}
		case 2 -> {
			result23 = "中吉";
		}
		case 3 -> {
			result23 = "吉";
		}
		case 4 -> {
			result23 = "凶";
		}
		}
		System.out.println("占いの結果が出ました");
		System.out.println(age23 + "歳の" + name23 + "さん、貴方の運気は" + result23 + "です！");

		// 3-1
		// wight == 60
		// (age1 + age2) > 60
		// age % 2 == 1
		// name == "湊"

		// 3-2
		// cost=300 * 1.05/batu
		// 3/batu
		// age !=30/maru
		// true/maru
		// b + 5 < 20/maru
		// isNumeric = true/maru

		// 3-3
		int isHungry33 = new java.util.Random().nextInt(2);
		String food33 = "からあげ";
		System.out.println("こんにちは");
		switch (isHungry33) {
		case 0 -> {
			System.out.println("お腹いっぱいです");
		}
		case 1 -> {
			System.out.println("腹ペコです");
			System.out.println(food33 + "をいただきます");
			System.out.println("ごちそうさまでした");
		}
		}

		// 3-4
		boolean tenki34 = true;
		if (tenki34 == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else {
			System.out.println("映画を見ます");
			System.out.println("寝ます");
		}

		// 3-5
		System.out.print("[メニュー]1：検索　2：登録　3：削除　4：変更＞");
		int selected35 = new java.util.Scanner(System.in).nextInt();
		switch (selected35) {
		case 1 -> {
			System.out.println("検索します");
		}
		case 2 -> {
			System.out.println("登録します");
		}
		case 3 -> {
			System.out.println("削除します");
		}
		case 4 -> {
			System.out.println("変更します");
		}
		}

		// 3-6
		System.out.println("【数あてゲーム】");
		int ans36 = new java.util.Random().nextInt(10);
		for (int i = 0; i < 5; i++) {
			System.out.println("0~9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == ans36) {
				System.out.println("アタリ");
				break;
			} else {
				System.out.println("ハズレ");

			}
		}
		System.out.println("ゲームを終了します");

		// 4-1
		// int[] points= new int[4];
		// double[] weight = new double[5];
		// boolean[] answers = new boolean[3];
		// String[] names = new String[3]

		// 4-2
		int[] moneyList42 = new int[] { 121902, 8302, 55100 };
		for (int i = 0; i < moneyList42.length; i++) {
			System.out.println(moneyList42[i]);
		}
		for (int i : moneyList42) {
			System.out.println(i);
		}
		// 4-3
		// int[] counts43 = null;
		// float[] heights43 = { 171.3F, 175.0F };
		// System.out.println(counts43[1]);// NullPointerException
		// System.out.println(heights43[2]);// ArrayIndexOutOfBoundsException

		// 4-4
		int[] c44 = new int[3];
		for (int i : c44) {
			c44[i] = new java.util.Random().nextInt(10);
		}
		System.out.println("1桁の数字を入力してください");
		int input44 = new java.util.Scanner(System.in).nextInt();
		for (int i : c44) {
			if (i == input44) {
				System.out.println("アタリ");
			}
		}

		// 5-1
		introduceOnelf();

		// 5-2
		email("a", "adoressesfsfh", "aaaa");

		// 5-3
		email("a", "a");

		// 5-4
		c(2, 2);
		c(2);

		// 6-1
		zenhan.doWarusa();
		zenhan.doTogame();
		comment.kouhan.callDeae();
		comment.kouhan.showMondokoro();

		// 6-2
		// 6-3
		// 6-4
		// 6-5
		// 10-1
		RPG.Hero h = new RPG.Hero("fadhfihfkjhajk");
		// 12-3
		tanoutai.Y[] y = new tanoutai.Y[2];
		y[0] = new tanoutai.A();
		y[1] = new tanoutai.B();
		for (tanoutai.Y i : y) {
			i.b();

		}
		// 15-1
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append((i + 1) + ",");
		}
		String s = sb.toString();
		String[] a = s.split(",");

		// 15-3
		// .*
		// A\d{1,2}
		// U[A-Z]{3}

		// 15-4
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		Date future = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("西暦ｙｙｙｙ年ｍｍ月ｄｄ日");
		System.out.println(f.format(future));

		// 15-5
		LocalDate now155 = LocalDate.now();
		LocalDate future155 = now155.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦ｙｙｙｙ年ｍｍ月ｄｄ日");
		System.out.println(future155.format(fmt));

		// 16-2
		RPG.Hero h1 = new RPG.Hero("斎藤");
		RPG.Hero h2 = new RPG.Hero("鈴木");
		List<Hero> heroes = new ArrayList<Hero>();
		heroes.add(h1);
		heroes.add(h2);
		for (Hero h16 : heroes) {
			System.out.println(h.getName());
		}

		// 16-3
		Map<Hero, Integer> heroes2 = new HashMap<Hero, Integer>();
		heroes2.put(h1, 3);
		heroes2.put(h2, 7);
		for (Hero key : heroes2.keySet()) {
			int value = heroes2.get(key);
			System.out.println(key.getName() + "が倒した敵は" + value);
		}
		// １７
		try {
			String s17 = null;
			System.out.println(s17.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("--スタックトレース（ここから）--");
			e.printStackTrace();
			System.out.println("--スタックトレース（ここまで）--");
		}

		try {
			int i = Integer.parseInt("三");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException例外をcatchしました。");
		}

	}

	// 5-1
	public static void introduceOnelf() {
		String name = "";
		int age = 0;
		double hight = 0;
		char eto = 'a';
		System.out.println("私の名前は" + name + "です。歳は" + age + "歳です。身長は" + hight + "㎝です。十二支は" + eto + "です。");
	}

	// 5-2
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました\n件名:" + title + "\n本文：" + text);
	}

	// 5-3
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました\n件名:無題\n本文：" + text);
	}

	// 5-4
	public static double c(double bottom, double height) {
		double menseki = bottom * height / 2;
		return menseki;
	}

	public static double c(double radius) {
		double menseki = radius * radius * 3.14;
		return menseki;
	}

	// 15-2
	public String concatPath(String folder, String file) {
		if (!folder.endsWith("\\")) {
			folder += "\\";
		}
		return folder + file;
	}
}
