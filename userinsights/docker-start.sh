docker rm user_insights
docker build -t user_insights:latest .
docker run -p 8081:8080 --name user_insights user_insights:latest