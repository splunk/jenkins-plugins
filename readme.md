# jenkins-plugins
customized plugins

Extended Features:

Build test aggregator:

--  recursively presents test results for multi-layers triggers structure

--  give a trigger level test trend reports

--  job level summary(success/failed/aborted jbos) in test results jelly report

--  using specified trigger parameter instead of actual job name in test results to differentiate between builds from the same job triggered by different triggers

Build flow plugin:

-- We are using triggers with parameters to kick off builds. In console output, we use some specified parameters to clarify which trigger actually triggers the job.

-- use 'retry_if_no_test_results' to rerun buils which does not deliver any test results.

s3 plugin:
