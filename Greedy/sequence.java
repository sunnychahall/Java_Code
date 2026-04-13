import java.util.*;
public class sequence {
    static class Job
    {
        int profit;
        int dead;
        int id;


        public Job(int id, int dead, int profit)
        {
            this.id = id;
            this.profit = profit;
            this.dead = dead;
        }
    }

    public static void main(String[] args) {
        int[][] jobs = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
        
        List<Job> job = new ArrayList<>();

        for (int i = 0; i < jobs.length; i++)
            {
                job.add(new Job(i, jobs[i][0], jobs[i][1]));
            }


        Collections.sort(job, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for (int i = 0; i < job.size(); i++)
            {
                Job curr = job.get(i); 
                if (curr.dead > time)
                    {
                        time++;
                        seq.add(curr.id);
                    }
            }

            System.out.println(seq.size());
    }


}
