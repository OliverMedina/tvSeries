/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.tvseries.data


import com.example.affirmations.model.Serie
import com.example.tvseries.R

/**
 * [Datasource] generates a list of [Serie]
 */
class Datasource() {
  fun loadSeries(): List<Serie> {
       return listOf<Serie>(
           Serie(R.string.serie1, R.drawable.image1),
           Serie(R.string.serie2, R.drawable.image2),
           Serie(R.string.serie3, R.drawable.image3),
           Serie(R.string.serie4, R.drawable.image4),
           Serie(R.string.serie5, R.drawable.image5),
           Serie(R.string.serie6, R.drawable.image6),
           Serie(R.string.serie7, R.drawable.image7),
           Serie(R.string.serie8, R.drawable.image8),
           Serie(R.string.serie9, R.drawable.image9),
           Serie(R.string.serie10, R.drawable.image10))
   }
}
