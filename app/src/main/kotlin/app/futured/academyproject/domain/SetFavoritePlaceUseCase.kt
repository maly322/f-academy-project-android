package app.futured.academyproject.domain

// TODO Step 6 - Create UseCase to set favorite place
// Hint : Use "uc" live template to create use case
// Named it SetFavoritePlaceUseCase
// Args: Place ID (Int)
// Result: Unit
// Inject PlacesPersistence and use its method/s you have created before

import app.futured.academyproject.data.persistence.PlacesPersistence
import app.futured.arkitekt.crusecases.UseCase
import javax.inject.Inject

class SetFavoritePlaceUseCase @Inject constructor(val placesPersistence: PlacesPersistence) : UseCase<Int,Unit >() {

    override suspend fun build(args: Int): Unit  {
        return placesPersistence.setPlaceIds(listOf(args))
    }
}
