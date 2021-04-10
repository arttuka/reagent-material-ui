(ns reagent-material-ui.lab.rating
  "Imports @material-ui/lab/Rating as a Reagent component.
   Original documentation is at https://material-ui.com/api/rating/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/Rating" :as MuiRating]))

(def rating (adapt-react-class (.-default MuiRating) "mui-rating"))
