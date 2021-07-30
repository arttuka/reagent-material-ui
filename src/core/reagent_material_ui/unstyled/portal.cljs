(ns reagent-material-ui.unstyled.portal
  "Imports @material-ui/unstyled/Portal as a Reagent component.
   Original documentation is at https://material-ui.com/api/portal/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/unstyled/Portal" :as MuiPortal]))

(def portal (adapt-react-class (.-default MuiPortal) "mui-portal"))
