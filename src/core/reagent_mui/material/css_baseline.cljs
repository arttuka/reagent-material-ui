(ns reagent-mui.material.css-baseline
  "Imports @mui/material/CssBaseline as a Reagent component.
   Original documentation is at https://mui.com/api/css-baseline/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/CssBaseline" :as MuiCssBaseline]))

(def css-baseline (adapt-react-class (.-default MuiCssBaseline) "mui-css-baseline"))
