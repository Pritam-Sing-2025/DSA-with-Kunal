

class BinarySearchSmallGreatThanTaret {
    public static void main(String[] args) {
        char[] ch = {'c', 'f', 'j'};
        char target = 'j';
        char ans = binarySearch(ch, target);
        System.out.println(ans);
    }
    static char binarySearch (char[] ch, char target) {
        int start = 0;
        int end = ch.length -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < ch[mid]) {
                end = mid - 1;
                start = mid + 1;
            } else{ //(target >= ch[mid]), cuz target will gonna be equals to ch[mid] ('j' >= 'j') 
                start = mid + 1;
            } 
        }
        return ch[start % ch.length]; // 3 % 3 = 0 & ch[0] = 'c'
    }
}