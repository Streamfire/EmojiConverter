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
		switch (("" + in).toLowerCase().charAt(0))
		{
			case 'a':
				return "🅰️";
			case 'ä':
			case 'Ä':
				return "🅰️3⃣";
			case 'b':
				return "🅱️";
			case 'c':
				return "©";
			case 'd':
				return "▶️";
			case 'e':
				return "3⃣";
			case 'f':
				return "🚩";
			case 'g':
				return "♿️";
			case 'h':
				return "♓️";
			case 'i':
				return "ℹ️";
			case 'j':
				return "🎷";
			case 'k':
				return "🎋";
			case 'l':
				return "🤙";
			case 'm':
				return "♏️";
			case 'n':
				return "♑️";
			case 'o':
				return "0⃣";
			case 'ö':
			case 'Ö':
				return "0⃣3⃣";
			case 'p':
				return "🅿️";
			case 'q':
				return "🐮";
			case 'r':
				return "®";
			case 's':
				return "💲";
			case 'ß':
			case 'ẞ':
				return "💲💲";
			case 't':
				return "✝️";
			case 'u':
				return "✔️";
			case 'ü':
			case 'Ü':
				return "✔️3⃣";	
			case 'v':
				return "♈️";
			case 'w':
				return "🔱";
			case 'x':
				return "❌";
			case 'y':
				return "🌵";
			case 'z':
				return "💤";
			case ' ':
				return " ";
			case ';':
				return ",";
			case '?':
				return "❓";
			case '!':
				return "❗️";
			default:
				return "" + in;
		}
	}
	
	
}
