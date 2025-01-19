public class TenMinWalk {

    public static boolean isValid(char[] walk) {
      int[] dir = countChar(walk);
      boolean valid = false;
      if(walk.length == 10)
        if(dir[0] == dir[1] && dir[2] == dir[3])
            valid = true;
      return valid;
    }

    private static int[] countChar(char[] walk) {
        int n = 0;
        int s = 0;
        int w = 0;
        int e = 0;
        int[] dir = new int[4];
        for(int i = 0; i < walk.length; i++) {
            if(walk[i] == 'n')
                n++;
            if(walk[i] == 's')
                s++;
            if(walk[i] == 'w')
                w++;
            if(walk[i] == 'e')
                e++;
        }
        dir[0] = n;
        dir[1] = s;
        dir[2] = w;
        dir[3] = e;
        return dir;
    }

    public static void main(String[] args) {
        char[] true1 = {'n','s','n','s','n','s','n','s','n','s'};
        char[] false1 = {'w','e','w','e','w','e','w','e','w','e','w','e'};
        char[] false2 = {'w'};
        char[] false3 = {'n','n','n','s','n','s','n','s','n','s'};
        System.out.println(isValid(true1));
        System.out.println(isValid(false1));
        System.out.println(isValid(false2));
        System.out.println(isValid(false3));
    }
  }