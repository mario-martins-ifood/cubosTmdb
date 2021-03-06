package com.gutoomota.cuboschallenge.model

import com.squareup.moshi.Json

class MoviesResponse {

    var page: Int = 0
    var results: List<Movie>? = null
    @Json(name = "total_pages")
    var totalPages: Int = 0
    @Json(name = "total_results")
    var totalResults: Int = 0

    override fun toString(): String {
        return "MoviesResponse{" +
                "page=" + page +
                ", results=" + results +
                ", totalPages=" + totalPages +
                ", totalResults=" + totalResults +
                '}'.toString()
    }
}
