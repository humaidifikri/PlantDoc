import numpy as np
from tensorflow.keras.models import load_model
from keras_preprocessing.image import img_to_array
from PIL import Image
from tensorflow.keras.layers import Resizing

def predict_images(image: Image.Image):
    # Path to the local model file
    model_path = "models/pepperbell_model.h5"
    
    # Load the model from the local path with custom objects
    model = load_model(model_path, compile=False, custom_objects={'Resizing': Resizing})

    image_to_array = img_to_array(image.resize((256, 256)))
    print(image_to_array.shape)
    image_preprocess = np.expand_dims(image_to_array, 0)
    image_preprocess = np.vstack([image_preprocess])
    print(f"Byte index 0 : {image_preprocess[-1, 0, 0]}")

    prediction: list = list(model.predict(image_preprocess, 10)[0])

    print(f"result prediction : {prediction}")
    max_index = prediction.index(max(prediction))

    label = ["Healthy", "Xanthomonas campestris pv. vesicatoria"]
    result = label[max_index]

    print(f"Result :  {result}")

    return {"result": result}