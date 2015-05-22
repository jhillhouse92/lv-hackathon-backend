#!/bin/bash

mongoimport --db ptsd --collection posts --drop posts.json
mongoimport --db ptsd --collection users --drop users.json
mongoimport --db ptsd --collection comments --drop comments.json
