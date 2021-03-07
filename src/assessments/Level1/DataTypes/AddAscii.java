package assessments.Level1.DataTypes;

public class AddAscii {
    public static void main(String[] args) {
        char Char = 'd';
        int Char_ascii = (int) Char;
        int Temp = Char_ascii+3;
        char New_Char = (char) Temp;
        System.out.println("New Character value is "+ New_Char);

    }
}
