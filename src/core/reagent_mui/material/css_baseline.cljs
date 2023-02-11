(ns reagent-mui.material.css-baseline
  "Imports @mui/material/CssBaseline as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/css-baseline/ ."
  (:require [reagent.core :as r]
            ["@mui/material/CssBaseline" :as MuiCssBaseline]))

(def css-baseline (r/adapt-react-class (.-default MuiCssBaseline)))
