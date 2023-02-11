package BFS;

public class RecursiveFn {
    //재귀함수를 이용한 이진수 출력

    public void DFS(int n){
        if(n == 0) return;
        else{
            DFS(n/2);
            System.out.println(n%2+" ");
        }
    }

    public static void main(String[] args) {
        RecursiveFn recursiveFn = new RecursiveFn();
        recursiveFn.DFS(11);


    }
}
