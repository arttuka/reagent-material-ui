(ns reagent-material-ui.core.rating
  "Imports @material-ui/core/Rating as a Reagent component.
   Original documentation is at https://material-ui.com/api/rating/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Rating" :as MuiRating]))

(def rating (adapt-react-class (or (.-default MuiRating) (.-Rating MuiRating)) "mui-rating"))
