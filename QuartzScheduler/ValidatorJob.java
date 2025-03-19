import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


public class ValidatorJob implements Job {

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        //Simulate validations
        System.out.println("Validating duplicate data in the database. "+new Date());
        System.out.println("Deleting records that are more than 10 days old and unused. "+new Date());

    }

}