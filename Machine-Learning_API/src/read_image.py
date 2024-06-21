from PIL import Image
from io import BytesIO

async def read_image(content: bytes) -> Image.Image:
    image = Image.open(BytesIO(content))
    return image
