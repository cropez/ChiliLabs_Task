package network

data class GiphyResponse(
    val data: List<GifItem>,
    val pagination: Pagination
)

data class GifItem(
    val id: String,
    val images: GifImages
)

data class GifImages(
    val original: GifImage
)

data class GifImage(
    val url: String
)

data class Pagination(
    val offset: Int,
    val total_count: Int
)
