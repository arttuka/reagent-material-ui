(ns reagent-mui.material.rating
  "Imports @mui/material/Rating as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/rating/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Rating" :as MuiRating]))

(def rating (r/adapt-react-class (.-default MuiRating)))
