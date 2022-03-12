package problem;

public class DeleteSameLetter {

    // Function to print the string
    static void printStringAlternate(String str)
    {
        int[] occ = new int[122];

        // Convert uppercase to lowercase
        String s = str.toLowerCase();

        // Start traversing the string
        for (int i = 0; i < str.length(); i++)
        {

            char temp = s.charAt(i);

            // Increment occurrence count
            occ[temp]++;

            // If count is odd then print the character
            if (occ[temp]%2 != 0)
                System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    // driver program
    public static void main (String[] args)
    {
        String str1 = "Geeks for geeks";
        String str2 = "It is a long day Dear";
        printStringAlternate(str1);
        printStringAlternate(str2);
    }


}
