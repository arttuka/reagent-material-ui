(ns reagent-mui.material.scoped-css-baseline
  "Imports @mui/material/ScopedCssBaseline as a Reagent component.
   Original documentation is at https://mui.com/api/scoped-css-baseline/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/ScopedCssBaseline" :as MuiScopedCssBaseline]))

(def scoped-css-baseline (adapt-react-class (.-default MuiScopedCssBaseline) "mui-scoped-css-baseline"))
