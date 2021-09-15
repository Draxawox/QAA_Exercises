package stuff;

import java.util.*;

public class CollectionsAndBinary {
    public static void main(String[] args) {

    }
}

class Theatre {
    private final String theatreName;
    private Collection<Seat> seats = new LinkedHashSet<>();

    public String getTheatreName() {
        return theatreName;
    }

    Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public boolean reverseSeat(Seat seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
        }
        return requestedSeat.reserve();
    }

    public void setSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat {
        private final String seatNumber;
        private boolean reversed = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve() {
            if (!this.reversed) {
                this.reversed = true;
                System.out.println("Seat " + seatNumber + " reversed");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if (this.reversed) {
                this.reversed = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
