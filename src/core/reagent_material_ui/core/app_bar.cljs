(ns reagent-material-ui.core.app-bar
  "Imports @material-ui/core/AppBar as a Reagent component.
   Original documentation is at https://material-ui.com/api/app-bar/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/AppBar" :as AppBar]))

(def app-bar (adapt-react-class (or (.-default AppBar) (.-AppBar AppBar)) "mui-app-bar"))
