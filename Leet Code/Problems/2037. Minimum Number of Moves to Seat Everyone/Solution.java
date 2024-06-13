class Solution
{
    public int minMovesToSeat(int[] seats, int[] students)
    {
        PriorityQueue<Integer> seat = new PriorityQueue<>(Arrays.stream(seats).boxed().sorted().collect(Collectors.toList()));
        PriorityQueue<Integer> student = new PriorityQueue<>(Arrays.stream(students).boxed().sorted().collect(Collectors.toList()));
        int moves=0;
        for(;!seat.isEmpty();moves+=Math.abs(seat.poll()-student.poll()));
        return moves;
    }
}
