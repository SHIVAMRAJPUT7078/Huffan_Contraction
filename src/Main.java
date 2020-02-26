import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine().trim();
        userInput = userInput.toLowerCase();

        String[] huff = {"1010", "100000", "00000", "10110", "010", "110011", "100010", "0001", "0110", "1100001011",
                "11000011", "10111", "110010", "0111", "1001", "100001", "1100001001", "0010", "0011",
                "1101", "00001", "1100000", "110001", "1100001000", "100011", "1100001010"};
        HashMap<Character, String> map = new HashMap<Character, String>();
        char[] arr = userInput.toCharArray();
        StringBuilder sb = new StringBuilder("");
        int ctr = 0;
        for (char c : arr) {
            sb.append("0".repeat(8 - (Integer.toBinaryString((int) c).length()))).append(Integer.toBinaryString((int) c)).append(ctr < arr.length - 1 ? "-" : "");
            ctr++;
        }
        System.out.println(sb.toString());
        StringBuilder huffCode = new StringBuilder("");
        int ctr2 = 0;
        for (char c : arr) {
            huffCode.append(huff[(int) c - 97]).append(ctr2 < arr.length - 1 ? "-" : "");
            ctr2++;
        }
        System.out.println(huffCode.toString());
        int length1 = sb.toString().length() - arr.length - 1;
        int lenght2 = huffCode.toString().length() - arr.length - 1;
        System.out.println("Original length : " + length1);
        System.out.println("Huffman length : " + lenght2);
        System.out.println("Contraction is :" + (length1 - lenght2));
        sc.close();

    }
}
