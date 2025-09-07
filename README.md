# janken_game

Javaで作ったシンプルなじゃんけんゲームです。
コンソール上で動作し、ユーザーとコンピュータがじゃんけんを行います。

## 使用技術

- Java（Scanner, Math.random）

## 工夫した点

- 見やすさに注意し、表示される文言や並び順を整理しました。
- 勝利数を表示することで、「今どれだけ勝っているか」が一目でわかるようにしました。
- 終了コマンド（q）を用意し、ユーザーが途中でゲームをやめられるようにしました。
- 入力にｇ、ｃ、ｐ、ｑ以外を入れた場合のエラーメッセージが出るようにしました。

## 実行方法

1. ターミナルでプロジェクトのルートディレクトリに移動します。
   ```
   cd /workspaces/janken_game
   ```

2. Javaファイルをコンパイルします。
   ```
   javac jp/co/wp/practice/janken_game/Jankencard.java
   ```

3. プログラムを実行します。
   ```
   java -cp . jp.co.wp.practice.janken_game.Jankencard
   ```

## 動作環境

- 動作確認済みOS: Windows 10（Eclipse 2024上）
- Java: OpenJDK 17 以上

※ このリポジトリは Ubuntu 24.04.2 LTS（dev container上）でも動作確認済みです。  
※ 他のOSやJavaバージョンでも動作する可能性があります。
