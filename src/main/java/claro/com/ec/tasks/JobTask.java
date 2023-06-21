package claro.com.ec.tasks;



import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobTask {
	
	@Autowired
	private JobLauncher jobLauncher;
	@Autowired
	private Job job;
	
	private static final Logger LOG = LoggerFactory.getLogger(JobTask.class);
	//fixedRate ejeucta cada  5 segundos
	// fixedDelay  ejecuta cada 5 segundos cuando se haya terminardo de ejecutar el proceso anterior
	@Scheduled(fixedRate=6000)  // 
	public void executeJob() throws Exception{
		LOG.info("Inicio prueba" +new Date());
		JobParameters jobParameter = new JobParametersBuilder()
				.addString("JobID", String.valueOf(System.currentTimeMillis())).toJobParameters();
		jobLauncher.run(job, jobParameter);
	}

}
