@Composable
fun CustomCard(cardSize: Dp) {
    Box(modifier = Modifier.size(cardSize)) {
        Canvas(modifier = Modifier.fillMaxSize()) {

            val height = size.height
            val width = size.width

            val customCardPath = Path().apply {
                moveTo(width * 0.1f, 0.0f)
                quadraticBezierTo(
                    0f, 0f,
                    0f, height * 0.1f
                )
                lineTo(0f, height * 0.9f)
                quadraticBezierTo(
                    0f, height,
                    width * 0.1f, height
                )
                lineTo(width * 0.65f, height)
                quadraticBezierTo(
                    width * 0.76f, height,
                    width * 0.75f, height * 0.9f
                )
                quadraticBezierTo(
                    width * 0.75f, height * 0.75f,
                    width * 0.9f, height * 0.75f
                )
                quadraticBezierTo(
                    width, height * 0.75f,
                    width, height * 0.66f
                )
                lineTo(
                    width, height * 0.1f
                )
                quadraticBezierTo(
                    width, 0f,
                    width * 0.9f, 0f
                )
                lineTo(
                    width * 0.9f, 0f
                )
                close()
            }
            clipPath(
                customCardPath
            ) {
                drawRect(
                    color = Color.Gray,
                    size = size
                )
            }
        }
        IconButton(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .background(Color.Gray, MaterialTheme.shapes.extraLarge)
                .size(cardSize * 0.22f),
            onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.Add, contentDescription = null)
        }
    }

}