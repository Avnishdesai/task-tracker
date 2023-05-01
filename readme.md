https://trello.com/b/8ORrMUx6/task-tracker

docker run --detach -p 3306:3306 --name some-mariadb --env MARIADB_USER=example-user --env MARIADB_PASSWORD=my_cool_secret --env MARIADB_ROOT_PASSWORD=my-secret-pw  mariadb:latest