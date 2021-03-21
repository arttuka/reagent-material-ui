(ns reagent-material-ui.core.typography
  "Imports @material-ui/core/Typography as a Reagent component.
   Original documentation is at https://material-ui.com/api/typography/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Typography" :as MuiTypography]))

(def typography (adapt-react-class (.-default MuiTypography) "mui-typography"))
