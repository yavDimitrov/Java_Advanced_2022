package LECTURES.L03_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03_BrowserHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> browserHistory = new ArrayDeque<>();

        String input = scan.nextLine();
        String currentURL ="";

        while(!input.equals("Home")){
            if(input.equals("back")){
                if(browserHistory.size()>1){
                    browserHistory.pop();
                    currentURL = browserHistory.peek();
                    System.out.println(currentURL);


                }else {
                    System.out.println("no previous URLs");
                }

            }else {
                browserHistory.push(input);
                currentURL = browserHistory.peek();
                System.out.println(currentURL);
            }

            input = scan.nextLine();
        }
    }
}
