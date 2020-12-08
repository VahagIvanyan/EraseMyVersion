   public static void Erase(String aWord, int index){
        char [] anArr = new char[aWord.length()];
        for(int i = 0; i < aWord.length(); i++){
            if((index-1) == i)
                continue;
            anArr[i] = aWord.charAt(i);
        }
        System.out.println(anArr);
    }
