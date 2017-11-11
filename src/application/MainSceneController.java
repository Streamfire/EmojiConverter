package application;

import javafx.scene.control.TextArea;

public class MainSceneController
{
	public TextArea InputArea;
	public TextArea OutputArea;
	
	private char[] input;
	private String output;
	
	public void Convert()
	{
		input=InputArea.getText().toCharArray();
		output= new String();
		for(int i=0;i<input.length;i++)
		{
			output += charConvert(input[i]);
		}
		
		OutputArea.setText(output);
	}

	private String charConvert(char in)
	{
		switch (in)
		{
		
			case 'a':
			case 'A':
				return "🅰️";
			case 'ä':
			case 'Ä':
				return "🅰️3⃣";
			case 'b':
			case 'B':
				return "🅱️";
			case 'c':
			case 'C':
				return "©";
			case 'd':
			case 'D':
				return "▶️";
			case 'e':
			case 'E':
				return "3⃣";
			case 'f':
			case 'F':
				return "🚩";
			case 'g':
			case 'G':
				return "♿️";
			case 'h':
			case 'H':
				return "♓️";
			case 'i':
			case 'I':
				return "ℹ️";
			case 'j':
			case 'J':
				return "🎷";
			case 'k':
			case 'K':
				return "🎋";
			case 'l':
			case 'L':
				return "🤙";
			case 'm':
			case 'M':
				return "♏️";
			case 'n':
			case 'N':
				return "♑️";
			case 'o':
			case 'O':
				return "0⃣";
			case 'ö':
			case 'Ö':
				return "0⃣3⃣";
			case 'p':
			case 'P':
				return "🅿️";
			case 'q':
			case 'Q':
				return "🐮";
			case 'r':
			case 'R':
				return "®";
			case 's':
			case 'S':
				return "💲";
			case 'ß':
			case 'ẞ':
				return "💲💲";
			case 't':
			case 'T':
				return "✝️";
			case 'u':
			case 'U':
				return "✔️";
			case 'ü':
			case 'Ü':
				return "✔️3⃣";	
			case 'v':
			case 'V':
				return "♈️";
			case 'w':
			case 'W':
				return "🔱";
			case 'x':
			case 'X':
				return "❌";
			case 'y':
			case 'Y':
				return "🌵";
			case 'z':
			case 'Z':
				return "💤";
			case ' ':
				return " ";
			case ',':
			case ';':
				return ",";
			case '.':
				return ".";
			case '?':
				return "❓";
			case '!':
				return "❗️";
			default:
				return null;	
		}
	}
	
	
}
