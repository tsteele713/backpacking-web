# migration-status-service

Method: GET

Endpoint: /MygrateJobStatusService/rest/jobStatus/status

Query Params: seqId

Description: Gets the migration status information for a specific migration, based on the seqId (unique id)

--------------------------------------------------------------------------------------------------------------------------------------------

Method: POST

Endpoint: /MygrateJobStatusService/rest/jobStatus/status

Body: 

{
    "userId":"1234456",
    "orgId":"some organization"
}

Description: Creates a new Migration status based on User ID and Org ID

--------------------------------------------------------------------------------------------------------------------------------------------

Method: DELETE

Endpoint: /MygrateJobStatusService/rest/jobStatus/status

Description: Deletes all statuses older than 30 days

--------------------------------------------------------------------------------------------------------------------------------------------


Method: POST

Endpoint: /MygrateJobStatusService/rest/jobStatus/updateStatus

Body: 

{
    "seqId": "99482902789619716"
}

Description: Updates a particular migration status to COMPLETED

--------------------------------------------------------------------------------------------------------------------------------------------

Method: POST

Endpoint: /MygrateJobStatusService/rest/jobStatus/allMigrations

Body:

{
    "orgId": "orgID",
    "userId": "userId"
}

Description: Retrieves all migrations for a particular User ID and Org ID
