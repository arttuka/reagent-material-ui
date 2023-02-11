(ns reagent-mui.material.hidden
  "Imports @mui/material/Hidden as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/hidden/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Hidden" :as MuiHidden]))

(def hidden (r/adapt-react-class (.-default MuiHidden)))
