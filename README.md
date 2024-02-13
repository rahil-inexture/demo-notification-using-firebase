# demo-notification-using-firebase

POST Request: Sending Notification

Endpoint
http://localhost:8080/notification

cURL

curl --location 'http://localhost:8080/notification' \
--header 'Content-Type: application/json' \
--data '{
"title": "Your title here",
"body": "Your notification body here",
"topic": "Your topic here",
"token": "Your token here"
}'

Request Body

{
    "title": "Your title here",
    "body": "Your notification body here",
    "topic": "Your topic here",
    "token": "Your token here"
}

Response:
{
    "status": "200",
    "message": "Notification has been sent"
}