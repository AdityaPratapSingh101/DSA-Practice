package Strings;

public class ShortestPath {
//Question :- Given a route containing directions (N, S, E, W), find the shortest path to reach the destination from the source.
    public static int shortestPath(String route){
        int x=0;
        int y=0;
        for(int i=0;i<route.length();i++){
            char direction=route.charAt(i);
            switch(direction){
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
        }
        return Math.abs(x)+Math.abs(y);
    }
    public static void main(String[] args) {
        String route="NNEESSWW";
        System.out.println("The shortest path to reach the destination is: "+shortestPath(route));
    }    
    
}
