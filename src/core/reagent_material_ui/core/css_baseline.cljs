(ns reagent-material-ui.core.css-baseline
  "Imports @material-ui/core/CssBaseline as a Reagent component.
   Original documentation is at https://material-ui.com/api/css-baseline/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/CssBaseline" :as CssBaseline]))

(def css-baseline (adapt-react-class (or (.-default CssBaseline) (.-CssBaseline CssBaseline)) "mui-css-baseline"))
