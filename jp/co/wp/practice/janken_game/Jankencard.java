package jp.co.wp.practice.janken_game;

import java.util.Scanner;

public class Jankencard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// タイトル
		System.out.println("******************");
		System.out.println("*じゃんけんゲーム*");
		System.out.println("******************");
		System.out.println("");
		System.out.println("5勝すればゲーム終了です。");
		System.out.println("");

		final String g ="g", c = "c", p = "p";
		final String[] hands = { "グー","チョキ","パー"};
		
		int wins = 0;
		
		while(wins < 5) {
			//プレイヤーの出す手
			System.out.println("現在の勝利数："+wins);
			System.out.print("あなたが出す手を選択してください（g:グー,c:チョキ,p:パー,q:終了）＞");
			String in = sc.nextLine().trim().toLowerCase();

			if("q".equals(in))break;
			//g,c,p,q以外を入力した場合
			if(!(g.equals(in) || c.equals(in) || p.equals(in))) {
				System.out.println("");
				System.out.println("※正しく入力してください");
				System.out.println("");
				continue;
			}
			int player = switch (in) {case "g" -> 0; case "c" -> 1; default -> 2;};
			int computer = (int)(Math.random() * 3);//コンピュータの出す手

			System.out.println("あなた：" + hands[player] + " コンピューター：" + hands[computer]);
			
			//引き分けの場合
			if(player == computer) {
				System.out.println("");
				System.out.println("→Draw");
				System.out.println("");
				}//勝った場合
				else if((player == 0 && computer == 1) ||
					(player == 1 && computer == 2) ||
					(player == 2 && computer == 0)){
					System.out.println("");
					System.out.println("→You Win!!");
					System.out.println("");
					wins++;	
				}//負けた場合
				else{ 
					System.out.println("");
					System.out.println("→You Lose…");
					System.out.println("");
				}
			}
		System.out.println("ゲーム終了　最終勝利数："+wins);
	}
}
