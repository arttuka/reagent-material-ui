(ns reagent-mui.material.scoped-css-baseline
  "Imports @mui/material/ScopedCssBaseline as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/scoped-css-baseline/ ."
  (:require [reagent.core :as r]
            ["@mui/material/ScopedCssBaseline" :as MuiScopedCssBaseline]))

(def scoped-css-baseline (r/adapt-react-class (.-default MuiScopedCssBaseline)))
