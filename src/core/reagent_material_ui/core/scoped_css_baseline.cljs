(ns reagent-material-ui.core.scoped-css-baseline
  "Imports @material-ui/core/ScopedCssBaseline as a Reagent component.
   Original documentation is at https://material-ui.com/api/scoped-css-baseline/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/ScopedCssBaseline" :as ScopedCssBaseline]))

(def scoped-css-baseline (adapt-react-class (or (.-default ScopedCssBaseline) (.-ScopedCssBaseline ScopedCssBaseline)) "mui-scoped-css-baseline"))
