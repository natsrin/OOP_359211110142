package oop_lab6;

public class myString {
    public static void main(String[] args) {
        char[] c = {'H','e','l','l','o'};
        String str1 = new String (c);
        System.out.println(str1);

        String str2 = "Nasrin Phengmuso";
        System.out.println(str2);

        String str3 = new String("RMUSV");
        System.out.println(str3);

//       concatenation
//       type (+)
        String str4 =str1+" "+str2;
        System.out.println(str4);
//        type (concat () method)
        String str5 = str1.concat(" "+str3);
        System.out.println(str5);
//        string size
        int length = str4.length();
        System.out.println(length);

//        String method
        System.out.println(str5.toLowerCase());
        System.out.println(str5.toLowerCase());
        System.out.println(str5.replace('l','s'));
        System.out.println(str5.indexOf('V'));

//        trim()
        String  str6 = "Hello";
        System.out.println(str6.length());
        System.out.println("*"+str6+"*");
        System.out.println("*"+str6.trim()+"*");

     }//main
}//class
