import incapacity.ArtificialIncapacityUtil;
import incapacity.ArtificialIncapacityUtil.Name;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	private static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// 会話ルール情報および評価順の設定
		Name[] nameAry = null;
		// フルパターン
		nameAry = new Name[] { Name.BYE, Name.SAME, Name.PATTERN, Name.TWEET, Name.WIKI, Name.GOOGLE, Name.SUGGEST,
				Name.RANDOM };
		// ツイッターなしのパターン
		nameAry = new Name[] { Name.BYE, Name.SAME, Name.PATTERN, Name.WIKI, Name.GOOGLE, Name.SUGGEST, Name.RANDOM };
		ArtificialIncapacityUtil.createTalkList(nameAry);

		while (true) {
			String input = input();
			if (input == null) {
				continue;
			}
			// 会話
			String talkString = ArtificialIncapacityUtil.getTalkString(input);
			System.out.println(talkString);
		}
	}

	private static String input() {
		System.out.print(">>");
		String input = SCANNER.nextLine();
		if (input.length() == 0) {
			return null;
		}
		return input;
	}

}
