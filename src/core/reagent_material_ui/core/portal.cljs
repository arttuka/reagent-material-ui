(ns reagent-material-ui.core.portal
  "Imports @material-ui/core/Portal as a Reagent component.
   Original documentation is at https://material-ui.com/api/portal/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Portal" :as Portal]))

(def portal (adapt-react-class (or (.-default Portal) (.-Portal Portal)) "mui-portal"))
