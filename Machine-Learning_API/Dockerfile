# Gunakan image Python sebagai base image
FROM python:3.10.3-slim-buster

# Set working directory
WORKDIR /app

# Copy seluruh kode ke working directory
COPY . .

# Update paket dan install unzip
RUN apt-get update && apt-get install -y unzip

# Install gdown untuk mendownload file dari Google Drive
RUN pip install gdown

# Download dan unzip model
RUN gdown 1L3zBe8W1mKXgjFLN3ZwsJz3rHOJ7YtN4 && \
    unzip model-v2.zip && \
    rm model-v2.zip

# Install dependencies dari requirements.txt
RUN pip install --no-cache-dir -r requirements.txt

# Set environment variable
ENV PYTHONUNBUFFERED True

# Ekspose port yang digunakan oleh FastAPI
EXPOSE 8080

# Perintah untuk menjalankan aplikasi
CMD ["uvicorn", "main:app", "--host", "0.0.0.0", "--port", "8080"]
