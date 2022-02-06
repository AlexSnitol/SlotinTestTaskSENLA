package task3;

import java.util.ArrayList;

public class Vowels
{
    private String str;
    private String upperVowels = "АУОЫИЭЯЮЁЕ";
    private String lowerVowels = "ауоыиэяюёе";
    private String vowels = lowerVowels + upperVowels;
    private ArrayList<String> words = new ArrayList<>();

    Vowels() {}

    Vowels(String str)
    {
        this.str = str;
        this.fillArrayWords();
    }

    public void setStr(String str)
    {
        this.str = str;
        this.fillArrayWords();
    }

    public void setStrFromObjectArray()
    {
        String newStr = "";

        for (int i = 0; i < this.words.size() - 1; i++)
            newStr += words.get(i) + " ";
        newStr += words.get(this.words.size() - 1);

        this.str = newStr;
    }

    public String getStr()
    {
        return str;
    }

    public void setVowels(String vowels)
    {
        this.vowels = vowels;
    }

    public String getVowels()
    {
        return vowels;
    }

    public String getLowerVowels()
    {
        return lowerVowels;
    }

    public String getUpperVowels()
    {
        return upperVowels;
    }

    public void setLowerVowels(String lowerVowels)
    {
        this.lowerVowels = lowerVowels;
    }

    public void setUpperVowels(String upperVowels)
    {
        this.upperVowels = upperVowels;
    }

    public int countVowels(String str)
    {
        int k = 0;

        for (char symS : str.toCharArray())
        {
            if (this.vowels.indexOf(symS) != -1)
                k++;
        }

        return k;
    }

    public void fillArrayWords()
    {
        this.words.clear();

        int tmpi = 0;
        String word = "";

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ' || i == str.length() - 1)
            {
                if (i == str.length() - 1)
                    i++;

                for (int j = tmpi; j < i; j++)
                    word += str.charAt(j);

                this.words.add(word);
                word = "";
                tmpi = i + 1;
            }
        }
    }

    public ArrayList<String> getWords()
    {
        return this.words;
    }

    public void printSortByCountVowelsInWord()
    {
        ArrayList<Integer> countVowelsInWord = new ArrayList<>();
        ArrayList<String> tmpWords = new ArrayList<>(this.words);

        for (int i = 0; i < this.words.size(); i++)
            countVowelsInWord.add(this.countVowels(this.words.get(i)));

        //booble sort
        int n = countVowelsInWord.size();
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (countVowelsInWord.get(j) < countVowelsInWord.get(j + 1))
                {
                    int tmp = countVowelsInWord.get(j);
                    countVowelsInWord.set(j, countVowelsInWord.get(j + 1));
                    countVowelsInWord.set(j + 1, tmp);

                    String tmpS = tmpWords.get(j);
                    tmpWords.set(j, tmpWords.get(j + 1));
                    tmpWords.set(j + 1, tmpS);
                }
            }
        }

        this.printArray(tmpWords);
    }

    public void printArray(ArrayList<String> arr)
    {
        for (int i = 0; i < arr.size()-1; i++)
            System.out.print(arr.get(i) + " ");

        System.out.print(arr.get(arr.size()-1));
    }

    public void setFirstVowelInWordUppercase()
    {
        String word = "";
        String newWord = "";
        boolean t = false;

        for(int i = 0; i < this.words.size(); i++)
        {
            word = this.words.get(i);

            for (char sym : word.toCharArray())
            {
                if (t == false)
                {
                    if (this.vowels.indexOf(sym) != -1)
                    {
                        t = true;

                        if (this.vowels.indexOf(sym) < this.upperVowels.length())
                            sym = this.upperVowels.charAt(this.vowels.indexOf(sym));
                        else
                            sym = this.vowels.charAt(this.vowels.indexOf(sym));
                    }
                }

                newWord += sym;
            }
            t = false;
            words.set(i, newWord);
            newWord = "";
        }

        this.setStrFromObjectArray();
    }

    public String toString()
    {
        return this.str;
    }
}
