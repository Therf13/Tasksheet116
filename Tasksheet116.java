class Tasksheet116 {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Live");

        StringBuilder reverseStr = str.reverse();

        if (str.equals(reverseStr)); {
            System.out.println("The input string is a palindrome");
        }

        if (reverseStr.equals(str)); {
            System.out.println("The input string is not a palindrome");
        }
    }
}




