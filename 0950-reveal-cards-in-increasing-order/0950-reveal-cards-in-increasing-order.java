class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[]ans=new int[deck.length];
        Arrays.sort(deck);
        Deque<Integer>q=new LinkedList<>();

        q.add(deck[deck.length-1]);

        for(int i=deck.length-2;i>=0;i--){

            q.addFirst(q.removeLast());

            q.addFirst(deck[i]);
        }
        int j=0;
        for(int card:q){
            ans[j++]=card;
        }
        return ans;
    }
}