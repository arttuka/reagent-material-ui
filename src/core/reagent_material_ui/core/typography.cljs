(ns reagent-material-ui.core.typography
  "Imports @material-ui/core/Typography as a Reagent component.
   Original documentation is at https://material-ui.com/api/typography/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Typography" :as Typography]))

(def typography (adapt-react-class (or (.-default Typography) (.-Typography Typography)) "mui-typography"))
