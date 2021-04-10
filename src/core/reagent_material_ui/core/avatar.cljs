(ns reagent-material-ui.core.avatar
  "Imports @material-ui/core/Avatar as a Reagent component.
   Original documentation is at https://material-ui.com/api/avatar/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Avatar" :as MuiAvatar]))

(def avatar (adapt-react-class (.-default MuiAvatar) "mui-avatar"))
