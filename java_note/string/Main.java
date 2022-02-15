package java_note.string;

public class Main {
    public static void main(String[] args) {
        // Java String API 뜯어보기

        // 1. 문자열 길이 반환
        // public int length()
        String text = "coffee";
        int length = text.length();
        System.out.println(length);  //6

        // 2. 문자열 포함여부 확인
        // public boolean contains(CharSequence s)
        String text2 = "Hello, Java.";
        boolean isContains = text2.contains("Java");
        System.out.println(isContains);  // true

        // 3. 앞의 문자열 동일여부 확인
        // public boolean startsWith(String prefix)
        String text3 = "도레미파솔라시도";
        boolean isCollect = text3.startsWith("도레미");
        System.out.println(isCollect);  // true

        // 4. 앞뒤 공백 제거: 문자열의 앞뒤에 공백을 제거하여 반환
        // public String trim()
        String text4 = "  오늘 눈이 오네요.  ";
        String trimedText = text4.trim();
        System.out.println(trimedText);  //오늘 눈이 오네요.

        // 5. 문자열 변경: target 문자열을 모두 replacement 문자열로 치환하여 반환한다
        // public String replace(CharSequence target, CharSequence replacement)
        String text5 = "ice-coffee, ice-juice, ice-tea";
        String replacedText = text5.replace("ice-", "hot-");
        System.out.println(replacedText);  //hot-coffee, hot-juice, hot-tea

        // 6. 문자열 자르기: 매개변수에 들어온 index 부터 마지막까지 반환
        // public String substring(int beginIndex)
        String text6 = "1234567890";
        String subText = text6.substring(2);
        String subText2 = text6.substring(8);
        System.out.println(subText);  //34567890
        System.out.println(subText2);  //90

        // 7. 문자열 자르기(2): beginIndex 부터 endIndex 전까지 반환
        // public String substring(int beginIndex, int endIndex)
        String text7 = "1234567890";
        String subText3 = text6.substring(2, 3);
        String subText4 = text6.substring(3, 6);
        System.out.println(subText3);  //3
        System.out.println(subText4);  //456

        // 8. 소문자/대문자로 변경
        String text8 = "abcDEF";
        String lowerCaseText = text8.toLowerCase();
        String upperCaseText = text8.toUpperCase();
        System.out.println(lowerCaseText);  //abcdef
        System.out.println(upperCaseText);  //ABCDEF

        // 9. 특정 문자 찾기: 가장먼저 발견되는 문자 기준 인덱스 반환
        // public int indexOf(String str)
        String text9 = "yesterday, today, tomorrow";
        int index = text9.indexOf("today");  //11
        int index2 = text9.indexOf("ter");  //3
        System.out.println(index);
        System.out.println(index2);

        // 10. 특정 index의 문자 반환
        // public char charAt(int index)
        String text10 = "1234567890";
        char character = text10.charAt(3);  //'4'
        char character2 = text10.charAt(1);  //'2'
        System.out.println(character);
        System.out.println(character2);

        // 11. 문자열 비교
        // public int compareTo(String anotherString)
        // 왼쪽 문자열이 anotherString 보다 오름차순 기준 더 앞이면 음수
        // 왼쪽 문자열이 anotherString 보다 오름차순 기준 더 뒤면 양수
        // 왼쪽 문자열이 anotherString 과 동일하면 0 반환
        int value = "abc".compareTo("jz");
        int value2 = "aa".compareTo("aaa");
        System.out.println(value);  //-9
        System.out.println(value2);  //-1

    }
}
