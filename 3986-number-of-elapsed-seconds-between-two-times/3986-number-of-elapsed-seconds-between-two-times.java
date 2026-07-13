class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String part1[]=startTime.split(":");
         String part2[]=endTime.split(":");

         int totaltime1=Integer.parseInt(part1[0])*3600+ Integer.parseInt(part1[1])*60+Integer.parseInt(part1[2]);
         int totaltime2=Integer.parseInt(part2[0])*3600+ Integer.parseInt(part2[1])*60+Integer.parseInt(part2[2]);

         int total=Math.abs(totaltime1-totaltime2);
         return total;
    }
}