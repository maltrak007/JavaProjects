/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RememberExercises.com.gonzalolinanaldana.javarememberexercise;

import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class Exercise5 {
    
    final static float WITHOUT_SEA_PRIZE = 150.50f;
    final static float WITH_SEA_PRIZE = 190.50f;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IO.println("What's your name:");
        String clientName = scanner.nextLine();
        IO.println("What's your stance duration?");
        int daysReserved = Integer.parseInt(scanner.nextLine());
        IO.println("Would you like to have sea view from your room?");
        Boolean hasSeaView = false;
        String wantSeaView = scanner.nextLine();
        if(wantSeaView.toUpperCase().equals("Y")||wantSeaView.toUpperCase().equals("YES"))
        {
            hasSeaView = true;
        }
        float roomPrize = ReturnRoomPrize(daysReserved, hasSeaView);
        String formattedMessage = String.format("The final prize is: $%.2f", roomPrize);
        IO.println(formattedMessage);
    }
    
    public static float ReturnRoomPrize(int _reservedDays, boolean _wantsSeaView)
    {
        float roomPrize;
        if(_wantsSeaView == true)
        {
           roomPrize = _reservedDays * WITH_SEA_PRIZE;
           return roomPrize;
        }
        else
        {
            roomPrize = _reservedDays * WITHOUT_SEA_PRIZE;
            return roomPrize;
        }
    }
}
