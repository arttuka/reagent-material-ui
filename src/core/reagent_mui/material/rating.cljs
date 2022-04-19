(ns reagent-mui.material.rating
  "Imports @mui/material/Rating as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/rating/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Rating" :as MuiRating]))

(def rating (adapt-react-class (.-default MuiRating) "mui-rating"))
