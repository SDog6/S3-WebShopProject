#base image to be used
FROM node:14.18.2
#select app folder
WORKDIR /Frontend

#RUN npm cache clean --force
#RUN rm -rf node_modules
#copy package.json file to install packages
COPY  package.json ./

#install dependencies
RUN npm install
#RUN npm install audit

#copy source code to image, ignore node_modules because we already installed them
COPY . /Frontend
#set environment
ENV port=3000
#expose port so we can access the app
EXPOSE 3000
#command to start the app , "PORT=0.0.0.0:8080"
CMD ["npm", "start"]