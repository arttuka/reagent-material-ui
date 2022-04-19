(ns reagent-mui.material.global-styles
  "Imports @mui/material/GlobalStyles as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/global-styles/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/GlobalStyles" :as MuiGlobalStyles]))

(def global-styles (adapt-react-class (.-default MuiGlobalStyles) "mui-global-styles"))
