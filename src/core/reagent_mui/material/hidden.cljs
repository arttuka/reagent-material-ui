(ns reagent-mui.material.hidden
  "Imports @mui/material/Hidden as a Reagent component.
   Original documentation is at https://mui.com/api/hidden/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Hidden" :as MuiHidden]))

(def hidden (adapt-react-class (.-default MuiHidden) "mui-hidden"))
