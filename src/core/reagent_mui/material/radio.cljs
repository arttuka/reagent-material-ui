(ns reagent-mui.material.radio
  "Imports @mui/material/Radio as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/radio/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Radio" :as MuiRadio]))

(def radio (adapt-react-class (.-default MuiRadio) "mui-radio"))
