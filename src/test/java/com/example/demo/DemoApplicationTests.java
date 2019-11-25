package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private JobLauncher jobLauncher;
    @Autowired
    private Job job;

    @Test
    public void contextLoads() {
        try{
            jobLauncher.run(job, new JobParameters());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
