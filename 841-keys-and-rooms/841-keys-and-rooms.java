class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] roomsVisited = new boolean[rooms.size()];
        Queue<Integer> q = new LinkedList<Integer>();
        int n, a, temp;
        
        int front = 0;
        q.add(0);
        roomsVisited[0] = true;
        while(q.size() != 0){
            n = q.remove();
            temp = rooms.get(n) == null ? 0 : rooms.get(n).size();
            for(int i=0 ; i < temp; i++){
                a = rooms.get(n).get(i);
                if(!roomsVisited[a]){
                    roomsVisited[a] = true;
                    q.add(a);
                }
            }
        }
        
        for(int i = 0; i < roomsVisited.length ; i++){
            if(roomsVisited[i]==false){
                return false;
            }
        }
        return true;
    }
}