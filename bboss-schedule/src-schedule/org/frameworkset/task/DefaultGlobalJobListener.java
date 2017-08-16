/*
 *  Copyright 2008 biaoping.yin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.frameworkset.task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.frameworkset.util.StringUtil;

/**
 * <p>Title: DefaultGlobalJobListener.java</p> 
 * <p>Description: </p>
 * <p>bboss workgroup</p>
 * <p>Copyright (c) 2007</p>
 * @Date 2013-1-27 下午12:29:52
 * @author biaoping.yin
 * @version 1.0
 */
public class DefaultGlobalJobListener extends BaseJobListener {
	private static Logger log = LoggerFactory.getLogger(DefaultJobListener.class);
	
	public DefaultGlobalJobListener() {
		// TODO Auto-generated constructor stub
	}

	

	public void jobExecutionVetoed(JobExecutionContext arg0) {
		log.info("Global job Execution Vetoed:[" + arg0.toString()+"]");
		
	}

	public void jobToBeExecuted(JobExecutionContext arg0) {
		log.info("Global job To Be Executed:[" + arg0.toString()+"]");
		
	}

	public void jobWasExecuted(JobExecutionContext arg0,
			JobExecutionException arg1) {
		if(arg1!=null)
			log.info("Global job Was Executed:耗时"+arg0.getJobRunTime()+" milliseconds,[" + StringUtil.exceptionToString(arg1)+"]");
		else
			log.info("Global job Was Executed:耗时"+arg0.getJobRunTime()+" milliseconds");
	} 

}
