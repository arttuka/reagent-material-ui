(ns reagent-material-ui.core.scoped-css-baseline
  "Imports @material-ui/core/ScopedCssBaseline as a Reagent component.
   Original documentation is at https://material-ui.com/api/scoped-css-baseline/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def scoped-css-baseline (adapt-react-class (.-ScopedCssBaseline js/MaterialUI) "mui-scoped-css-baseline"))
