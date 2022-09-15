package CodingQuestions;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String str="ana";
        String second=str;
        StringBuilder builder=new StringBuilder(str);
        builder.reverse();
        System.out.println(builder);

        if (str.equals(second)){
            System.out.println("pal");
        }else {
            System.out.println("no");
        }

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("need ");
        stringBuilder.append("sun");
        System.out.println(stringBuilder);

        StringBuilder string=new StringBuilder("I need sun");
        string.insert(6," some");
        string.append("please");
        System.out.println(string);
    }
}
