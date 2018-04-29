# Spring boot REST [![Build Status](https://travis-ci.org/alecc08/spring-boot-rest.svg?branch=master)](https://travis-ci.org/alecc08/spring-boot-rest)

## Goal
The goal of this project is simply to play around with Spring Boot and create a small REST Api. Instead of using the spring-boot-starter parent project, I'm using the dependency management section to specify the BOM for spring boot dependencies.

## Prerequisites
 - MongoDB. This project doesn't run an embedded mongodb server. You need to have your own and set the environment variables found in application.properties. You can get a free MongoDB at mlab.com for up to 500mb.

## How to launch
To launch this app, simply run the following command

`mvn spring-boot:run`
